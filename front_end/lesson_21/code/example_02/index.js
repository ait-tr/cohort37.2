// Синхронно ждем ввода от пользователя
// const enteredName = prompt('Введите имя');

// найдем элементы на странице
const inputElement = document.querySelector('#nameinput');
const getNameBtn = document.querySelector('#getnamebtn');
const cancelEnterNameBtn = document.querySelector('#goaway');

let enteredNameString;

const getInputedName = () => {
    return new Promise(
        
        // начало логики
        (callBackSuccess, callBackReject) => {
       
        // Один кусок логики
        // Если вызван первый аргумент - принято решение что все хорошо, статус fullfilled
            const handleClickSubmitNameBtn = () => {
            enteredNameString = inputElement.value;
            callBackSuccess(enteredNameString);
        }
        getNameBtn.addEventListener('click', handleClickSubmitNameBtn);

        // Другой кусок логики промиса
        // Если вызван второй аргумент - принято решение что что-то пошло не так, статус rejected
        const handleClickRejectNameBtn = () => {
            callBackReject('Отказался вводить')
        }
        cancelEnterNameBtn.addEventListener('click', handleClickRejectNameBtn)       
    }
    // конец логики
    )
}
const resultOfInput = getInputedName();

resultOfInput
    .then((argum) => { console.log(argum) })
    .catch(argum => console.log('proof ' + argum))

// .finally(() => {console.log('finish')})





// function helloMaker(name) {
//     console.log(`Hello ${name}`)
// }
