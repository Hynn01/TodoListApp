import React, {Component} from 'react';
import { Form, Button, Row, Col } from 'react-bootstrap';
import axios from 'axios';
import {Link,Redirect} from 'react-router-dom';

class Login extends Component{

    constructor(props){
        super(props);
        this.state={
            loginusername:"",
            loginpassword:"",
            regusername:"",
            regpassword:""
        }
    }

    render(){
        return (
            <div className="rootpage clearfix">
            <div className="center">
                <h2 className="nomargin center">Welcome to ToDoList App</h2>

                <div className="loginBox">
                <h3 className="center loginTitle">Login</h3>
                <Form>
                    <Form.Group>
                        <Row>
                            <Col><Form.Label>Username</Form.Label></Col>
                            <Col><Form.Control 
                            placeholder="Enter Username" onChange={event=>{this.setState({
                            loginusername:event.target.value})}} />
                            </Col>
                        </Row>
                    </Form.Group>

                    <Form.Group controlId="formBasicPassword">
                        <Row>
                            <Col><Form.Label>Password</Form.Label></Col>
                            <Col><Form.Control type="password" placeholder="Password" onChange={event=>{this.setState({
                            loginpassword:event.target.value})}}/></Col>
                        </Row>
                        
                    </Form.Group>
                    <Button variant="primary" onClick={this.handleLogin.bind(this)}>
                        Submit
                    </Button>
                </Form>
                </div>
                
                <div className="loginBox">
                <h3 className="center loginTitle">Registration</h3>
                <Form>
                    <Form.Group>
                         <Row>
                            <Col><Form.Label>Username</Form.Label></Col>
                            <Col><Form.Control placeholder="Enter Username" onChange={event=>{this.setState({
                            regusername:event.target.value})}}/></Col>
                        </Row>
                    </Form.Group>

                    <Form.Group controlId="formBasicPassword">
                        <Row>
                            <Col><Form.Label>Password</Form.Label></Col>
                            <Col><Form.Control type="password" placeholder="Password" onChange={event=>{this.setState({
                            regpassword:event.target.value})}}/></Col>
                        </Row>
                        
                    </Form.Group>
                    {/* <Button variant="primary" type="submit"> */}
                    <Button variant="primary" onClick={this.handleRegistration.bind(this)}>
                        Submit
                    </Button>
                </Form>
                </div>
            </div>
            </div>
        )
    }

    handleLogin(){
        axios.post('/ToDoListApp/loginService',{
            "username":this.state.loginusername,
            "password":this.state.loginpassword
        }).then(res=>{
            console.log(res);
            if(res.data.message=="ok"){
                console.log("handleLogin success");
                this.props.history.push({pathname:"/home",query:{username:this.state.loginusername}})
            }else{
                alert("Login Failed!");
            }

        }).catch(err=>{
            console.log(err);
            alert("Login Failed!");
        })
    }

    handleRegistration(){
        axios.post('/ToDoListApp/registartionService',{
            "username":this.state.regusername,
            "password":this.state.regpassword
        }).then(res=>{
            console.log("handleRegistration success");
            alert("Registration Success!");
        }).catch(err=>{
            console.log(err);
            alert("Registration Failed!");
        })
    }
}

export default Login;