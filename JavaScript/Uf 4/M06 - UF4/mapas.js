
let map; // Declara la variable del mapa fuera de las funciones

window.onload = function() {
  let url = 'https://api.ip2location.io/?key=A6B57ABA1AC240C03A1C4CBC1C24ACF3&ip=8.8.8.8';
  fetch(url)
    .then(response => response.json())
    .then(respuesta => {
      let volver = document.getElementById('volver')
      let botonAtras = document.createElement('button')
      let a = document.createElement('a')
      let volverAtras = document.createTextNode('Volver atras')
      botonAtras.setAttribute('type', 'button')
      botonAtras.setAttribute('style', 'padding:10px 20px')
      a.setAttribute('href', 'index.html')

      botonAtras.appendChild(a)
      a.appendChild(volverAtras)
      volver.appendChild(botonAtras)

      var dades = [[respuesta.latitude, respuesta.longitude]];

      // Posició (latitud i longitud) inicial del mapa i nivell de Zoom aplicat.
      map = L.map('map').setView([respuesta.latitude, respuesta.longitude], 5);

      // Tipus de vista que volem utilitzar i màxim nivell de Zoom permès.
      L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
        maxZoom: 18,
        attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
      }).addTo(map);

      // Bucle per a recorrer l'array dades.
      dades.forEach(element => {
        const marker = L.marker([respuesta.latitude, respuesta.longitude]).addTo(map);
        if (element[2]) {
          marker.bindPopup(element[2]);
        }
      });
    })
    .catch(err => console.error(err));
}

function buscarIP() {
  let inputIP = document.getElementById('ip').value;
  let url = 'https://api.ip2location.io/?key=A6B57ABA1AC240C03A1C4CBC1C24ACF3&ip=' + inputIP;

  // Destruir el mapa existente si ya está inicializado
  if (map) {
    map.remove();
  }

  fetch(url)
    .then(response => response.json())
    .then(respuesta => {

      var dades = [[respuesta.latitude, respuesta.longitude]];

      // Posició (latitud i longitud) inicial del mapa i nivell de Zoom aplicat.
      map = L.map('map').setView([respuesta.latitude, respuesta.longitude], 5);

      // Tipus de vista que volem utilitzar i màxim nivell de Zoom permès.
      L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
        maxZoom: 18,
        attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
      }).addTo(map);

      // Bucle per a recorrer l'array dades.
      dades.forEach(element => {
        const marker = L.marker([respuesta.latitude, respuesta.longitude]).addTo(map);
        if (element[2]) {
          marker.bindPopup(element[2]);
        }
      });
    })
    .catch(err => console.error(err));
}
