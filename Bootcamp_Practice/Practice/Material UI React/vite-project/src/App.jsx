import React from 'react'
import Nav from './components/nav'
import { Routes, Route } from 'react-router-dom'
import Home from './components/home';
import Counter from './components/counter';

function App() {
  return (
    <>
      <Nav />
      <Routes>
        <Route path="/" element={<Home />} />,
        <Route path="/counter" element={<Counter />} />,
      </Routes>
    </>
  )
}

export default App