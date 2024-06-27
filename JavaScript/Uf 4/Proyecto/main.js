window.onload =  () => {
  // Construct the catalog query string
  url =
    'http://data.ct.gov/resource/9k2y-kqxn.json?organization_type=Public%20School%20Districts&$$app_token=CGxaHQoQlgQSev4zyUh5aR5J3'

  // Intialize our map
  let google1 = new google;
  var center = google1.maps.LatLng(41.7656874, -72.680087)
  var mapOptions = {
    zoom: 8,
    center: center
  }
  
  var map = google1.maps.Map(document.getElementById('map'), mapOptions)

  // Retrieve our data and plot it
  $.getJSON(url, function (data, textstatus) {
    console.log(data)
    $.each(data, function (i, entry) {
      var marker = new google.maps.Marker({
        position: new google.maps.LatLng(
          entry.location_1.latitude,
          entry.location_1.longitude
        ),
        map: map,
        title: location.name
      })
    })
  })
}

$.ajax({
    url: "https://data.cityofnewyork.us/resource/gi8d-wdg5.json",
    type: "GET",
    data: {
      "$limit" : 5000,
      "$$app_token" : "LINDMPRyQ1E0ZxKaVLG66MUzJ"
    }
}).done(function(data) {
  alert("Retrieved " + data.length + " records from the dataset!");
  console.log(data);
});

const url = 'https://api.themoviedb.org/3/discover/movie?include_adult=false&include_video=false&language=en-US&page=1&sort_by=popularity.desc';
const options = {
  method: 'GET',
  headers: {
    accept: 'application/json',
    Authorization: 'Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI0OWViMzg0YzY1NDVlNThhNTY1M2RjOWI4NjNlN2E4OSIsInN1YiI6IjY1ZjMwNjBiOTkyNTljMDE2MzVlOWY4YSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.5AiHhqUVl9QUJk2vShkyZEg9wq8rj1c1481QOy2-Zus'
  }
};

fetch(url, options)
  .then(res => res.json())
  .then(json => console.log(json))
  .catch(err => console.error('error:' + err));