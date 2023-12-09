import  Nav  from './components/nav'
import  Login from './components/login'
import Counter from './components/counter'
import Users from './components/users'
import Register from './components/register'
import Logout from './components/logout'
import PageNotFound from './components/pagenotfound'
import { BrowserRouter, Routes, Route } from "react-router-dom";
import './App.css'
import React, { useState } from 'react';
import Dashboard from './components/dashboard'



function App() {

  const [user, setUser] = useState(null);

  const updateUserState = (newState) => {
    setUser(newState);
  }
  
  return (
    <React.Fragment>
       <BrowserRouter>
      <Nav user={user}/>
      <Routes>
        <Route path='' element={<Users />} />,
        <Route path='users' element={<Users />} />,
        <Route path='login' element={<Login updateUserState={updateUserState} />} />,
        <Route path='counter' element={<Counter />} />,
        <Route path="*" element={<PageNotFound />} />,
        <Route path='register' element={<Register />} />,
        <Route path='logout' element={<Logout updateUserState={updateUserState}/>} />,
        <Route path='dashboard' element={<Dashboard />} />,
      </Routes>
    </BrowserRouter>
    </React.Fragment >
  )
}

export default App
