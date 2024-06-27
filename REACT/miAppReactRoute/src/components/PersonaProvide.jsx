import React, {useState, useEffect} from "react"
import { obtenerPersonas } from "../helpers/rebreInformacio.js";
import PersonaContext from "./PersonaContext";


const PersonaProvide = ({children}) => {
    const [personas, setPersonas] = useState([])
    const [contador, setContador] = useState(-1)

    const incrementarContador = () =>{
        setContador(contador + 1)
    }

    useEffect(() => {
      obtenerPersonas()
        .then(datos => {
            setPersonas(datos) 
            setContador(datos.length + 1)
            console.log(personas)
        })
      
    }, [])
    
  return (
    <PersonaContext.Provider value={{personas, setPersonas, contador, incrementarContador}}>
      {children}
    </PersonaContext.Provider>

  )
}
export default PersonaProvide