import React, { useState } from "react";
// import {  decrementar, reset, handleChange } from "../helpers/contador.js";
import BotonIncrementar from "../components/BotonIncrementar";
import BotonDecrementar from "../components/BotonDecrementar";
import BotonReset from "..//components/BotonReset";

const Contador = ({ inici }) => {
  const [contador, setContador] = useState(inici);
  const [valor, setValor] = useState(inici);

  const incrementar = (valor) => {
    setContador(contador + valor);
  };
  const decrementar = (valor) => {
    setContador(contador - valor);
  };

  const reset = () => {
    setContador(0);
  };

  const handleChange = ({ target }) => {
    setValor(parseInt(target.value));
  };

  return (
    <>
      <div>Contador {contador}</div>
      <input
        type="number"
        name="valor"
        id="valor"
        value={valor}
        onChange={handleChange}
        placeholder="valor a incrementar/Decrementar"
      />
      <br />
      <br />
      <BotonIncrementar valor={valor} incrementar={incrementar} />
      <BotonReset reset={reset} />
      <BotonDecrementar decrementar={decrementar} valor={valor} />
    </>
  );
};

export default Contador;
