import React from "react";
import { useForm } from "react-hook-form";

const Contacto = ({nombre="",correo="", comentario=""}) => {
     const { register, handleSubmit, formState: { errors } } = useForm({
      defaultValues: {
      nombre: nombre,
      correo: correo,
      comentario: comentario
    }
});

  const guardarInfo = (data) => console.log(data);


  return (
    <form guardarInfo={handleSubmit(guardarInfo)}>
      <div>
        <label htmlFor="nombre">Nombre:</label>
        <input
          type="text"
          id="nombre"
          {...register("nombre", {
            required: "El nombre es obligatorio",
            maxLength: 15,
          })}
        />
        {errors.nombre && <div>{errors.nombre.message}</div>}
      </div>
      <div>
        <label htmlFor="correo">Correo Electrónico:</label>
        <input
          type="email"
          id="correo"
          {...register("correo", {
            required: "El correo es obligatorio",
            pattern: {
              value: /^[^\s@]+@[^\s@]+\.[^\s@]+$/,
              message: "Correo no válido",
            },
          })}
        />
        {errors.correo && <div>{errors.correo.message}</div>}
      </div>
      <div>
        <label htmlFor="comentario">Comentario:</label>
        <textarea
          id="comentario"
          {...register("comentario", {
            required: "El comentario es obligatorio",
            minLength: 10,
            maxLength: 250,
          })}
        />
        {errors.comentario && <div>{errors.comentario.message}</div>}
      </div>
      <button type="submit">Enviar</button>
    </form>
  );
};

export default Contacto;
