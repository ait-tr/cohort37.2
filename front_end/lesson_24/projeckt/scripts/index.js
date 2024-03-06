//https://kinopoiskapiunofficial.tech/api/v2.2/films/ {сюда вставить полученный id}

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
   // insertDataOfMovie(body);
   const arrayOfFilms = body.films;
   console.log('arr '+ arrayOfFilms[0].filmId);
   const dataFilmsWithDescr = await body.films.forEach(async (element, index)=>{
    const dataMovieEl = await fetch(`https://kinopoiskapiunofficial.tech/api/v2.2/films/${element.filmId}`, f);
    const descrptBody = await dataMovieEl.json();
    arrayOfFilms[index] = {...arrayOfFilms[index], description: descrptBody.description}
    console.log(arrayOfFilms[index]);

    
    
   })
 console.log(body.films);
 console.log(dataFilmsWithDescr);   
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











