const responseFromServerPromise = (query) => {
    return fetch(query);
}

// work with promises
// const serverResponse = responseFromServerPromise('https://jsonplaceholder.typicode.com/todos');
// serverResponse
// .then(response => response.json())
// .then(body => console.log(body))


// function declaration 
// async function serverWorks() {
// }

// function expressin / arrow function / все в асинхронной функции
const serverWorks = async (q) => {
    // console.log('first one');
    const serverReponse = await responseFromServerPromise(q); // получаем ответ от сервера
    // console.log('plain log from async function');
    const body = await serverReponse.json(); // получаем тело ответа
    // console.log(body);
    // console.log('sync action');
    pushToConsole(body); // вызываем функцию с аргементом тела ответа
}

serverWorks('https://jsonplaceholder.typicode.com/todos');



// а здесь каша:
// const serverWorks = async (q) => {
//     const serverReponse = await responseFromServerPromise(q); // получаем ответ от сервера
//     return serverReponse // возвращаем ответ от сервера, функция serverWorks вернет промис с этим результатом
// }
// serverWorks('https://jsonplaceholder.typicode.com/todos') // убеждаемся что асинхронная функция возвращает промис!
// .then(response => response.json())
// .then(body => pushToConsole(body))


function pushToConsole(obj) {
    console.log(obj)
};



// Обработка ошибок в асинхронных функциях with

const serverWorks = async (q) => {
    try {
        const serverReponse = await responseFromServerPromise(q); // получаем ответ от сервера
        const body = await serverReponse.json(); // получаем тело ответа
        pushToConsole(body); // вызываем функцию с аргементом тела ответа
    } catch {

    } finally {

    }
    
}

serverWorks('https://jsonplaceholder.typicode.com/todos')
.catch()
.finally()
//

// чуть упростим
const serverWorks = async (q) => {
    const serverReponse = await fetch(q); // получаем ответ от сервера
    const body = await serverReponse.json(); // получаем тело ответа
    pushToConsole(body); // вызываем функцию с аргементом тела ответа
}

serverWorks('https://jsonplaceholder.typicode.com/todos');


// Классная работа: отобразить в HTML аватарку пользователся ГитХаб, имя, и список репозиториев

