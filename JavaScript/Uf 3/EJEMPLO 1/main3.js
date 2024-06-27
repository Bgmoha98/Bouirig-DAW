let PARRAFO = document.getElementById("miParrafo");
let boton = document.getElementById("miBoton");

boton.addEventListener("click", function () {
    if (PARRAFO.value === "") {
        PARRAFO.innerText = "TEXTO ";
    } else {
        PARRAFO.innerText = PARRAFO.innerText + " TEXTO ";
    }
    
});

