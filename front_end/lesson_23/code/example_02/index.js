// Отобразить в HTML аватарку пользователя ГитХаб, имя и список репозиториев

const responseFromServerPromise = (q) => {
    return fetch(q)
}
const serverWorks = async(q) => {
    const serverResponse = await responseFromServerPromise(q);
    const body = await serverResponse.json();
    console.log(body);
    const repoUrl = await fetch(body.repos_url);
    const repo = await repoUrl.json()

    showName(body.login);
    showAvatar(body.avatar_url);
    console.log(repo);
    repo.forEach(repoElement => showRepos(repoElement));
}
serverWorks('https://api.github.com/users/dedVitalik')

function showName(name) {
    const containerForName = document.querySelector('#username');
    containerForName.textContent = name;  
}
function showAvatar(avatarUrl) {
    const containerForAva = document.querySelector('#avatar');
    const avaElement = document.createElement('img');
    avaElement.src = avatarUrl;
    containerForAva.append(avaElement);
}

function showRepos(repo) {
    const reposContainer = document.querySelector('#repos');
        const repoElement = document.createElement('li');
        repoElement.textContent = repo.name;
        reposContainer.append(repoElement);
}

