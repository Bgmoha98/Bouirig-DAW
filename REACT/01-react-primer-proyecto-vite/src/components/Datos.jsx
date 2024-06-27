import PropTypes from "prop-types";

const Datos = ({ nom, apellido, altura, valores }) => {
  const estilo = {
    bagrounColor: "red",
    color: "blue",
    fontSize: "20px",
  };

  //   return <div style={estilo}>Contenido del componente</div>;
  // }

  return (
    <>
      <h1>Nom: {nom}</h1>
      <h2>Apellido: {apellido}</h2>
      <h4>Altura: {altura}</h4>
      <ol>
        {valores.map((valor) => (
          <li style={estilo}>{valor}</li>
        ))}
      </ol>
    </>
  );
};

Datos.propTypes = {
  nom: PropTypes.string.isRequired,
  apellido: PropTypes.string.isRequired,
};

export default Datos;
