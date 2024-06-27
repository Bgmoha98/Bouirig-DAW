import React, {useState, useEffect} from "react";
import { rebreInformacio } from "../helpers/rebreInformacio.js";

const TarjetaProductoContainer = () => {
  // const data = rebreInformacio()
  const [contador, setContador] = useState(0);
  const [info, setInfo] = useState({});

 

  useEffect(() => {
    const dades = async ()=> {

      const dades = await rebreInformacio()
      setInfo(dades)
    }
    console.log(info);
    dades()
  }, [])
  
  
  
  const incrementar = () => setContador(contador + 1);
  return (
    <>
      <p> {contador}</p>
      <button onClick={incrementar}> click </button>

      <p>{ info.length > 0 
        ? JSON.stringify(info) 
        : <img src="/src/components/TarjetaProducto/cargando.gif" alt="CARGANDO" />}
      </p>
    </>
  );
};

export default TarjetaProductoContainer;
