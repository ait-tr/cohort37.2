
// Находим форму по её идентификатору
const bmiForm = document.querySelector('#bmi-form');

//---------------------------------------

//Находим элемент страницы по id 
const inputElementHeight = document.querySelector('#height');
const inputElementWeight = document.querySelector('#weight');
const createButtonElement = document.querySelector('#click');
const textResultElement = document.querySelector('#bmi-value');
const textStatusElement = document.querySelector('#bmi-result'); 

let userInputHeight;
let userInputWeight;

const inputHeightHandler = (event) =>{
    userInputHeight = parseInt(event.target.value);
    if (isNaN(userInputHeight)) {
        alert("Пожалуйста, вводите только числа.");
        event.target.value = '';
    // console.log(userInputHeight);
}
}
inputElementHeight.addEventListener('input', inputHeightHandler);

const inputWeightHandler = (event) =>{
    userInputWeight = parseInt(event.target.value);
    if (isNaN(userInputWeight)) {
        alert("Пожалуйста, вводите только числа.");
        event.target.value = '';
    // console.log(userInputWeight);
}
}
inputElementWeight.addEventListener('input', inputWeightHandler);

    // Проверка на пустые поля
    if (!heightInMeters || !weight) {
        alert("Пожалуйста, заполните оба поля.");
        return;
      }

const handlerClick = (event) => {
    event.preventDefault();

    console.log(userInputHeight, userInputWeight);
    console.log(calculateBMI(userInputHeight, userInputWeight)); // рассчитали коэфф
    console.log(displayStatus);
    textResultElement.textContent = 'calculateBMI.toFixed(2)';
    textStatusElement.textContent = bmiStatus;
}

createButtonElement.addEventListener('click', handlerClick);

function calculateBMI(height, weight) {
    const heightInMeters = height / 100; // перевоод сантиметры в метры.
    return weight / (heightInMeters * heightInMeters);

console.log(`${res.toFixed(2)}`);
}

function displayStatus(bmi) {
    
    if (bmi < 18.5) {
        result = 'Недовес';
    } else if (bmi >= 18.5 && bmi < 25) {
        result = 'Нормальный';
    } else if (bmi >= 25 && bmi < 30) {
        result = 'Лишний вес';
    } else {
        result = 'Ожирение';
    }
    console.log (`${result}`);
}




