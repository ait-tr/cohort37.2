const inputHeightElement = document.querySelector('#heightInput');

let userHeightInput;

const inputHeightFieldInput = (evt)=> {
    userHeightInput = Number(evt.target.value);
    console.log(userHeightInput);
}

inputHeightElement.addEventListener('input', inputHeightFieldInput)

const inputWeightElement = document.querySelector('#weighInput');

let userInputWeight =1;

const inputWeightFieldInput = (evt)=> {
    userInputWeight = Number(evt.target.value);
    console.log(userInputWeight);
}

inputWeightElement.addEventListener('input', inputWeightFieldInput);

const calculateButtonElemnt = document.querySelector('.button');

//console.log(calculateButtonElemnt);

const bmiOutput = document.querySelector('#result1');

const submitButtonHandler = () => {
    console.log(userHeightInput);
    const result = Math.ceil(userInputWeight/(userHeightInput**2)); 
    bmiOutput.textContent = result;
}
calculateButtonElemnt.addEventListener('click', submitButtonHandler);



