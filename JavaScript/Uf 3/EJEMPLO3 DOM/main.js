

window.onload = function () {
    const miDiv = document.getElementById("miDiv"); // obtengo el elemento con id miDev
    let parrafo = document.createElement("p");    // Crea un parrafo
    let textoParrafo = document.createTextNode("Hola ALUMNOS"); //creo un nodo de texto
    
    parrafo.setAttribute("id","miP"); // asigno id con valor miP - id="miP"
    parrafo.setAttribute("style","color:red;"); //asigno style con valor color red  - style="color:red;
    
    parrafo.appendChild(textoParrafo); // al parrafo le añado como hijo un nodo de texto
    miDiv.appendChild(parrafo); // al div le añado un hijo de tipo/elemento p

    //miDiv.removeChild(parrafo); // elimina al hijo p con todos sus valores, atributos, hasta los hijos que podría tener ese parrafo
    parrafo.parentNode.removeChild(parrafo.parentNode.firstChild); // desde el parrafo le dice al padre que elimini el primer hijo nodo que tiene
    //parrafo.parentNode.removeChild(parrafo); 

    parrafo.setAttribute("id", "miP2"); // sobre escribir el id
    parrafo.removeAttribute("style"); // elimina un atributo
}