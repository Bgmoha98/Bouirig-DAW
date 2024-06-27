let mivar = "";
let mibool = true;
let miIntervalo;

miIntervalo = setInterval(()=>{
    if (mibool) {
        p1.innerText = "HOLA";
    } else {
        p1.innerText = "ADEU!";
    }

    mibool = !mibool;
},1000);

function parar() {
    clearInterval(miIntervalo)
}