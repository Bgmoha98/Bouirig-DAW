import React, { useContext, useEffect} from 'react';
import PersonaContext from "./PersonaContext";
import { useNavigate } from "react-router-dom";

const Personas = () => {
  // const [personas, setPersonas] = useState([]);
  const {personas, setPersonas, contador, incrementarContador} = useContext(PersonaContext)
  let navigate = useNavigate()

  useEffect(() => { personas.length > 0
    && setPersonas([...personas, {id: contador, name: "Mohamed", username: "mbg98", email: "moha98@correus.com"}] )
    incrementarContador(contador)
    navigate("/nosotros")
  }, [])
  

  return (
    <div>
      {/* <h1>Lista de Personas</h1>
      <ul>
        {
        personas.length > 0 ?
        personas.map(persona => (
          <li key={persona.id}>PERSONA {persona.id}: {persona.name} - {persona.email} </li>
        ))
        : "Sin datos"}
      </ul>
       */}
    </div>
  );
};

export default Personas;
