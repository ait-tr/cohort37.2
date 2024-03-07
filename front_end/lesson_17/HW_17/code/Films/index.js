
const fetchParams = {
  method: 'GET',
  headers: {
    'X-API-KEY': '1be6749b-dbf1-4f49-814f-8b1bf84b0931',
    'Content-Type': 'application/json',
  },
};
const url = 'https://kinopoiskapiunofficial.tech/api/v2.2/films/top?type=TOP_250_BEST_FILMS&page=1';
const container = document.querySelector('.container');

async function getData() {
  container.innerHTML = '';
  const response = await fetch(url, fetchParams);
  const body = await response.json();
  const films = body.films;

  films.forEach(film => {
      displayFilm(film); 
  })
}
getData(); 

const displayFilm = (film) => {
    const filmElement = document.createElement('div');
    filmElement.className = 'film';
  
    const titleElement = document.createElement('div');
    titleElement.className = 'title';
    titleElement.textContent = film.nameRu || film.nameEn;
  
    const genreElement = document.createElement('div');
    genreElement.className = 'genre';
    const genres = film.genres.map(genre => genre.genre).join(', '); 
    genreElement.textContent = genres;

    const yearElement = document.createElement('div');
    yearElement.className = 'year';
    yearElement.textContent = `${film.year}`;

    const imgElement = document.createElement('img');
    imgElement.src = film.posterUrlPreview; 
  
    const descriptionElement = document.createElement('div');
    descriptionElement.className = 'description';
    descriptionElement.textContent = film.description;
    
    filmElement.append(titleElement, genreElement, yearElement, imgElement, descriptionElement);
    container.append(filmElement);
  };