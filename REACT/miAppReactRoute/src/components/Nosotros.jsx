import React, {useContext}from 'react'
import { useParams } from "react-router-dom";
import PersonaContext from "./PersonaContext";


const Nosotros = () => {
    const {nombre = "Mohamed"} = useParams()
    const {personas} = useContext(PersonaContext)
  return (
    <>
      <div>{nombre}</div>
      <div>
      <h1>Lista de Personas</h1>
      <ul>
        {personas.map(persona => (
          <li key={persona.id}>PERSONA {persona.id}: {persona.name} - {persona.email}</li>
        ))}
      </ul>
    </div>
    </>
  )
}

export default Nosotros