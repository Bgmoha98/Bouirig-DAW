
let aleatori = null;
let contador;
let partidesJugades = 0;
let partidesGanadas = 0;
const MIN_VALOR = 0;
const MAX_VALOR = 5;

function mifuncion() {

    let valorSolicitado;

    console.log(parrafo);

    if (aleatori === null) {
        aleatori = numAletori(MIN_VALOR, MAX_VALOR);
        contador = 0;
        partidesJugades++;
        maxIntentos.innerText = "";
    }

    setCookie("contadorPartidas", partidesJugades, 5);
    setCookie("contadorPartidasGanadas", partidesGanadas, 5);

    valorSolicitado = numero.value;

    if (contador >= 3) {
        maxIntentos.innerHTML = "<p><strong> Partida perdida, has superado el maximo de intentos</strong><p>";
        
        partidas.innerText = "Partidas Jugadas: " + getCookie("contadorPartidas");
        aleatori = null;
    } else {
    aleatori = verificarNumero(aleatori, valorSolicitado, contador);
    }

    contador++;
    console.log(aleatori);
}



// funciones para generar numeros aleatoris del 0 al 5

function numAletori(min, max) {
    return Math.floor(Math.random() * (max - min + 1) + min);;

}



// funcion para verificar si el numero introducido es mayor, menor o el correcto

function verificarNumero(aleatori, valorSolicitado, contador) {

    if (aleatori < valorSolicitado) {
        parrafo.innerText = "El numero introducido es mayor";


    } else if (aleatori > valorSolicitado) {
        parrafo.innerText = "El numero introducido es menor";

    } else {
        parrafo.innerHTML = "Bravo!!! has acertado con <strong>" + contador
            + "</strong> intentos <br><br> Introduce un numero entre 0 y 5";

        partidas.innerText = "Partidas Jugadas: " + getCookie("contadorPartidas");
        partidesGanadas++;
        ganadas.innerText = "Partidas Ganadas: " + getCookie("contadorPartidasGanadas");
        aleatori = null;
    }

    numero.value = "";

    return aleatori;
}



