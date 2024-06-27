import React from 'react';
import './TarjetaProducto.css';

function TarjetaProducto({ producto }) {
  return (
    <div className="card">
      <div className="nombre">{producto.nombre}</div>
      <div className="precio">{producto.precio}</div>
      <div className="descripcion">{producto.descripcion}</div>
    </div>
  );
}

export default TarjetaProducto;
