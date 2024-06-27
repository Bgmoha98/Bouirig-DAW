// Lista de personajes
let personajes = [
  {
    id: 1,
    nombre: "Link",
    apodo: "Heroe de la espada",
    altura: 160,
    genero: "Masculino",
    especialidad: "Trifuerza valor",
    imagen: "img/link.png",
    armas: {
      id: 1,
      nombre: "Espada Maestra",
      imagen: "img/link.png",
    },
  },
  {
    id: 2,
    nombre: "Zelda",
    apodo: "Princesa de Hyrule",
    altura: 168,
    genero: "Femenino",
    especialidad: "Trifuerza sabiduria",
    imagen: "img/zelda.jpg",
    armas: {
      id: 1,
      nombre: "Espada Maestra",
      imagen: "img/link.png",
    },
  },
  {
    id: 3,
    nombre: "Daruk",
    apodo: "Heroe goron",
    altura: 220,
    genero: "Masculino",
    especialidad: "Defensa",
    imagen: "img/daruk.png",
    armas: {
      id: 1,
      nombre: "Espada Maestra",
      imagen: "img/link.png",
    },
  },
];

let contadorPersonajes = personajes.length + 1;

console.log(contadorPersonajes);

const info = document.getElementById("info"); // Contenedor para la tabla de información
const formulario = document.getElementById("formulario"); // Contenedor para el formulario de modificación
const modificacion = document.getElementById("modificarInfo"); // Contenedor para el formulario de modificación
let rutaImagenSeleccionada;

// Titulos de las columnas de la tabla
let titulosCabecera = [
  "ID",
  "NOMBRE",
  "APODO",
  "ALTURA (CM)",
  "GENERO",
  "ESPECIALIDAD",
  "IMAGEN",
  "ARMAS HEROES",
  "EDITAR",
  "ELIMINAR",
];

let titulosCabeceraHijo = ["ID", "NOMBRE", "IMAGEN", "EDITAR", "ELIMINAR"];

// Cuando se carga la página
window.onload = function () {
  let tabla = document.createElement("table"); // Tabla que contendrá la información de los personajes
  let tbody = document.createElement("tbody"); // Cuerpo de la tabla
  let thead = document.createElement("thead"); // Encabezado de la tabla
  let td = document.createElement("td"); // Celda de la tabla
  let tr = document.createElement("tr"); // Fila de la tabla
  let botonInsertar = document.createElement("button");
  let textoInsertar = document.createTextNode("INSERTAR");

  // Establecer atributos de la tabla
  tabla.setAttribute("border", "2");

  // Agregar la tabla al contenedor de información
  info.appendChild(tabla);

  // Agregar el encabezado a la tabla
  tabla.appendChild(thead);
  thead.appendChild(tr);

  // Agregar el cuerpo de la tabla
  tabla.appendChild(tbody);

  // Crear las columnas de la cabecera
  for (let i = 0; i < titulosCabecera.length; i++) {
    let th = document.createElement("th");
    let textoCabecera = document.createTextNode(titulosCabecera[i]);
    tr.appendChild(th);
    th.appendChild(textoCabecera);
  }

  // Crear filas para cada personaje
  for (let j = 0; j < personajes.length; j++) {
    let id = document.createTextNode(personajes[j].id);
    let apodo = document.createTextNode(personajes[j].apodo);
    let altura = document.createTextNode(personajes[j].altura);
    let nombre = document.createTextNode(personajes[j].nombre);
    let genero = document.createTextNode(personajes[j].genero);
    let especialidad = document.createTextNode(personajes[j].especialidad);
    let armas = document.createTextNode("Armas Heroe");
    let modificar = document.createTextNode("Modificar");
    let eliminar = document.createTextNode("Eliminar");
    let imagen = personajes[j].imagen;
    let img = document.createElement("img");
    let linkArmas = document.createElement("a");
    let linkEdit = document.createElement("a");
    let linkDelete = document.createElement("a");

    // Nueva fila para cada personaje
    let tr2 = document.createElement("tr");
    let td1 = document.createElement("td");
    let td2 = document.createElement("td");
    let td3 = document.createElement("td");
    let td4 = document.createElement("td");
    let td5 = document.createElement("td");
    let td6 = document.createElement("td");
    let td7 = document.createElement("td");

    let tdArmas = document.createElement("td");
    let tdEdit = document.createElement("td");
    let tdDelete = document.createElement("td");

    // Agregar la fila al cuerpo de la tabla
    tbody.appendChild(tr2);

    // Añadir las celdas a la fila
    tr2.appendChild(td1);
    td1.appendChild(id);

    tr2.appendChild(td2);
    td2.appendChild(nombre);

    tr2.appendChild(td3);
    td3.appendChild(apodo);

    tr2.appendChild(td4);
    td4.appendChild(altura);

    tr2.appendChild(td5);
    td5.appendChild(genero);

    tr2.appendChild(td6);
    td6.appendChild(especialidad);

    img.setAttribute("height", "90px");
    img.setAttribute("width", "90px");

    tr2.appendChild(td7);
    img.src = imagen;
    td7.appendChild(img);

    img.addEventListener("dblclick", function (e) {
      td7.removeChild(img);
    });

    // Configurar el botón de armas
    linkArmas.setAttribute("id", personajes[j].id);
    linkArmas.setAttribute("href", "#");
    linkArmas.addEventListener("click", function (e) {
      let id = e.target.getAttribute("id");
      // Remover la tabla existente para mostrar el formulario de modificación
      info.removeChild(info.firstChild);
      info.removeChild(botonInsertar);
      crearTablaPersonajeHijo(id);
    });
    linkArmas.appendChild(armas);
    tr2.appendChild(tdArmas);
    tdArmas.appendChild(linkArmas);

    // Configurar el botón de editar
    linkEdit.setAttribute("id", personajes[j].id);
    linkEdit.setAttribute("href", "#");
    linkEdit.addEventListener("click", function (e) {
      let id = e.target.getAttribute("id");
      // Remover la tabla existente para mostrar el formulario de modificación
      info.removeChild(info.firstChild);
      info.removeChild(botonInsertar);
      modificarPersonajePadre(id);
    });
    linkEdit.appendChild(modificar);
    tr2.appendChild(tdEdit);
    tdEdit.appendChild(linkEdit);

    // Configurar el botón de eliminar
    linkDelete.setAttribute("id", personajes[j].id);
    linkDelete.setAttribute("href", "#");
    linkDelete.addEventListener("click", function (e) {
      let id = e.target.getAttribute("id");

      // Eliminar la fila del personaje
      e.target.parentNode.parentNode.parentNode.removeChild(
        e.target.parentNode.parentNode
      );

      // Eliminar el personaje del array
      for (let i = 0; i < personajes.length; i++) {
        if (personajes[i].id == id) {
          personajes.splice(i, 1);
        }
      }
    });
    linkDelete.appendChild(eliminar);
    tr2.appendChild(tdDelete);
    tdDelete.appendChild(linkDelete);
  }

  botonInsertar.setAttribute("type", "button");
  // botonGuardar.setAttribute("id", personajes[i].id);
  botonInsertar.appendChild(textoInsertar);
  info.appendChild(botonInsertar);

  botonInsertar.addEventListener("click", function (e) {
    info.removeChild(info.firstChild);
    info.removeChild(botonInsertar);
    formularioInsertar();
  });
};

function formularioInsertar() {
  let form = document.createElement("form");
  let botonGuardar = document.createElement("button");
  let botonVolverAtras = document.createElement("button");
  let inputId = document.createElement("input");
  let etiquetaID = document.createElement("label");
  let inputNombre = document.createElement("input");
  let etiquetaNombre = document.createElement("label");
  let etiquetaApodo = document.createElement("label");
  let inputApodo = document.createElement("input");
  let etiquetaAltura = document.createElement("label");
  let inputAltura = document.createElement("input");
  let etiquetaGenero = document.createElement("label");
  let selectGenero = document.createElement("select");
  let etiquetaEspecialidad = document.createElement("label");
  let SelectEspecialidad = document.createElement("select");
  let inputImagen = document.createElement("input");
  let etiquetaImagen = document.createElement("label");
  let rutaImagenActual = document.createElement("p");
  let imagenActual;

  let opcion = document.createElement("option");
  let opcion2 = document.createElement("option");

  let opcion3 = document.createElement("option");
  let opcion4 = document.createElement("option");
  let opcion5 = document.createElement("option");
  let opcion6 = document.createElement("option");

  let textoID = document.createTextNode("ID: ");
  let textoNombre = document.createTextNode("NOMBRE: ");
  let textoApodo = document.createTextNode("APODO: ");
  let textoAlturaCm = document.createTextNode("ALTURA (CM): ");
  let textoGenero = document.createTextNode("GENERO: ");
  let textoEspecialidad = document.createTextNode("Especialidad: ");
  let textoImagen = document.createTextNode("IMAGEN: ");
  let textoGuardar = document.createTextNode("GUARDAR");
  let textoAtras = document.createTextNode("VOLVER ATRAS");
  let textoMasculino = document.createTextNode("Masculino");
  let textoFemenino = document.createTextNode("Femenino");

  let textoPoder = document.createTextNode("Trifuerza poder");
  let textoValor = document.createTextNode("Trifuerza valor");
  let textoSabiduria = document.createTextNode("Trifuerza sabiduria");
  let textoDefensa = document.createTextNode("Defensa");

  let br = document.createElement("br");
  let br2 = document.createElement("br");
  let br3 = document.createElement("br");
  let br4 = document.createElement("br");
  let br5 = document.createElement("br");
  let br6 = document.createElement("br");
  let br7 = document.createElement("br");
  let br8 = document.createElement("br");

  etiquetaID.appendChild(textoID);
  inputId.setAttribute("type", "text");
  inputId.setAttribute("required", true);
  inputId.setAttribute("value", contadorPersonajes);
  inputId.setAttribute("id", "id");

  form.appendChild(etiquetaID);
  form.appendChild(inputId);
  form.appendChild(br);

  etiquetaNombre.appendChild(textoNombre);
  inputNombre.setAttribute("type", "text");
  inputNombre.setAttribute("required", true);
  inputNombre.setAttribute("id", "nombre");

  form.appendChild(etiquetaNombre);
  form.appendChild(inputNombre);
  form.appendChild(br2);

  etiquetaApodo.appendChild(textoApodo);
  inputApodo.setAttribute("type", "text");
  inputApodo.setAttribute("required", true);
  inputApodo.setAttribute("id", "apodo");

  form.appendChild(etiquetaApodo);
  form.appendChild(inputApodo);
  form.appendChild(br3);

  etiquetaAltura.appendChild(textoAlturaCm);
  inputAltura.setAttribute("type", "number");
  inputAltura.setAttribute("id", "altura");

  form.appendChild(etiquetaAltura);
  form.appendChild(inputAltura);
  form.appendChild(br4);

  etiquetaGenero.appendChild(textoGenero);
  selectGenero.setAttribute("name", "Genero");
  selectGenero.setAttribute("id", "genero");
  opcion.appendChild(textoMasculino);
  opcion.setAttribute("value", "Masculino");
  selectGenero.appendChild(opcion);
  opcion2.appendChild(textoFemenino);
  opcion2.setAttribute("value", "Femenino");
  selectGenero.appendChild(opcion2);

  form.appendChild(etiquetaGenero);
  form.appendChild(selectGenero);
  form.appendChild(br5);

  etiquetaEspecialidad.appendChild(textoEspecialidad);
  SelectEspecialidad.setAttribute("name", "Especialidad");
  SelectEspecialidad.setAttribute("id", "especialidad");
  SelectEspecialidad.appendChild(opcion3);
  opcion3.appendChild(textoPoder);
  opcion3.setAttribute("value", "Trifuerza poder");
  SelectEspecialidad.appendChild(opcion4);
  opcion4.appendChild(textoValor);
  opcion4.setAttribute("value", "Trifuerza valor");
  SelectEspecialidad.appendChild(opcion5);
  opcion5.appendChild(textoSabiduria);
  opcion5.setAttribute("value", "Trifuerza sabiduria");
  SelectEspecialidad.appendChild(opcion6);
  opcion6.setAttribute("value", "Defensa");
  opcion6.appendChild(textoDefensa);

  form.appendChild(etiquetaEspecialidad);
  form.appendChild(SelectEspecialidad);
  form.appendChild(br6);

  etiquetaImagen.appendChild(textoImagen);
  inputImagen.setAttribute("type", "file");
  inputImagen.setAttribute("accept", "image/*");
  inputImagen.setAttribute("id", "imagen");

  form.appendChild(etiquetaImagen);
  form.appendChild(inputImagen);
  form.appendChild(br7);

  rutaImagenActual.textContent = "Ruta actual de la imagen: ";
  form.appendChild(rutaImagenActual);
  form.appendChild(br8);

  botonGuardar.setAttribute("type", "button");
  botonGuardar.appendChild(textoGuardar);
  form.appendChild(botonGuardar);

  botonGuardar.addEventListener("click", function (e) {
    let id = e.target.getAttribute("id");
    let condicionId = document.getElementById("id").value;
    let condicionNombre = document.getElementById("nombre").value;
    let condicionApodo = document.getElementById("apodo").value;
    let pushAltura = document.getElementById("altura").value;
    let pushGenero = document.getElementById("genero").value;
    let pushEspecialidad = document.getElementById("especialidad").value;
    let pushImagen = document.getElementById("imagen").value;

    if (condicionId === "" || condicionNombre === "" || condicionApodo === "") {
      console.log("Tienes que rellenar los campos id, nombre y apodo");
    } else {
      console.log("Exito");

      if (pushImagen != null || pushImagen != "") {
        pushImagen.split;
        let rutaTroceada = pushImagen.split("\\");
        imagenActual = "img/" + rutaTroceada[rutaTroceada.length - 1];
      } else {
        imagenActual = "img/Urbosa.png";
      }

      let nuevoPersonaje = {
        id: condicionId,
        nombre: condicionNombre,
        apodo: condicionApodo,
        altura: pushAltura,
        genero: pushGenero,
        especialidad: pushEspecialidad,
        imagen: imagenActual,
      };

      // Añadir el nuevo personaje al arreglo de personajes
      personajes.push(nuevoPersonaje);
    }
    formulario.removeChild(form);
    crearTablaInformacion();
  });

  form.appendChild(botonVolverAtras);

  formulario.appendChild(form);
  botonVolverAtras.setAttribute("type", "button");
  botonVolverAtras.appendChild(textoAtras);
  botonVolverAtras.addEventListener("click", function () {
    formulario.removeChild(form);
    crearTablaInformacion();
  });
  contadorPersonajes = personajes.length + 1;
}

// Función para mostrar el formulario de modificación de un personaje
function modificarPersonajePadre(id) {
  for (let i = 0; i < personajes.length; i++) {
    if (personajes[i].id == id) {
      // Mostrar los detalles del personaje en el formulario
      let form = document.createElement("form");
      let botonGuardar = document.createElement("button");
      let botonVolverAtras = document.createElement("button");
      let inputId = document.createElement("input");
      let etiquetaID = document.createElement("label");
      let inputNombre = document.createElement("input");
      let etiquetaNombre = document.createElement("label");
      let etiquetaApodo = document.createElement("label");
      let inputApodo = document.createElement("input");
      let etiquetaAltura = document.createElement("label");
      let inputAltura = document.createElement("input");
      let etiquetaGenero = document.createElement("label");
      let selectGenero = document.createElement("select");
      let etiquetaEspecialidad = document.createElement("label");
      let SelectEspecialidad = document.createElement("select");
      let inputImagen = document.createElement("input");
      let etiquetaImagen = document.createElement("label");
      let rutaImagenActual = document.createElement("p");

      let opcion = document.createElement("option");
      let opcion2 = document.createElement("option");

      let opcion3 = document.createElement("option");
      let opcion4 = document.createElement("option");
      let opcion5 = document.createElement("option");
      let opcion6 = document.createElement("option");

      let textoID = document.createTextNode("ID: ");
      let textoNombre = document.createTextNode("NOMBRE: ");
      let textoApodo = document.createTextNode("APODO: ");
      let textoAlturaCm = document.createTextNode("ALTURA (CM): ");
      let textoGenero = document.createTextNode("GENERO: ");
      let textoEspecialidad = document.createTextNode("Especialidad: ");
      let textoImagen = document.createTextNode("IMAGEN: ");
      let textoGuardar = document.createTextNode("GUARDAR");
      let textoAtras = document.createTextNode("VOLVER ATRAS");
      let textoMasculino = document.createTextNode("Masculino");
      let textoFemenino = document.createTextNode("Femenino");

      let textoPoder = document.createTextNode("Trifuerza poder");
      let textoValor = document.createTextNode("Trifuerza valor");
      let textoSabiduria = document.createTextNode("Trifuerza sabiduria");
      let textoDefensa = document.createTextNode("Defensa");

      let br = document.createElement("br");
      let br2 = document.createElement("br");
      let br3 = document.createElement("br");
      let br4 = document.createElement("br");
      let br5 = document.createElement("br");
      let br6 = document.createElement("br");
      let br7 = document.createElement("br");
      let br8 = document.createElement("br");

      etiquetaID.appendChild(textoID);
      inputId.setAttribute("type", "text");
      inputId.setAttribute("required", true);
      inputId.setAttribute("id", "id");
      inputId.setAttribute("value", personajes[i].id);

      form.appendChild(etiquetaID);
      form.appendChild(inputId);
      form.appendChild(br);

      etiquetaNombre.appendChild(textoNombre);
      inputNombre.setAttribute("type", "text");
      inputNombre.setAttribute("required", true);
      inputNombre.setAttribute("value", personajes[i].nombre);
      inputNombre.setAttribute("id", "nombre");

      form.appendChild(etiquetaNombre);
      form.appendChild(inputNombre);
      form.appendChild(br2);

      etiquetaApodo.appendChild(textoApodo);
      inputApodo.setAttribute("type", "text");
      inputApodo.setAttribute("required", true);
      inputApodo.setAttribute("value", personajes[i].apodo);
      inputApodo.setAttribute("id", "apodo");

      form.appendChild(etiquetaApodo);
      form.appendChild(inputApodo);
      form.appendChild(br3);

      etiquetaAltura.appendChild(textoAlturaCm);
      inputAltura.setAttribute("type", "number");
      inputAltura.setAttribute("value", personajes[i].altura);
      inputAltura.setAttribute("id", "altura");

      form.appendChild(etiquetaAltura);
      form.appendChild(inputAltura);
      form.appendChild(br4);

      etiquetaGenero.appendChild(textoGenero);
      selectGenero.setAttribute("name", "Genero");
      selectGenero.setAttribute("id", "genero");
      opcion.appendChild(textoMasculino);
      opcion.setAttribute("value", "Masculino");
      selectGenero.appendChild(opcion);
      opcion2.appendChild(textoFemenino);
      opcion2.setAttribute("value", "Femenino");
      selectGenero.appendChild(opcion2);

      if (personajes[i].genero == "Masculino") {
        opcion.setAttribute("selected", true);
      } else {
        opcion2.setAttribute("selected", true);
      }

      form.appendChild(etiquetaGenero);
      form.appendChild(selectGenero);
      form.appendChild(br5);

      etiquetaEspecialidad.appendChild(textoEspecialidad);
      SelectEspecialidad.setAttribute("name", "Especialidad");
      SelectEspecialidad.setAttribute("id", "especialidad");
      SelectEspecialidad.appendChild(opcion3);
      opcion3.appendChild(textoPoder);
      opcion3.setAttribute("value", "Trifuerza poder");
      SelectEspecialidad.appendChild(opcion4);
      opcion4.appendChild(textoValor);
      opcion4.setAttribute("value", "Trifuerza valor");
      SelectEspecialidad.appendChild(opcion5);
      opcion5.appendChild(textoSabiduria);
      opcion5.setAttribute("value", "Trifuerza sabiduria");
      SelectEspecialidad.appendChild(opcion6);
      opcion6.setAttribute("value", "Defensa");
      opcion6.appendChild(textoDefensa);

      if (personajes[i].especialidad == "Trifuerza poder") {
        opcion3.setAttribute("selected", true);
      } else if (personajes[i].especialidad == "Trifuerza valor") {
        opcion4.setAttribute("selected", true);
      } else if (personajes[i].especialidad == "Trifuerza sabiduria") {
        opcion5.setAttribute("selected", true);
      } else if (personajes[i].especialidad == "Defensa") {
        opcion6.setAttribute("selected", true);
      } else {
      }

      form.appendChild(etiquetaEspecialidad);
      form.appendChild(SelectEspecialidad);
      form.appendChild(br6);

      etiquetaImagen.appendChild(textoImagen);
      inputImagen.setAttribute("type", "file");
      inputImagen.setAttribute("accept", "image/*");
      inputImagen.setAttribute("id", "imagen");

      form.appendChild(etiquetaImagen);
      form.appendChild(inputImagen);
      form.appendChild(br7);

      rutaImagenActual.textContent =
        "Ruta actual de la imagen: " + personajes[i].imagen;
      form.appendChild(rutaImagenActual);
      form.appendChild(br8);

      botonGuardar.setAttribute("type", "button");
      botonGuardar.setAttribute("id", personajes[i].id);
      botonGuardar.appendChild(textoGuardar);
      form.appendChild(botonGuardar);

      botonGuardar.addEventListener("click", function (e) {
        let id = parseInt(document.getElementById("id").value);
        let condicionId = document.getElementById("id").value;
        let condicionNombre = document.getElementById("nombre").value;
        let condicionApodo = document.getElementById("apodo").value;
        let pushAltura = document.getElementById("altura").value;
        let pushGenero = document.getElementById("genero").value;
        let pushEspecialidad = document.getElementById("especialidad").value;
        let pushImagen = document.getElementById("imagen").value;
        console.log("id" + id);
        console.log("condID" + id);
        if (
          condicionId === "" ||
          condicionNombre === "" ||
          condicionApodo === ""
        ) {
          console.log("Tienes que rellenar los campos id, nombre y apodo");
        } else {
          console.log("Exito");

          if (pushImagen != null || pushImagen != "") {
            pushImagen.split;
            let rutaTroceada = pushImagen.split("\\");
            imagenActual = "img/" + rutaTroceada[rutaTroceada.length - 1];
          } else {
            imagenActual = "img/Urbosa.png";
          }
        }

        for (let k = 0; k < personajes.length; k++) {
          if (personajes[k].id == id) {
            personajes[k].nombre = condicionNombre;
            personajes[k].apodo = condicionApodo;
            personajes[k].altura = pushAltura;
            personajes[k].genero = pushGenero;
            personajes[k].especialidad = pushEspecialidad;
            personajes[k].imagen = imagenActual;
          }
        }

        modificacion.removeChild(form);
        crearTablaInformacion();
      });

      botonVolverAtras.setAttribute("type", "button");
      botonVolverAtras.appendChild(textoAtras);
      botonVolverAtras.addEventListener("click", function () {
        modificacion.removeChild(form);
        crearTablaInformacion();
      });
      form.appendChild(botonVolverAtras);

      modificacion.appendChild(form);
    }
  }
}

function modificarPersonajeHijo(id) {
  for (let i = 0; i < personajes.length; i++) {
    if (personajes[i].id == id) {
      // Mostrar los detalles del personaje en el formulario
      let form = document.createElement("form");
      let botonGuardar = document.createElement("button");
      let botonVolverAtras = document.createElement("button");
      let inputId = document.createElement("input");
      let etiquetaID = document.createElement("label");
      let inputNombre = document.createElement("input");
      let etiquetaNombre = document.createElement("label");
      let etiquetaApodo = document.createElement("label");
      let inputApodo = document.createElement("input");
      let etiquetaAltura = document.createElement("label");
      let inputAltura = document.createElement("input");
      let etiquetaGenero = document.createElement("label");
      let selectGenero = document.createElement("select");
      let etiquetaEspecialidad = document.createElement("label");
      let SelectEspecialidad = document.createElement("select");
      let inputImagen = document.createElement("input");
      let etiquetaImagen = document.createElement("label");
      let rutaImagenActual = document.createElement("p");

      let opcion = document.createElement("option");
      let opcion2 = document.createElement("option");

      let opcion3 = document.createElement("option");
      let opcion4 = document.createElement("option");
      let opcion5 = document.createElement("option");
      let opcion6 = document.createElement("option");

      let textoID = document.createTextNode("ID: ");
      let textoNombre = document.createTextNode("NOMBRE: ");
      let textoApodo = document.createTextNode("APODO: ");
      let textoAlturaCm = document.createTextNode("ALTURA (CM): ");
      let textoGenero = document.createTextNode("GENERO: ");
      let textoEspecialidad = document.createTextNode("Especialidad: ");
      let textoImagen = document.createTextNode("IMAGEN: ");
      let textoGuardar = document.createTextNode("GUARDAR");
      let textoAtras = document.createTextNode("VOLVER ATRAS");
      let textoMasculino = document.createTextNode("Masculino");
      let textoFemenino = document.createTextNode("Femenino");

      let textoPoder = document.createTextNode("Trifuerza poder");
      let textoValor = document.createTextNode("Trifuerza valor");
      let textoSabiduria = document.createTextNode("Trifuerza sabiduria");
      let textoDefensa = document.createTextNode("Defensa");

      let br = document.createElement("br");
      let br2 = document.createElement("br");
      let br3 = document.createElement("br");
      let br4 = document.createElement("br");
      let br5 = document.createElement("br");
      let br6 = document.createElement("br");
      let br7 = document.createElement("br");
      let br8 = document.createElement("br");

      etiquetaID.appendChild(textoID);
      inputId.setAttribute("type", "text");
      inputId.setAttribute("required", true);
      inputId.setAttribute("id", "id");
      inputId.setAttribute("value", personajes[i].id);

      form.appendChild(etiquetaID);
      form.appendChild(inputId);
      form.appendChild(br);

      etiquetaNombre.appendChild(textoNombre);
      inputNombre.setAttribute("type", "text");
      inputNombre.setAttribute("required", true);
      inputNombre.setAttribute("value", personajes[i].nombre);
      inputNombre.setAttribute("id", "nombre");

      form.appendChild(etiquetaNombre);
      form.appendChild(inputNombre);
      form.appendChild(br2);

      etiquetaApodo.appendChild(textoApodo);
      inputApodo.setAttribute("type", "text");
      inputApodo.setAttribute("required", true);
      inputApodo.setAttribute("value", personajes[i].apodo);
      inputApodo.setAttribute("id", "apodo");

      form.appendChild(etiquetaApodo);
      form.appendChild(inputApodo);
      form.appendChild(br3);

      etiquetaAltura.appendChild(textoAlturaCm);
      inputAltura.setAttribute("type", "number");
      inputAltura.setAttribute("value", personajes[i].altura);
      inputAltura.setAttribute("id", "altura");

      form.appendChild(etiquetaAltura);
      form.appendChild(inputAltura);
      form.appendChild(br4);

      etiquetaGenero.appendChild(textoGenero);
      selectGenero.setAttribute("name", "Genero");
      selectGenero.setAttribute("id", "genero");
      opcion.appendChild(textoMasculino);
      opcion.setAttribute("value", "Masculino");
      selectGenero.appendChild(opcion);
      opcion2.appendChild(textoFemenino);
      opcion2.setAttribute("value", "Femenino");
      selectGenero.appendChild(opcion2);

      if (personajes[i].genero == "Masculino") {
        opcion.setAttribute("selected", true);
      } else {
        opcion2.setAttribute("selected", true);
      }

      form.appendChild(etiquetaGenero);
      form.appendChild(selectGenero);
      form.appendChild(br5);

      etiquetaEspecialidad.appendChild(textoEspecialidad);
      SelectEspecialidad.setAttribute("name", "Especialidad");
      SelectEspecialidad.setAttribute("id", "especialidad");
      SelectEspecialidad.appendChild(opcion3);
      opcion3.appendChild(textoPoder);
      opcion3.setAttribute("value", "Trifuerza poder");
      SelectEspecialidad.appendChild(opcion4);
      opcion4.appendChild(textoValor);
      opcion4.setAttribute("value", "Trifuerza valor");
      SelectEspecialidad.appendChild(opcion5);
      opcion5.appendChild(textoSabiduria);
      opcion5.setAttribute("value", "Trifuerza sabiduria");
      SelectEspecialidad.appendChild(opcion6);
      opcion6.setAttribute("value", "Defensa");
      opcion6.appendChild(textoDefensa);

      if (personajes[i].especialidad == "Trifuerza poder") {
        opcion3.setAttribute("selected", true);
      } else if (personajes[i].especialidad == "Trifuerza valor") {
        opcion4.setAttribute("selected", true);
      } else if (personajes[i].especialidad == "Trifuerza sabiduria") {
        opcion5.setAttribute("selected", true);
      } else if (personajes[i].especialidad == "Defensa") {
        opcion6.setAttribute("selected", true);
      } else {
      }

      form.appendChild(etiquetaEspecialidad);
      form.appendChild(SelectEspecialidad);
      form.appendChild(br6);

      etiquetaImagen.appendChild(textoImagen);
      inputImagen.setAttribute("type", "file");
      inputImagen.setAttribute("accept", "image/*");
      inputImagen.setAttribute("value", personajes[i].imagen);
      // inputImagen.setAttribute("id", personajes[i].id);

      form.appendChild(etiquetaImagen);
      form.appendChild(inputImagen);
      form.appendChild(br7);

      rutaImagenActual.textContent =
        "Ruta actual de la imagen: " + personajes[i].imagen;
      form.appendChild(rutaImagenActual);
      form.appendChild(br8);

      botonGuardar.setAttribute("type", "button");
      botonGuardar.setAttribute("id", personajes[i].id);
      botonGuardar.appendChild(textoGuardar);
      form.appendChild(botonGuardar);

      botonGuardar.addEventListener("click", function (e) {
        let id = e.target.getAttribute("id");
        let condicionId = document.getElementById("id");
        let condicionNombre = document.getElementById("nombre");
        let condicionApodo = document.getElementById("apodo");
        console.log(condicionId.value);
        console.log(condicionNombre.value);
        console.log(condicionApodo.value);

        if (
          condicionId.value == null ||
          condicionNombre.value == null ||
          condicionApodo.value == null
        ) {
          console.log("Tienes que rellenar los campos required");
        } else {
          console.log("Exito");
        }
      });

      botonVolverAtras.setAttribute("type", "button");
      botonVolverAtras.appendChild(textoAtras);
      botonVolverAtras.addEventListener("click", function () {
        modificacion.removeChild(form);
        crearTablaInformacion();
      });
      form.appendChild(botonVolverAtras);

      modificacion.appendChild(form);
    }
  }
}

function crearTablaPersonajeHijo(id) {
  let tabla = document.createElement("table"); // Tabla que contendrá la información de los personajes
  let tbody = document.createElement("tbody"); // Cuerpo de la tabla
  let thead = document.createElement("thead"); // Encabezado de la tabla
  let td = document.createElement("td"); // Celda de la tabla
  let tr = document.createElement("tr"); // Fila de la tabla
  let botonInsertar = document.createElement("button");
  let textoInsertar = document.createTextNode("INSERTAR");

  // Establecer atributos de la tabla
  tabla.setAttribute("border", "2");

  // Agregar la tabla al contenedor de información
  info.appendChild(tabla);

  // Agregar el encabezado a la tabla
  tabla.appendChild(thead);
  thead.appendChild(tr);

  // Agregar el cuerpo de la tabla
  tabla.appendChild(tbody);

  // Crear las columnas de la cabecera
  for (let i = 0; i < titulosCabeceraHijo.length; i++) {
    let th = document.createElement("th");
    let textoCabeceraHijo = document.createTextNode(titulosCabeceraHijo[i]);
    tr.appendChild(th);
    th.appendChild(textoCabeceraHijo);
  }

  // Crear filas para cada personaje
  for (let j = 0; j < personajes.length; j++) {
    if (personajes[j].id == id) {
      let armas = personajes[j].armas;
      let id = document.createTextNode(armas.id);
      let nombre = document.createTextNode(armas.nombre);
      let modificar = document.createTextNode("Modificar");
      let eliminar = document.createTextNode("Eliminar");
      let imagen = armas.imagen;
      let img = document.createElement("img");
      let linkArmas = document.createElement("a");
      let linkEdit = document.createElement("a");
      let linkDelete = document.createElement("a");

      // Nueva fila para cada personaje
      let tr2 = document.createElement("tr");
      let td1 = document.createElement("td");
      let td2 = document.createElement("td");
      let td3 = document.createElement("td");

      let tdEdit = document.createElement("td");
      let tdDelete = document.createElement("td");

      // Agregar la fila al cuerpo de la tabla
      tbody.appendChild(tr2);

      // Añadir las celdas a la fila
      tr2.appendChild(td1);
      td1.appendChild(id);

      tr2.appendChild(td2);
      td2.appendChild(nombre);

      img.setAttribute("height", "90px");
      img.setAttribute("width", "90px");

      tr2.appendChild(td3);
      img.src = imagen;
      td3.appendChild(img);

      img.addEventListener("dblclick", function (e) {
        td3.removeChild(img);
      });

      // Configurar el botón de editar
      linkEdit.setAttribute("id", armas.id);
      linkEdit.setAttribute("href", "#");
      linkEdit.addEventListener("click", function (e) {
        let id = e.target.getAttribute("id");
        // Remover la tabla existente para mostrar el formulario de modificación
        info.removeChild(info.firstChild);
        info.removeChild(botonInsertar);
        modificarPersonajePadre(id);
      });
      linkEdit.appendChild(modificar);
      tr2.appendChild(tdEdit);
      tdEdit.appendChild(linkEdit);

      // Configurar el botón de eliminar
      linkDelete.setAttribute("id", armas.id);
      linkDelete.setAttribute("href", "#");
      linkDelete.addEventListener("click", function (e) {
        let id = e.target.getAttribute("id");

        // Eliminar la fila del personaje
        e.target.parentNode.parentNode.parentNode.removeChild(
          e.target.parentNode.parentNode
        );

        // Eliminar el personaje del array
        for (let i = 0; i < personajes.length; i++) {
          if (personajes[i].id == id) {
            personajes.splice(i, 1);
          }
        }
      });
      linkDelete.appendChild(eliminar);
      tr2.appendChild(tdDelete);
      tdDelete.appendChild(linkDelete);
    }

    botonInsertar.setAttribute("type", "button");
    // botonGuardar.setAttribute("id", personajes[i].id);
    botonInsertar.appendChild(textoInsertar);
    info.appendChild(botonInsertar);

    botonInsertar.addEventListener("click", function (e) {
      info.removeChild(info.firstChild);
      info.removeChild(botonInsertar);
      formularioInsertar();
    });
    contadorPersonajes = personajes.length + 1;
  }
}

function crearTablaInformacion() {
  let tabla = document.createElement("table"); // Tabla que contendrá la información de los personajes
  let tbody = document.createElement("tbody"); // Cuerpo de la tabla
  let thead = document.createElement("thead"); // Encabezado de la tabla
  let td = document.createElement("td"); // Celda de la tabla
  let tr = document.createElement("tr"); // Fila de la tabla
  let botonInsertar = document.createElement("button");
  let textoInsertar = document.createTextNode("INSERTAR");

  // Establecer atributos de la tabla
  tabla.setAttribute("border", "2");

  // Agregar la tabla al contenedor de información
  info.appendChild(tabla);

  // Agregar el encabezado a la tabla
  tabla.appendChild(thead);
  thead.appendChild(tr);

  // Agregar el cuerpo de la tabla
  tabla.appendChild(tbody);

  // Crear las columnas de la cabecera
  for (let i = 0; i < titulosCabecera.length; i++) {
    let th = document.createElement("th");
    let textoCabecera = document.createTextNode(titulosCabecera[i]);
    tr.appendChild(th);
    th.appendChild(textoCabecera);
  }

  // Crear filas para cada personaje
  for (let j = 0; j < personajes.length; j++) {
    let id = document.createTextNode(personajes[j].id);
    let apodo = document.createTextNode(personajes[j].apodo);
    let altura = document.createTextNode(personajes[j].altura);
    let nombre = document.createTextNode(personajes[j].nombre);
    let genero = document.createTextNode(personajes[j].genero);
    let especialidad = document.createTextNode(personajes[j].especialidad);
    let armas = document.createTextNode("Armas Heroe");
    let modificar = document.createTextNode("Modificar");
    let eliminar = document.createTextNode("Eliminar");
    let imagen = personajes[j].imagen;
    let img = document.createElement("img");
    let linkArmas = document.createElement("a");
    let linkEdit = document.createElement("a");
    let linkDelete = document.createElement("a");

    // Nueva fila para cada personaje
    let tr2 = document.createElement("tr");
    let td1 = document.createElement("td");
    let td2 = document.createElement("td");
    let td3 = document.createElement("td");
    let td4 = document.createElement("td");
    let td5 = document.createElement("td");
    let td6 = document.createElement("td");
    let td7 = document.createElement("td");

    let tdArmas = document.createElement("td");
    let tdEdit = document.createElement("td");
    let tdDelete = document.createElement("td");

    // Agregar la fila al cuerpo de la tabla
    tbody.appendChild(tr2);

    // Añadir las celdas a la fila
    tr2.appendChild(td1);
    td1.appendChild(id);

    tr2.appendChild(td2);
    td2.appendChild(nombre);

    tr2.appendChild(td3);
    td3.appendChild(apodo);

    tr2.appendChild(td4);
    td4.appendChild(altura);

    tr2.appendChild(td5);
    td5.appendChild(genero);

    tr2.appendChild(td6);
    td6.appendChild(especialidad);

    img.setAttribute("height", "90px");
    img.setAttribute("width", "90px");

    tr2.appendChild(td7);
    img.src = imagen;
    td7.appendChild(img);

    img.addEventListener("dblclick", function (e) {
      td7.removeChild(img);
    });

    // Configurar el botón de armas
    linkArmas.setAttribute("id", personajes[j].id);
    linkArmas.setAttribute("href", "#");
    linkArmas.addEventListener("click", function (e) {
      let id = e.target.getAttribute("id");
      // Remover la tabla existente para mostrar el formulario de modificación
      info.removeChild(info.firstChild);
      info.removeChild(botonInsertar);
      crearTablaPersonajeHijo(id);
    });
    linkArmas.appendChild(armas);
    tr2.appendChild(tdArmas);
    tdArmas.appendChild(linkArmas);

    // Configurar el botón de editar
    linkEdit.setAttribute("id", personajes[j].id);
    linkEdit.setAttribute("href", "#");
    linkEdit.addEventListener("click", function (e) {
      let id = e.target.getAttribute("id");
      // Remover la tabla existente para mostrar el formulario de modificación
      info.removeChild(info.firstChild);
      info.removeChild(botonInsertar);
      modificarPersonajePadre(id);
    });
    linkEdit.appendChild(modificar);
    tr2.appendChild(tdEdit);
    tdEdit.appendChild(linkEdit);

    // Configurar el botón de eliminar
    linkDelete.setAttribute("id", personajes[j].id);
    linkDelete.setAttribute("href", "#");
    linkDelete.addEventListener("click", function (e) {
      let id = e.target.getAttribute("id");

      // Eliminar la fila del personaje
      e.target.parentNode.parentNode.parentNode.removeChild(
        e.target.parentNode.parentNode
      );

      // Eliminar el personaje del array
      for (let i = 0; i < personajes.length; i++) {
        if (personajes[i].id == id) {
          personajes.splice(i, 1);
        }
      }
    });
    linkDelete.appendChild(eliminar);
    tr2.appendChild(tdDelete);
    tdDelete.appendChild(linkDelete);
  }

  botonInsertar.setAttribute("type", "button");
  // botonGuardar.setAttribute("id", personajes[i].id);
  botonInsertar.appendChild(textoInsertar);
  info.appendChild(botonInsertar);

  botonInsertar.addEventListener("click", function (e) {
    info.removeChild(info.firstChild);
    info.removeChild(botonInsertar);
    formularioInsertar();
  });
  
  contadorPersonajes = personajes.length + 1;
}
