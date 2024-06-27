import React from 'react'

const ProvaMap = () => {

    const productos = [
        { id: 1, nombre: 'Producto 1' },
        { id: 2, nombre: 'Producto 2' },
        { id: 3, nombre: 'Producto 3' }
      ];
      
  return (
    <ul>
      {productos.map(producto => (
       <strong key={producto.id}><li>{producto.nombre}</li></strong>
      ))}
    </ul>

  )
}

export default ProvaMap