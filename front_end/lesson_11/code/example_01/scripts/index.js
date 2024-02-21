const listItemTwoElement = document.querySelector('#second-item');
//document.getElementById('second-item');


console.log(listItemTwoElement);


// listItemTwoElement.style.backgroundColor = 'blue';

// listItemTwoElement.classList.add('list-item_done');

const listItemTwoHandler = () => {
    listItemTwoElement.classList.toggle('list-item_done');
}

listItemTwoElement.addEventListener('click', listItemTwoHandler);

const inputElement = document.querySelector('.task-input');
const createButton = document.querySelector('.btn');
let userInputText;

const createButtonHandler = () => {
    const newListItem = document.createElement('li');
    newListItem.classList.add('list-item');
    newListItem.textContent = userInputText;
    const listAllElements = document.querySelector('.list');
    listAllElements.append(newListItem);
}

createButton.addEventListener('click', createButtonHandler);

// const str = 'word';
// console.log(`My favourite word is "${str}"`);

const inputHandler = () => {
    // console.log(evt);
    // userInputText = evt.target.value;
    userInputText = inputElement.value;

}

inputElement.addEventListener('input', inputHandler);

//
const btnHandler = (evt) => {
    evt.preventDefault();

}