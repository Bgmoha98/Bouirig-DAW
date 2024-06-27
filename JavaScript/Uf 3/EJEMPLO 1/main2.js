let PARRAFO = document.getElementById("miParrafo");
let boton = document.getElementById("miBoton");
let botonOculto = document.getElementById("miBotonOculto");

document.getElementById("miBotonOculto").style.visibility = "hidden";

boton.addEventListener("click", function () {

    botonOculto = document.getElementById("miBotonOculto").style.visibility = "visible";
    
});

botonOculto.addEventListener("click", function () {

    botonOculto = document.getElementById("miBotonOculto").style.visibility = "hidden";

});

