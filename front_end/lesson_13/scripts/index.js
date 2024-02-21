//let currencyValue = {'GBP':0.85, 'USD':'0.80', 'Polish zloty':'4.34', 'Euro':'1'};

const inputCurrencyAmount = document.querySelector('#currencyAmount');

const selectedTypeCurrency = document.querySelector('#currencySelectionInput')
const selectedTypeCurrencyOutput = document.querySelector('#currencySelectionOutput')

const calculateButtonElemnt = document.querySelector('#submitBtn');

const resulfField = document.querySelector('#result');

const currencyEuro = 'Euro';
const currencyUSD = 'USD';
const currencyZloty = 'Polish zloty';
const currencyGBP = 'GBP';

let userCurrencyAmount;
let currencyFrom;
let currencyTo;

const currencyImput = (evnt) => {
   currencyFrom = selectedTypeCurrency.value;
}

const currencyOutput = (evnt) => {
    currencyTo = selectedTypeCurrencyOutput.value;
}

const imputFieldAmount = (evnt) => {
    userCurrencyAmount = inputCurrencyAmount.value;
}

const calculator = (currencyFrom = currencyEuro, currencyTo = currencyEuro, userCurrencyAmount = 0) =>{
    let koef1;
    let koef2;
    if(currencyFrom === currencyEuro) {
        koef1 = 1;
        }
       
    if(currencyFrom === currencyUSD) {
        koef1 = 0.80;
        }
    if(currencyFrom === currencyGBP) {
        koef1 = 0.85;
            }
    if(currencyFrom === currencyZloty) {
        koef1 = 4.34;
                }
    if(currencyTo === currencyEuro) {
                    koef2 = 1;
                    }
    if(currencyTo === currencyUSD) {
                    koef2 = 0.80;
                    }
    if(currencyTo === currencyGBP) {
                    koef2 = 0.85;
                        }
    if(currencyTo === currencyZloty) {
                    koef2 = 4.34;
                            }

                            console.log(currencyFrom, koef1)

        const rate = userCurrencyAmount/koef1*koef2;
        console.log(rate)
        return rate;
        
}


const submitButtonHandler = (evt) => {
    //console.log(currencyFrom, currencyTo, userCurrencyAmount)
   //evt.preventDefault();
   let result = calculator(currencyFrom, currencyTo, userCurrencyAmount);
   console.log(result)
   resulfField.textContent = result;
   
}

const currencyFieldInput = (evt) => {
    userCurrencyAmount = evt.target.value;
    if (isNaN(userCurrencyAmount)) {
        alert("Numbers only!");
    }
}


selectedTypeCurrency.addEventListener('change', currencyImput);
selectedTypeCurrencyOutput.addEventListener('change', currencyOutput)
inputCurrencyAmount.addEventListener('input', currencyFieldInput)
calculateButtonElemnt.addEventListener('click', submitButtonHandler);
resulfField.addEventListener('change', submitButtonHandler);