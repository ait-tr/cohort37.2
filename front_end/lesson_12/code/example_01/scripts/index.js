const inputElement = document.querySelector('#input-field');

// console.log(inputElement);
let userInput;

const inputFieldInput = (evt) => {
    userInput = evt.target.value;
    console.log(userInput);
}

inputElement.addEventListener('input', inputFieldInput);

const createButtonElement = document.querySelector('button.btn');
// console.log(createButtonElement);

const submitButtonHandler = (evt) => {
    // console.log(evt);
    testTextElement.textContent = 'Тест контент';
}

createButtonElement.addEventListener('click', submitButtonHandler);

////////////////////////////////////////////////////////////////////
const testTextElement = document.querySelector('#text');
// console.log(testTextElement);
