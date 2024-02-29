const inputElement = document.querySelector('#nameinput');
const getNameBtn = document.querySelector('#getnamebtn');
const cancelEnterNameBtn = document.querySelector('#goaway');

let enteredNameString;

const getInputedName = () => {
    return new Promise(
        
        (callBackSaccsess, callbackRejeckt) => {
    const handleClickSubmitNameBtn = () => {
       
        enteredNameString = inputElement.value;
        callBackSuccess(enteredNameString);
    }
    getNameBtn.addEventListener('click', handleClickSubmitNameBtn);
  
    
    const handleClicjRejecktName = () => {
    callbackRejeckt('rejeckted');
}
    cancelEnterNameBtn.addEventListener('click', handleClicjRejecktName)


}


)
}
const resultOfInput = getInputedName();

//helloMaker(enteredName);

// function helloMaker(name) {
//     console.log(`Hello ${name}`)
// }