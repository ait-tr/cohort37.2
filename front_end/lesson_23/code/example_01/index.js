const responseFromServerPromise = (query) => {
    return fetch(query);
}
// work with promises
// const serverResponse = responseFromServerPromise('https://jsonplaceholder.typicode.com/todos');

// serverResponse
// .then(response => response.json())
// .then(body => console.log(body))

// async function serverWorks(){        //function declaration 
// }

const serverWorks = async(q) => {      //function expression / всё в асинхронной функции
    // console.log('first one');
   const serverResponse = await responseFromServerPromise(q);  //получаем ответ от сервера
//    console.log('plain log from async function');
   const body = await serverResponse.json();  // получаем тело ответа
//    console.log(body);
//    console.log('sync action');
pushToConsole(body);  // вызываем функцию с аргументом тела ответа
}
serverWorks('https://jsonplaceholder.typicode.com/todos');


// serverWorks('https://jsonplaceholder.typicode.com/todos')
// .then(response => response.json())
// .then(body => console.log(body))

function pushToConsole(obj) {
    console.log(obj)
};

// обработка ошибок в асинхронных функциях

const serverWorks1 = async(q) => {      //function expression / всё в асинхронной функции
    try {
       const serverResponse = await responseFromServerPromise(q);  //получаем ответ от сервера
       const body = await serverResponse.json();  // получаем тело ответа
       pushToConsole(body);  // вызываем функцию с аргументом тела ответа
    } catch{

    } finally {

    }

}
serverWorks('https://jsonplaceholder.typicode.com/todos')
.catch()
.finally()


//// чуть упростим
const serverWorks2 = async (q) => {  
    const serverResponse = await fetch(q);  //получаем ответ от сервера
    const body = await serverResponse.json(); //получаем тело ответа
    pushToConsole(body);  //вызываем функцию с аргументом тела ответа
}
serverWorks('https://jsonplaceholder.typicode.com/todos');
