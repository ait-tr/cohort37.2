// результат промиса = данные с которыми промис обещает вызвать функцию resolve

// создаем функцию которая нам вернет промис с результатом запроса по адресу 'q'
const getGithubData = (q) => {
    return fetch(q)
}

const githubDataKate = getGithubData('https://api.github.com/users/kate8kate');
// console.log(githubDataKate);

// const newTestPromise = githubDataKate
//     .then((response) => {
//         response.json()
//         return 111
//     }) // then в этой строке вернет промис, с результатом вызова его функции-аргумента

// newTestPromise.then((result) => {console.log(result);return 222}).then((result) => {console.log(result)})

// виртуальный пример
// .then((курица) = { жарь(курицу) return пожареная курица})
// .then((пожареная курица) => {кормить собаку})


githubDataKate.then((response) => {return response.json()}) // then в этой строке вернет промис, с результатом вызова его функции-аргумента
.then((resultObject) => {
    console.log(resultObject);
    showAvatar(resultObject.avatar_url);
    return resultObject.repos_url;
})
.then((repos) => {
    console.log(repos);
    const githubDataKateRepos = getGithubData(repos);
    githubDataKateRepos
    .then((response) => {return response.json()})
    .then((resultObject) => {
        console.log(resultObject[0].name)
    })
})



//somePromise.then((result) => {console.log; rerutn 111 }) // возвращает промис





function showAvatar(avatarUrl) {
    const containerForAvatar = document.querySelector('#ava');
    const avatarElement = document.createElement('img');
    avatarElement.src = avatarUrl;
    containerForAvatar.append(avatarElement);
}



// const player = {
//     weight: 80,
//     height: 180,
// }
// console.log(typeof player);
// const jsonPlayer = JSON.stringify(player);
// console.log(typeof jsonPlayer);





//
//<img src="https://"></img>

//<h1>Header</h1>

{/* <ul>
    <li></li>
</ul> */}