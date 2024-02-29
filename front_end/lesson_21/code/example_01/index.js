// Синхронно ждем ввода от пользователя
// const enteredName = prompt('Введите имя');

// найдем элементы на странице
const inputElement = document.querySelector('#nameinput');
const getNameBtn = document.querySelector('#getnamebtn');
const cancelEnterNameBtn = document.querySelector('#goaway');

let enteredNameString;

const getInputedName = (helloMaker) => {
    const handleClickSubmitNameBtn = () => {
        enteredNameString = inputElement.value;
        helloMaker(enteredNameString);
    }
    getNameBtn.addEventListener('click', handleClickSubmitNameBtn);
}

getInputedName(helloMaker);



function helloMaker(name) {
    console.log(`Hello ${name}`)
}

