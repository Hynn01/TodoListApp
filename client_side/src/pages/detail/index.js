import React, {Component} from 'react'
import { Container, Row,Col,List, FormControl, InputGroup, ListGroup,Button } from 'react-bootstrap'
import axios from 'axios';

class Detail extends Component{

    constructor(props){
        super(props)
        this.state={
            belongedtodolistname:"",
            todoitem:{description:""},
            inputdescription:"",
        }
    }

    componentWillMount(){
        this.getDescription(this.props.location.query.todoitem.name)
    }

    render(){
        return(
        <div className="rootpage clearfix">
            <div className="center">
                <div className="detailBox">
                    <div>Todo List: {this.props.location.query.belongedtodolist}</div>
                    <div><h3>{this.props.location.query.todoitem.name}</h3></div>
                    <div>Status: {this.props.location.query.todoitem.status?"Done":"Unfinished"}</div>
                    <div>Date: {this.props.location.query.todoitem.day+"/"+(this.props.location.query.todoitem.month+1).toString()+"/"+this.props.location.query.todoitem.year.toString()}</div>
                    <div>Description</div>
                        <InputGroup>
                            <FormControl
                                placeholder="Description"
                                onChange={event=>{
                                    this.setState({
                                        inputdescription:event.target.value
                                    })
                                }}
                            />
                            <InputGroup.Append>
                                <Button variant="outline-secondary" onClick={this.postDescription.bind(this)}>Update</Button>
                            </InputGroup.Append>
                        </InputGroup>
                        <div className="descriptionBox">
                            {this.state.todoitem.description}
                        </div>                   
                </div>
            </div>
        </div>
        )
    }

    postDescription(){
        const _this=this;
        axios.post("/ToDoListApp/RDescription",{
            "tdlistname":this.props.location.query.belongedtodolist,
            "tditemname":this.props.location.query.todoitem.name,
            "description":_this.state.inputdescription
        }).then(res=>{
            console.log("postDescription success");
        }).catch(err=>{
            console.log("postDescription fail");
        })     
        this.getDescription(this.props.location.query.todoitem.name);   
    }

    getDescription(tditemname){
        const _this=this;
        axios.post("/ToDoListApp/getRDescription",{
            "tdlistname":this.props.location.query.belongedtodolist,
            "tditemname":tditemname
        }).then(res=>{
            console.log("getDescription success");
            let temp=this.props.location.query.todoitem;
            temp.description=res.data.description;
            _this.setState({
                todoitem:temp
            });
        }).catch(err=>{
            console.log("getDescription fail");
        })
    }
}

export default Detail

