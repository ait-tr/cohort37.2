// создаем функцию которая нам вернет промис с результатом запроса по адресу 'q'
const getGithubData = (q) => {
    return fetch(q)
}

const githubDataKate = getGithubData('https://api.github.com/users/kate8kate');



// console.log(githubDataKate);

githubDataKate.then((response)=> {return response.json()})
    .then((resultObject) => {console.log(resultObject);
    showAvatar(resultObject.avatar_url);
    return resultObject;
})
    .then((result) => {
        showALogin(result.name);
    })


    function showAvatar(avatarUrl) {
        const conteinerAvatar = document.querySelector('#ava');
        const avatarElement = document.createElement('img')
        avatarElement.src = avatarUrl;
     conteinerAvatar.append(avatarElement)
    }

    function showALogin(name) {
        const conteinerName = document.querySelector('#info');
        const nameElement = document.createElement('h1')
        nameElement.textContent = name;
        conteinerName.append(nameElement)
    }   
  //https://jsonplaceholder.typicode.com/
  //https://jsonplaceholder.typicode.com/todos