const inputHeightElement = document.querySelector('#heightInput');
const inputWeightElement = document.querySelector('#weighInput');
const calculateButtonElemnt = document.querySelector('.button');
const bmiOutput = document.querySelector('#result1');
const resultOutput = document.querySelector('#result2');
let userHeightInput;
let userWeightInput;
const heightFieldInput = (evt) => {
    // if (notANumber) {
    //     alert("Numbers only");
    // }
    userHeightInput = evt.target.value;
    if (evt.target.value<=220) {
    } else {
        alert("Numbers only")
    }
}
const weightFieldInput = (evt) => {
    // if (notANumber) {
    //     alert("Numbers only");
    // }
    userWeightInput = evt.target.value;
    if (evt.target.value<=220) {
    } else {
        alert("Numbers only")
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
    if (result > 25) {
        result = "Overweight";
    }
    resultOutput.textContent = result;
}
const notANumber = () => {
    if (value === NaN) {
        return true;
    } else {
        return false;
    }
}
inputHeightElement.addEventListener('input', heightFieldInput);
inputWeightElement.addEventListener('input', weightFieldInput);
calculateButtonElemnt.addEventListener('click', submitButtonHandler);