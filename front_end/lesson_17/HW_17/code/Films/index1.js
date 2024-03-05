const container = document.querySelector('.banner-row');

async function  getData(url, data) {
    const response = await fetch(url, data);
    const body = response.json();
    // console.log(body);
    const filmsData = await body;
    const movies = filmsData.films;
    console.log(movies);

    movies.forEach(element => {
        container.append(pushBannerToHtml(element));
    });
}

getData(url, fetchParams);

function pushBannerToHtml(elem){
    const bannerElement = document.createElement('div');
    bannerElement.className = 'banner';
    bannerElement.append(pushImgToHtml(elem),pushGenreToHtml(elem),pushMovieDetailsToHtml(elem));
    return bannerElement;
}

function pushImgToHtml(elem){
    const imgElement = document.createElement('img');
    imgElement.src = elem.posterUrlPreview;
    // console.log(imgElement);
    return imgElement;
}

function pushGenreToHtml(elem){
    const genreElement = document.createElement('div');
    genreElement.className = 'genre';
    genreElement.textContent = elem.genres.map(gen => gen.genre);
    // console.log(genreElement);
    return genreElement;
} 

function pushMovieDetailsToHtml(elem){
    const detailsElement = document.createElement('div');
    detailsElement.className = 'movie-details';
    detailsElement.append(pushYearToHtml(elem), pushNameToHtml(elem),);
    return detailsElement;
}

function pushNameToHtml(elem){
    const nameElement = document.createElement('h3');
    nameElement.textContent = elem.nameRu;
    // console.log(nameElement);
    return nameElement;
}
function pushYearToHtml(elem){
    const yearElement = document.createElement('p');
    yearElement.className = 'year';
    yearElement.textContent = elem.year;
    // console.log(yearElement);
    return yearElement;
}
// function pushDescriptionToHtml(elem){
//     const descriptionElement = document.createElement('p');
//     descriptionElement.textContent = elem.description;
//     return descriptionElement;
// }