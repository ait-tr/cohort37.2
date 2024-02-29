const inputElement = document.querySelector('#nameInput');
const getNameBtn = document.querySelector('#getNameBtn');
const cancelEnterNameBtn = document.querySelector('#goaway');

let enteredNameString;

const getInputedName = () => {
    return new Promise(
        
        (callBackSuccsess, callBackReject) => {
           //result succsess  если вызван первый аргумент-принято положительное решение статус fullfilled
        const handleSubmitNameBtn = () => {
            enteredNameString = inputElement.value;
            callBackSuccsess(enteredNameString);
        }
        getNameBtn.addEventListener('click', handleSubmitNameBtn)  

        //result reject если вызван второй аргумент-принято отрицательное решение rejected
         const handleRejectNameBtn = () => {
         callBackReject('Refuse input')
          }

        cancelEnterNameBtn.addEventListener('click', handleRejectNameBtn);
    }
       // конец логической функции
    );  
}
const resultOfInput = getInputedName();

resultOfInput
.then(                       
    (argument1) => {console.log(argument1)}, 
    (argument2) => {console.log(argument2)}
    )

resultOfInput.catch(argum => console.log(argum));

resultOfInput.finally(() => {console.log('finally')});

// function helloMaker(name) {
//     console.log(`Hello ${name}`)
// }