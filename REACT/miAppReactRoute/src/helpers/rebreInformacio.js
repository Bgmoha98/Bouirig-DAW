import data from "../datos/Datos.json";

export const rebreInformacio = () => {
    return new Promise((resolve) => {
        setTimeout(() => resolve(data),1500)
    })
}


export const obtenerPersonas = async () => {
    try {
        const response = await fetch('https://jsonplaceholder.typicode.com/users');
        if (!response.ok) {
          throw new Error('No se pudo obtener la lista de personas');
        }
        const data = await response.json();
        return data
      } catch (error) {
        console.error('Error al obtener personas:', error);
      }
};

