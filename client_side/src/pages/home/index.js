import React, {Component } from 'react'
import { Container, Row,Col,List, FormControl, InputGroup, ListGroup,Button } from 'react-bootstrap'
import DayPickerInput from 'react-day-picker/DayPickerInput';
import 'react-day-picker/lib/style.css';
import MomentLocaleUtils, {
    formatDate,
    parseDate,
  } from 'react-day-picker/moment';
import store from '../../store/';
import axios from 'axios';
import {Link} from 'react-router-dom';
// import DatePicker from 'react-datepicker';
import {List as ListIcon, X} from 'react-bootstrap-icons';



class Home extends Component{

    constructor(props){
        super(props);
        this.state={
            username:"",
            inputtodolistname:"",
            inputtodoitemname:"",            
            todolists:[],
            curtodolist:{name:""},
            curtodoitems:[],
            startDate:new Date()
        };
        // this.state=store.getState();
    }

    componentWillMount(){
        if(this.props.location.query!=null){
            this.setState({
                username:this.props.location.query.username,
            })
        }else{
            this.getCurrentUser()
        }
    }

    componentDidMount(){
      this.getTodoLists()
    }

    render(){
        return (
            <Container fluid className="container-fluid">
                <Row className="page">
                    <Col sm={4} className="col-left col-border">
                        <Row className="username">
                        <Col sm={9}>
                            Username: {this.state.username}
                        </Col>
                        <Col sm={3}>
                            <Button size="sm" variant="outline-secondary" onClick={this.handleLogout.bind(this)}>Log Out</Button>
                        </Col>
                        </Row>
                        <div className="title">Todo Lists</div>
                        <InputGroup className="input">
                            <FormControl
                                placeholder="Todo List"
                                onChange={event=>{
                                    this.setState({
                                        inputtodolistname:event.target.value
                                    });
                                }}
                            />
                            <InputGroup.Append>
                                <Button variant="outline-secondary" onClick={this.addTodoList.bind(this,this.state.inputtodolistname)}>Add</Button>
                            </InputGroup.Append>
                        </InputGroup>
                        <ListGroup>
                            {this.state.todolists.map((todolist,index)=>{
                               return <ListGroup.Item className={this.state.curtodolist.name==todolist.name?"focusedlist":"list"}>
                                   <Row>
                                        <Col sm={10} onClick={this.clickTodoList.bind(this,todolist.name,index)}>
                                            <ListIcon className="listIcon"/>{todolist.name}
                                        </Col>
                                        <Col sm={2}>
                                            <Button size="sm" variant="outline-secondary" className="delete" onClick={this.deleteTodoList.bind(this,todolist.name)}>
                                            <X />
                                            </Button>
                                        </Col>
                                   </Row>
                                   </ListGroup.Item>
                            })}
                        </ListGroup>
                    </Col>
                    <Col sm={8} className="col-border">
                        <Row className="itemTitle">
                            <Col sm={10}>Todo Items</Col>
                            <Col sm={2}><Button size="sm" onClick={this.sortTodoItems.bind(this)}>Sort By Title</Button></Col>
                        </Row>
                        <InputGroup className="input">
                            <FormControl
                                placeholder="Todo Item"
                                onChange={event=>{
                                    this.setState({
                                        inputtodoitemname:event.target.value
                                    })
                                }}
                            />
                            <InputGroup.Append>
                                <Button variant="outline-secondary" onClick={this.addTodoItem.bind(this)}>Add</Button>
                            </InputGroup.Append>
                        </InputGroup>
                        <ListGroup>
                            {this.state.curtodoitems.map((todoitem,index)=>{
                                return (<ListGroup.Item>
                                    <Row>
                                        <Col sm={1.5}>
                                            <input type="checkbox" className="checkbox" checked={todoitem.status} onChange={this.statusChange.bind(this,index)}/>
                                            {/* <input type="checkbox" className="checkbox" onChange={this.statusChange(index)}/> */}
                                        </Col>
                                        <Col sm>
                                            <div className={todoitem.status?"itemDoneText":"itemText"}>{todoitem.name}</div>
                                        </Col>
                                        <Col sm={3}>
                                        {/* <DatePicker selected={new Date(todoitem.year,todoitem.month,todoitem.day)} onChange={date=>this.setDueDate(date,index)} /> */}
                                        <DayPickerInput formatDate={formatDate}
                                            parseDate={parseDate}
                                            placeholder={`${formatDate(new Date())}`} 
                                            onDayChange={day => this.setDueDate(day,index)}
                                            value={new Date(todoitem.year,todoitem.month,todoitem.day)} />
                                        </Col>
                                        <Col sm={2}>
                                            <Link to={{pathname:"/detail",query:{belongedtodolist:this.state.curtodolist.name,todoitem:todoitem}}}>
                                            <Button size="sm">Detail</Button>
                                            </Link>
                                        </Col>
                                        <Col sm={1}>
                                            <Button variant="outline-secondary" size="sm" className="delete" onClick={this.deleteTodoItem.bind(this,todoitem.name)}>
                                            <X />
                                            </Button>
                                        </Col>
                                    </Row>                          
                                    </ListGroup.Item>)
                                })}
                        </ListGroup>
                    </Col>
                </Row>
            </Container>
        )
    }

    sortTodoItems(){
        this.setState({
            curtodoitems:this.state.curtodoitems.sort((a,b)=>{return a.name-b.name})
        })
    }

    clickTodoList(tdlistname,index){
        this.setState({
            curtodolist:this.state.todolists[index]
        })
        this.getTodoItems(tdlistname);
    }

    statusChange(index){

        axios.post("/ToDoListApp/Status",{
            tdlistname:this.state.curtodolist.name,
            tditemname:this.state.curtodoitems[index].name,
            status:!this.state.curtodoitems[index].status,
        }).then(res=>{
            this.getTodoItems(this.state.curtodolist.name);
            console.log("statusChange success");
        }).catch(err=>{
            console.log("statusChange fail");
        })
    }

    setDueDate(date,index){
        axios.post("/ToDoListApp/Date",{
            tdlistname:this.state.curtodolist.name,
            tditemname:this.state.curtodoitems[index].name,
            date:date.getDate().toString()+"/"+(date.getMonth()+1).toString()+"/"+(date.getYear()+1900).toString(),
        }).then(res=>{
            this.getTodoItems(this.state.curtodolist.name);
            console.log("setDueDate success");
        }).catch(err=>{
            console.log("setDueDate fail");
        })        
    }

    handleLogout(){
        axios.post('/ToDoListApp/logoutService',{

        }).then(res=>{
            this.props.history.push("/")
            console.log("handleLogout success");
        }).catch(err=>{
            console.log("handleLogout fail");
        })
    }

    getCurrentUser(){
        axios.get("/ToDoListApp/User",{

        }).then(res=>{
            this.setState({
                username:res.data.username
            });
            console.log("getCurrentUser success");
        }).catch(err=>{
            console.log("getCurrentUser fail");
        })
    }

    addTodoList(name){
        axios.post('/ToDoListApp/TodoList',{
            "name":name
        }).then(res=>{
            this.getTodoLists();
            console.log("addTodoList success");
        }).catch(err=>{
            console.log("addTodoList fail");
        })
    }

   getTodoLists(){
      const _this=this;
      axios.get("/ToDoListApp/TodoList",{

      }).then(res=>{
         // const data=res.data
         // const action=initListAction(data);
         // store.dispatch(action);

         _this.setState({
               todolists:res.data
         });
         console.log("getTodoLists success");

      }).catch(err=>{
         console.log("getTodoLists fail");          
      })
   }

   deleteTodoList(tododlistname){
        const _this=this;
        axios.post("/ToDoListApp/deleteTodoList",{
            "tdlistname":tododlistname
        }).then(res=>{
            this.getTodoLists();
            console.log("deleteTodoList success");
        }).catch(err=>{
            console.log("deleteTodoList fail");
        })
    }


    addTodoItem(){
        const _this=this;
        axios.post("/ToDoListApp/TodoItem",{
            "tdlistname":_this.state.curtodolist.name,
            "tditemname":_this.state.inputtodoitemname
        }).then(res=>{
            console.log("addTodoItem success");
            this.getTodoItems(_this.state.curtodolist.name);
        }).catch(err=>{
            console.log("addTodoItem fail");
        })
        
    }

    getTodoItems(tdlistname){
        const _this=this;
        axios.post("/ToDoListApp/getTodoItem",{
            "tdlistname":tdlistname
        }).then(res=>{
            _this.setState({
                curtodoitems:res.data,
            });
            console.log("getTodoItems success");
        }).catch(err=>{
            console.log("getTodoItems fail");
        })
    }

    deleteTodoItem(todoitemname){
        const _this=this;
        axios.post("/ToDoListApp/deleteTodoItem",{
            "tdlistname":_this.state.curtodolist.name,
            "tditemname":todoitemname
        }).then(res=>{
            this.getTodoItems(_this.state.curtodolist.name);
            console.log("deleteTodoItem success");
        }).catch(err=>{
            console.log("deleteTodoItem fail");
        })
    }


}

export default Home;