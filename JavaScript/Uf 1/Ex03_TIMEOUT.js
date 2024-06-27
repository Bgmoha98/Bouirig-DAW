//ASI ESTA MAL

// let mivar;

// function miFuncion() {
//     p1.innerText = "Hola";

//     mivar = prompt("Dime tu nombre: ");

//     setTimeout(miFuncion2, 3000);

//     p3.innerText = "!!!!"
// };


// // no poner parentesis de funcion ya que lo ejecutara al momento
// setTimeout(miFuncion, 3000);


// function miFuncion2() {
// p2.innerText = "Adeu!";
// };

// p3.innerText = mivar;

// MEJOR AASI

let mivar;

setTimeout(function(){ //funcion anonima classica

    p1.innerText = "Hola";

    mivar = prompt("Dime tu nombre: ");

    setTimeout(() => { // funcion anonima con arrow function
        p2.innerText = "Adeu!";
        
    }, 3000);

    p3.innerText = "!!!!"

},3000);


p3.innerText = mivar;