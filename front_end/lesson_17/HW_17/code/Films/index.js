
const fetchParams = {
  method: 'GET',
  headers: {
    'X-API-KEY': '1be6749b-dbf1-4f49-814f-8b1bf84b0931',
    'Content-Type': 'application/json',
  },
};

const container = document.querySelector('#filmsContainer');

const fetchAllFilms = async () => {
    const response = await fetch('https://kinopoiskapiunofficial.tech/api/v2.2/films/top?type=TOP_250_BEST_FILMS&page=1', fetchParams);
    const data = await response.json();
    return data.films.map(film => film.filmId);
  };
  

const fetchFilmDetails = async (id) => {
    const response = await fetch(`https://kinopoiskapiunofficial.tech/api/v2.2/films/${id}`, fetchParams);
    const film = await response.json();
    return film;
  };
  
const displayFilm = (film) => {
    const filmElement = document.createElement('div');
    filmElement.className = 'film';
  
    const titleElement = document.createElement('h2');
    titleElement.className = 'title';
    titleElement.textContent = film.nameRu || film.nameEn;
  
    const yearElement = document.createElement('div');
    yearElement.className = 'year';
    yearElement.textContent = `${film.year}`;
  
    const descriptionElement = document.createElement('p');
    descriptionElement.className = 'description';
    descriptionElement.textContent = film.description;
  
    filmElement.append(titleElement);
    filmElement.append(yearElement);
    filmElement.append(descriptionElement);
  
    container.append(filmElement);
  };
  
const upload = async () => {
    const filmIds = await fetchAllFilms();
    const filmDetailsPromises = filmIds.map(id => fetchFilmDetails(id));
    const filmsDetails = await Promise.all(filmDetailsPromises);
    filmsDetails.forEach(film => displayFilm(film));
  };
  upload(); 