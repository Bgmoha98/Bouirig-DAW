import { useState } from 'react'
import { BrowserRouter, Route, Routes } from "react-router-dom";
import './App.css'
import Navbar from "./components/Navbar";
import Personas from "./components/Personas";
import Nosotros from "./components/Nosotros";
import Contacto from "./components/Contacto";
import ProvaMap from "./components/ProvaMap";
import TarjetaProductoContainer from "./components/TarjetaProductoContainer";
import TarjetaProducto from "./components/TarjetaProducto/TarjetaProducto";
import PersonaProvide from "./components/PersonaProvide";


function App() {

  return (
    <>
      <BrowserRouter>
        <PersonaProvide>
          <Navbar />
          {/* <TarjetaProductoContainer/> */}
          {/* <ProvaMap/> */}
          <Routes>
            <Route path="/" element={<Personas />}/>
            <Route path="/nosotros/:nombre?" element={<Nosotros />}/>
            <Route path="/personas" element={<Personas />}/>
            <Route path="/contacto" element={<Contacto nombre={"Mohamed"} correo={"moha12@pepitos.com"} comentario={"HOMBRE"} />}/>
            {/* <Route path="/contacto/:id/:ciclo?/:pepe?" element={<Inicio />}/> */}
          </Routes>
        </PersonaProvide>
      </BrowserRouter>
    </>
  )
}

export default App
