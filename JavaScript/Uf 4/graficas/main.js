datos = [
    ['Agua', 3],
    ['Fuego', 6],
    ['Planta', 4],
    ['Tierra', 7],
    ['Electrico', 2]
  ];

// Load the Visualization API and the corechart package.
google.charts.load('current', { packages: ['corechart'] })

// Set a callback to run when the Google Visualization API is loaded.
google.charts.setOnLoadCallback(drawChart)

// Callback that creates and populates a data table,
// instantiates the pie chart, passes in the data and
// draws it.
function drawChart () {
  // Create the data table.
  var data = new google.visualization.DataTable()
  data.addColumn('string', 'Topping')
  data.addColumn('number', 'Slices')
  data.addRows(datos)

  // Set chart options
  var options = {
    title: 'Tipos de Pokemons',
    width: 600,
    height: 500
  }

  // Instantiate and draw our chart, passing in some options.
  var chart = new google.visualization.PieChart(
    document.getElementById('chart_div')
  )
  chart.draw(data, options)
}
