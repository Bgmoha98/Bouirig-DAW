import React from 'react'

const BotonDecrementar = ({valor, decrementar}) => {
  return (
    <button onClick={() => { decrementar(valor); }}> - </button>
  )
}

export default BotonDecrementar