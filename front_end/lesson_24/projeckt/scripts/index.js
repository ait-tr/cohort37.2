

  const fetchParams = {
    method: 'GET',
    headers: {
      'X-API-KEY': '1be6749b-dbf1-4f49-814f-8b1bf84b0931',
      'Content-Type': 'application/json'
    }
  };


const movieData = async (q, f) => {
    const serverReponse = await fetch(q, f);
    const body = await serverReponse.json(); 
    insertDataOfMovie(body.films);
 console.log(body.films)   
}
const dataOfMovie = movieData('https://kinopoiskapiunofficial.tech/api/v2.2/films/top?type=TOP_250_BEST_FILMS&page=1', fetchParams );
console.log(dataOfMovie);


const movieYear = document.querySelector('#year');
const poster = document.querySelector('.background');
const movieTitle = document.querySelector('#title');
const movieTieser = document.querySelector('#teaser');
const genreElement = document.querySelector('#genre');

// const insertDataOfMovie = (elem) =>{
//     const values = Object.values(elem);
//     values.forEach((object) => {
//         const keys = Object.keys(object);
//             const dataValue = object.nameRu;
//             const movieTitleData = document.createElement('div');
//             movieTitleData.textContent = dataValue;
//             movieTitle.append(movieTitleData);

//     })
// }
const insertDataOfMovie = (elem) =>{
    const values = Object.values(elem);
    values.forEach((object) => {
        insertMovie(object); 
       
    })
}




// const insertMovie = (object) => {

//     const dataValueTitle = object.nameRu;
//     const movieTitleData = document.createElement('div');
//     movieTitleData.textContent = dataValueTitle;
//     movieTitle.append(movieTitleData);

//     const dataValueYear = object.year; 
//     const movieYearData = document.createElement('div');
//     movieYearData.textContent = dataValueYear;
//     movieYear.append(movieYearData);

//     const dataValueBckImg = object.posterUrl; 
//     poster.style.backgroundImage = `url(${dataValueBckImg})`;
// }


// const insertMovieYear = (object) => {
//     const dataValue = object.year; 
//     const movieYearData = document.createElement('div');
//     movieYearData.textContent = dataValue;
//     movieYear.append(movieYearData);
// }











