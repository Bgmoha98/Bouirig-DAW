var dades = [
  [41.56984, 1.99643, "Institut Nicolau Copernic"]
];

// Posició (latitud i longitud) inicial del mapa i nivell de Zoom aplicat.
var map = L.map('map').setView([51.505, -0.09], 13);

// Tipus de vista que volem utilitzar i màxim nivell de Zoom permès.
L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
    maxZoom: 8,
    attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
}).addTo(map);

// Bucle per a recorrer l'array dades.
dades.forEach((element) => {
  const marker = L.marker([element[0], element[1]], {
    title: element[2],
  }).addTo(map);
});
