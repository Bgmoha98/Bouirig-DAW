// obtener el elemento HTML en JS por id
let PARRAFO = document.getElementById("miParrafo");
let boton = document.getElementById("miBoton");


boton.addEventListener("click", function () {
        PARRAFO.innerText = boton.innerText;
    
});