import React,{Component} from 'react';
// import {Provider} from 'react-redux';
import {BrowserRouter,Route} from 'react-router-dom';
import Home from './pages/home'
import Login from './pages/login'
import Detail from './pages/detail'

import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';

class App extends Component{

  render(){
    return (
      // <Provider store={store}>
      <BrowserRouter>
        <div>
          <Route path='/home' exact component={Home}></Route>
          <Route path='/' exact component={Login}></Route>
          <Route path='/detail' exact component={Detail}></Route>
        </div>
      </BrowserRouter>
      // </Provider>
    )
  }
}

export default App;
