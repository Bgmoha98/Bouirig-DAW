let PARRAFO = document.getElementById("miParrafo");
let boton = document.getElementById("miBoton");

boton.addEventListener("click", function () {
    let texto = " " + revertir() + " ";
    if (PARRAFO.value === "") {
        PARRAFO.innerText = texto;
    } else {
        PARRAFO.innerText = PARRAFO.innerText + texto;
    }
    
});


function revertir(){
    let text = "TEXTO";
    let textoRevertido = "";
    for (let i = text.length; i > 0; i--) {
        textoRevertido = textoRevertido + text.charAt(i-1);
        
    }
    return textoRevertido;
}