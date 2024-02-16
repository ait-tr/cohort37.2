const inputElement = document.querySelector('#input-field')

let userInput;

const inputFieldInput = (evt)=> {
    userInput = evt.target.value;
    //console.log(userInput);
}

inputElement.addEventListener('input', inputFieldInput)

const createButtonElemnt = document.querySelector('button.btn');
console.log(createButtonElemnt);
const submitButtonHandler = () => {
    textTextElement.textContent = userInput;
}

createButtonElemnt.addEventListener('click', submitButtonHandler);

const textTextElement = document.querySelector('#text');

