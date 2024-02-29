//////////////////// PROMISSES /////////////////

// const enteredName prompt('Input name');


const inputElement = document.querySelector('#nameInput');
const getNameBtn = document.querySelector('#getNameBtn');
const cancelEnterNameBtn = document.querySelector('#goaway');

let enteredNameString;

const getInputedName = (helloMaker) => {
    
    const handleSubmitNameBtn = () => {
        enteredNameString = inputElement.value;
        helloMaker(enteredNameString);
    }
    getNameBtn.addEventListener('click', handleSubmitNameBtn)
    
}
const enteredName = getInputedName(helloMaker);

function helloMaker(name) {
    console.log(`Hello ${name}`)
}