const options = {
  method: 'GET',
  headers: {
    accept: 'application/json',
    Authorization:
      'Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI0OWViMzg0YzY1NDVlNThhNTY1M2RjOWI4NjNlN2E4OSIsInN1YiI6IjY1ZjMwNjBiOTkyNTljMDE2MzVlOWY4YSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.5AiHhqUVl9QUJk2vShkyZEg9wq8rj1c1481QOy2-Zus'
  }
}
const pelis = document.getElementById('pelis')
let titulosCabecera = ['NOMBRE', 'FECHA EMISION', 'LENGUAJE OFICIAL']
let totalPaginas = 0
let generos = [
  {
    id: 28,
    name: 'Action',
    value: 0
  },
  {
    id: 12,
    name: 'Adventure',
    value: 0
  },
  {
    id: 16,
    name: 'Animation',
    value: 0
  },
  {
    id: 35,
    name: 'Comedy',
    value: 0
  },
  {
    id: 80,
    name: 'Crime',
    value: 0
  },
  {
    id: 99,
    name: 'Documentary',
    value: 0
  },
  {
    id: 18,
    name: 'Drama',
    value: 0
  },
  {
    id: 10751,
    name: 'Family',
    value: 0
  },
  {
    id: 14,
    name: 'Fantasy',
    value: 0
  },
  {
    id: 36,
    name: 'History',
    value: 0
  },
  {
    id: 27,
    name: 'Horror',
    value: 0
  },
  {
    id: 10402,
    name: 'Music',
    value: 0
  },
  {
    id: 9648,
    name: 'Mystery',
    value: 0
  },
  {
    id: 10749,
    name: 'Romance',
    value: 0
  },
  {
    id: 878,
    name: 'Science Fiction',
    value: 0
  },
  {
    id: 10770,
    name: 'TV Movie',
    value: 0
  },
  {
    id: 53,
    name: 'Thriller',
    value: 0
  },
  {
    id: 10752,
    name: 'War',
    value: 0
  },
  {
    id: 37,
    name: 'Western',
    value: 0
  }
]

google.charts.load('current', { packages: ['corechart'] })
google.charts.setOnLoadCallback(drawChart)

window.onload = function () {
  fetch(
    'https://api.themoviedb.org/3/discover/movie?include_adult=false&include_video=false&language=es-ES&page=1&sort_by=popularity.desc',
    options
  )
    .then(response => response.json())
    .then(respuesta => {
      totalPaginas = respuesta.total_pages
      let tamanyoRespuesta = respuesta.results

      let tabla = document.createElement('table')
      let tbody = document.createElement('tbody')
      let thead = document.createElement('thead')
      let td = document.createElement('td')
      let tr = document.createElement('tr')
      let volver = document.getElementById('volver')
      let actualizar = document.getElementById('actualizar')

      let botonActualizar = document.createElement('button')
      let etiquetaA = document.createElement('a')
      let textoActualizar = document.createTextNode(' Actualizar ')
      botonActualizar.setAttribute('type', 'button')
      botonActualizar.setAttribute('style', 'padding:10px 20px')

      botonActualizar.appendChild(etiquetaA)
      botonActualizar.addEventListener('click', function () {
        volver.removeChild(volver.firstChild)
        actualizar.removeChild(actualizar.firstChild)
        pelis.removeChild(pelis.firstChild)
        actualizarPagina()
        alert('Página actualizada')
      })
      etiquetaA.appendChild(textoActualizar)
      actualizar.appendChild(botonActualizar)

      let botonAtras = document.createElement('button')
      let a = document.createElement('a')
      let volverAtras = document.createTextNode('Volver atras')
      botonAtras.setAttribute('type', 'button')
      botonAtras.setAttribute('style', 'padding:10px 20px')
      a.setAttribute('href', 'index.html')

      botonAtras.appendChild(a)
      a.appendChild(volverAtras)
      volver.appendChild(botonAtras)

      // Establecer atributos de la tabla
      tabla.setAttribute('border', '2')

      // Agregar la tabla al contenedor de información
      pelis.appendChild(tabla)

      // Agregar el encabezado a la tabla
      tabla.appendChild(thead)
      thead.appendChild(tr)

      // Agregar el cuerpo de la tabla
      tabla.appendChild(tbody)

      for (let i = 0; i < titulosCabecera.length; i++) {
        let th = document.createElement('th')
        let textoCabecera = document.createTextNode(titulosCabecera[i])
        tr.appendChild(th)
        th.appendChild(textoCabecera)
      }

      for (let i = 0; i < tamanyoRespuesta.length; i++) {
        let tr2 = document.createElement('tr') // Fila de la tabla
        let td2 = document.createElement('td')
        let td3 = document.createElement('td')
        let td4 = document.createElement('td')

        let nombre = document.createTextNode(tamanyoRespuesta[i].title)
        tbody.appendChild(tr2)
        tr2.appendChild(td2)
        td2.appendChild(nombre)

        let fecha = document.createTextNode(tamanyoRespuesta[i].release_date)
        tr2.appendChild(td3)
        td3.appendChild(fecha)

        let lenguaje = document.createTextNode(
          tamanyoRespuesta[i].original_language
        )
        tr2.appendChild(td4)
        td4.appendChild(lenguaje)
        // console.log(tamanyoRespuesta[i].title)
      }

      contadorGeneros()
    })
    .catch(err => console.error(err))
}

function contadorGeneros () {
  for (let i = 0; i <= 2; i++) {
    fetch(
      'https://api.themoviedb.org/3/discover/movie?include_adult=false&include_video=false&language=es-ES&page=' +
        (i + 1) +
        '&sort_by=popularity.desc',
      options
    )
      .then(response => response.json())
      .then(datos => {
        // console.log(datos)
        let tamanyoRespuesta = datos.results
        for (let j = 0; j < datos.results.length; j++) {
          for (let k = 0; k < datos.results[j].genre_ids.length; k++) {
            for (let l = 0; l < generos.length; l++) {
              // console.log(datos.results[j].genre_ids[k]);
              // console.log(generos[l].id);
              if (datos.results[j].genre_ids[k] == generos[l].id) {
                generos[l].value = generos[l].value + 1
              }
            }
          }
        }
        drawChart()
      })
      .catch(err => console.error(err))
  }
}

function drawChart () {
  var datosGenero = [['Element', 'Value']]

  for (let i = 0; i < generos.length; i++) {
    datosGenero.push([generos[i].name, generos[i].value])
  }
  var data = google.visualization.arrayToDataTable(datosGenero)

  var view = new google.visualization.DataView(data)
  view.setColumns([
    0,
    1,
    { calc: 'stringify', sourceColumn: 1, type: 'string', role: 'annotation' }
  ])

  var options = {
    title: 'Peliculas con sus respectivos generos:',
    width: 600,
    height: 600,
    bar: { groupWidth: '95%' },
    legend: { position: 'none' }
  }
  var chart = new google.visualization.BarChart(
    document.getElementById('barchart_values')
  )
  chart.draw(view, options)
}

function actualizarPagina () {
  fetch(
    'https://api.themoviedb.org/3/discover/movie?include_adult=false&include_video=false&language=es-ES&page=1&sort_by=popularity.desc',
    options
  )
    .then(response => response.json())
    .then(respuesta => {
      totalPaginas = respuesta.total_pages
      let tamanyoRespuesta = respuesta.results

      let tabla = document.createElement('table')
      let tbody = document.createElement('tbody')
      let thead = document.createElement('thead')
      let td = document.createElement('td')
      let tr = document.createElement('tr')
      let volver = document.getElementById('volver')
      let actualizar = document.getElementById('actualizar')

      let botonActualizar = document.createElement('button')
      let etiquetaA = document.createElement('a')
      let textoActualizar = document.createTextNode(' Actualizar ')
      botonActualizar.setAttribute('type', 'button')
      botonActualizar.setAttribute('style', 'padding:10px 20px')

      botonActualizar.appendChild(etiquetaA)
      botonActualizar.addEventListener('click', function () {
        volver.removeChild(volver.firstChild)
        actualizar.removeChild(actualizar.firstChild)
        pelis.removeChild(pelis.firstChild)
        actualizarPagina()
        alert('Página actualizada')
      })
      etiquetaA.appendChild(textoActualizar)
      actualizar.appendChild(botonActualizar)

      let botonAtras = document.createElement('button')
      let a = document.createElement('a')
      let volverAtras = document.createTextNode('Volver atras')
      botonAtras.setAttribute('type', 'button')
      botonAtras.setAttribute('style', 'padding:10px 20px')
      a.setAttribute('href', 'index.html')

      botonAtras.appendChild(a)
      a.appendChild(volverAtras)
      volver.appendChild(botonAtras)

      // Establecer atributos de la tabla
      tabla.setAttribute('border', '2')

      // Agregar la tabla al contenedor de información
      pelis.appendChild(tabla)

      // Agregar el encabezado a la tabla
      tabla.appendChild(thead)
      thead.appendChild(tr)

      // Agregar el cuerpo de la tabla
      tabla.appendChild(tbody)

      for (let i = 0; i < titulosCabecera.length; i++) {
        let th = document.createElement('th')
        let textoCabecera = document.createTextNode(titulosCabecera[i])
        tr.appendChild(th)
        th.appendChild(textoCabecera)
      }

      for (let i = 0; i < tamanyoRespuesta.length; i++) {
        let tr2 = document.createElement('tr') // Fila de la tabla
        let td2 = document.createElement('td')
        let td3 = document.createElement('td')
        let td4 = document.createElement('td')

        let nombre = document.createTextNode(tamanyoRespuesta[i].title)
        tbody.appendChild(tr2)
        tr2.appendChild(td2)
        td2.appendChild(nombre)

        let fecha = document.createTextNode(tamanyoRespuesta[i].release_date)
        tr2.appendChild(td3)
        td3.appendChild(fecha)

        let lenguaje = document.createTextNode(
          tamanyoRespuesta[i].original_language
        )
        tr2.appendChild(td4)
        td4.appendChild(lenguaje)
        // console.log(tamanyoRespuesta[i].title)
      }

      contadorGeneros()
    })
    .catch(err => console.error(err))
}

function contadorGeneros () {
  for (let i = 0; i <= 2; i++) {
    fetch(
      'https://api.themoviedb.org/3/discover/movie?include_adult=false&include_video=false&language=es-ES&page=' +
        (i + 1) +
        '&sort_by=popularity.desc',
      options
    )
      .then(response => response.json())
      .then(datos => {
        // console.log(datos)
        let tamanyoRespuesta = datos.results
        for (let j = 0; j < datos.results.length; j++) {
          for (let k = 0; k < datos.results[j].genre_ids.length; k++) {
            for (let l = 0; l < generos.length; l++) {
              // console.log(datos.results[j].genre_ids[k]);
              // console.log(generos[l].id);
              if (datos.results[j].genre_ids[k] == generos[l].id) {
                generos[l].value = generos[l].value + 1
              }
            }
          }
        }
        drawChart()
      })
      .catch(err => console.error(err))
  }
}
