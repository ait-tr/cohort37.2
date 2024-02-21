const inputHeightElement = document.querySelector('#heightInput');
const inputWeightElement = document.querySelector('#weighInput');
const calculateButtonElemnt = document.querySelector('.button');
const bmiOutput = document.querySelector('#result1');
const resultOutput = document.querySelector('#result2');

let userHeightInput;
let userWeightInput;


const heightFieldInput = (evt) => {
    userHeightInput = evt.target.value;
    if (isNaN(userHeightInput)) {
        alert("Numbers only");
    }
   
}

const weightFieldInput = (evt) => {
    userWeightInput = evt.target.value;
    if (isNaN(userWeightInput)) {
        alert("Numbers only");
    }
    
}

const submitButtonHandler = () => {
    let bmi = Math.round(userWeightInput / ((userHeightInput / 100) ** 2));
    bmiOutput.textContent = bmi;
    let result;
    if (bmi > 18 && bmi < 25) {
        result = "Okay";
    }
    if (bmi < 18) {
        result = "Underweight ";
    }
    if (bmi >= 25) {
        result = "Overweight";
    }
    resultOutput.textContent = result;
}


inputHeightElement.addEventListener('input', heightFieldInput);
inputWeightElement.addEventListener('input', weightFieldInput);
calculateButtonElemnt.addEventListener('click', submitButtonHandler);