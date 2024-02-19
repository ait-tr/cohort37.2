const inputElement = document.querySelector('#input-field');

// console.log(inputElement);
let userInput;

const inputGieldInput = (evt) => {
    userInput = evt.target.value;
    console.log(userInput);
// console.log(event);
// console.log(event.target.value);

}
inputElement.addEventListener('input', inputGieldInput);

const createButtonElement = document.querySelector('button.btn');
// console.log(createButtonElement);

const submitButtonHandler = (event) => {
    // console.log(evt);
    textTextElement.textContent = 'Text content';
}
createButtonElement.addEventListener('click', () => console.log(userInput));

///////////////////////////////////////////////////////
const textTextElement = document.querySelector('#text');
// console.log(textTextElement);
textTextElement.textContent = 'Text content';

