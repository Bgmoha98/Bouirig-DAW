import React from 'react'

const BotonIncrementar = ({valor, incrementar}) => {
  return (
        <button onClick={() => { incrementar(valor); }}> + </button>
  )
}

export default BotonIncrementar