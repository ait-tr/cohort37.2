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
   const arrayOfFilms = body.films;
   //console.log('arr '+ arrayOfFilms[0].filmId);
   const dataFilmsWithDescr = await body.films.forEach(async (element, index)=>{
    const dataMovieEl = await fetch(`https://kinopoiskapiunofficial.tech/api/v2.2/films/${element.filmId}`, f);
    const descrptBody = await dataMovieEl.json();
   arrayOfFilms[index] = {...arrayOfFilms[index], description: descrptBody.description}
    console.log(arrayOfFilms[index].nameRu);
    document.querySelector('main').append(createPoster(arrayOfFilms[index]));
    console.log(createPoster(arrayOfFilms[index]));

    
    
   })


console.log(arrayOfFilms[0]);   
}
const dataOfMovie = movieData('https://kinopoiskapiunofficial.tech/api/v2.2/films/top?type=TOP_250_BEST_FILMS&page=1', fetchParams );





const movieYear = document.querySelector('#year');
const poster = document.querySelector('.background');
const movieTitle = document.querySelector('#title');
const movieTieser = document.querySelector('#teaser');
const genreElement = document.querySelector('#genre');


const createPoster = (element) =>{


    const mainContainer = document.createElement('div');
    mainContainer.classList.add('item');
    const dataValueBckImg = element.posterUrl; 
    mainContainer.style.backgroundImage = `url(${dataValueBckImg})`;

    const containerTitle = document.createElement('div');
    containerTitle.classList.add('title');
    containerTitle.textContent = element.nameRu;

    const containerYear = document.createElement('div');
    containerYear.classList.add('year');
    containerYear.textContent = element.year;

    const containerTeaser = document.createElement('div');
    containerTeaser.classList.add('teaser');
    containerTeaser.textContent = element.description;
    
    const wrapContainer = document.createElement('div');
    wrapContainer.classList.add('wrap');
    wrapContainer.appendChild(containerTitle);
    wrapContainer.appendChild(containerYear);
    wrapContainer.appendChild(containerTeaser);


    mainContainer.appendChild(wrapContainer);

    const container = document.createElement('div');
    container.classList.add('container');
    container.appendChild(mainContainer);

    return container;
   

}




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
// const insertDataOfMovie = (elem) =>{
//     const values = Object.values(elem);
//     values.forEach((object) => {
//         insertMovie(object); 
       
//     })
// }




// const insertMovie = (object) => {

//     const dataValueTitle = object.nameRu;
//     const movieTitleData = document.createElement('div');
//     movieTitleData.textContent = dataValueTitle;
//     movieTitle.append(movieTitleData);

//     const dataValueYear = object.year; 
//     const movieYearData = document.createElement('div');
//     movieYearData.textContent = dataValueYear;
//     movieYear.append(movieYearData);

//     const dataMovieDescript = object.description; 
//     const  descriptionData= document.createElement('div');
//     descriptionData.textContent = dataMovieDescript;
//     movieTieser.append(movieYearData);

//     const dataValueBckImg = object.posterUrl; 
//     poster.style.backgroundImage = `url(${dataValueBckImg})`;
// }


// const insertMovieYear = (object) => {
//     const dataValue = object.year; 
//     const movieYearData = document.createElement('div');
//     movieYearData.textContent = dataValue;
//     movieYear.append(movieYearData);
// }











