// создаем функцию которая нам вернет промис с результатом запроса по адресу 'q'
const getGithubData = (q) => {
    return fetch(q)
}

const githubDataKate = getGithubData('https://api.github.com/users/kate8kate');

// console.log(githubDataKate);

githubDataKate
    .then((response) => response.json()) // then в этой строке вернет промис с результатом вызова его функции-аргемента(объект)
    .then((resultObject) => {
        console.log(resultObject);
        showAvatar(resultObject.avatar_url);
        showName(resultObject.name);
        showRepos(resultObject.repos_url);

    return resultObject.reposUrl;
    })
    .then((repos) => {
        console.log(repos);
        const githubDataKateRepos = getGithubData(repos);
        githubDataKateRepos
        .then((response) => {returnresponse.json()})
        .then((resultObject) => {
            console.log(resultObject(0).name)})
        
    })


  
function showAvatar(avatarUrl) {
    const containerForAva = document.querySelector('#ava');
    const avaElement = document.createElement('img');
    avaElement.src = avatarUrl;
    containerForAva.append(avaElement);
}   
function showName(name) {
    const containerForName = document.querySelector('#name');
    containerForName.textContent = name;  
}
function showRepos(reposUrl) {
    const containerForRepos = document.querySelector('#repos');
    const reposElement = document.createElement('repos');
    reposElement.src = reposUrl;
    containerForRepos.append(reposElement);
}
