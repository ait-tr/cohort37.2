let bodyObject;

const currencyData = async (q) => {
    const serverReponse = await fetch(q);
    const body = await serverReponse.json(); 
    showCurrency(body.rates);
    bodyObject = body.rates;
   // return body.rates;
}
currencyData('https://openexchangerates.org/api/latest.json?app_id=c56da6a380da489ea5745895577c2ac4');

const currencyFrom = document.querySelector('#choice_from');
const currencyTo = document.querySelector('#choice_to');
const amount = document.querySelector('#input-amount');
const button = document.querySelector('#submit');
const result = document.querySelector('#result');

currencyFrom.innerHTML = '';
currencyTo.innerHTML = '';

let userChoiceFrom;
let userChoiceTo;
let userAmount;

const inputCurrencyFromHandler = () => {
    userChoiceFrom = currencyFrom.value;
    console.log(userChoiceFrom)
 }

const inputCurrencyToHandler = () => {
    userChoiceTo = currencyTo.value;
    console.log(userChoiceTo)
 }

 const inputAmountToHandler = () => {
    if(amount.value < 0 || isNaN(amount.value)){
        amount.value = 0;
    }
    userAmount = amount.value;
    console.log(userAmount)
 }
 
 //currencyToValue(userChoiceFrom);

function showCurrency(elem) {
    const keys = Object.keys(elem);
    keys.forEach((elem) => {
        const firstCurrency = document.createElement('option')
        const secondCurrency = document.createElement('option')
        firstCurrency.textContent = elem;
        secondCurrency.textContent = elem;
        currencyFrom.append(firstCurrency);
        currencyTo.append(secondCurrency);
    })
    
}

const valuesOfCurrency = (object,currency) =>{
    const currensyRate = object[currency];

    return currensyRate;   
   
}

const calculator = (currencyFrom, currencyTo, amount) => {
 const rateFrom = valuesOfCurrency(bodyObject, currencyFrom);
 const rateTo = valuesOfCurrency(bodyObject, currencyTo);
    const rate = amount/rateFrom*rateTo;
    return rate.toFixed(2);

};

const submitButtonHandler = (evt) => {
    evt.preventDefault();
    let resultValue = calculator(userChoiceFrom, userChoiceTo, userAmount);
    if(isNaN(userAmount)) {
        result.textContent = 0;
    } else {
    result.textContent = resultValue;}
};

currencyFrom.addEventListener('change', inputCurrencyFromHandler);
currencyTo.addEventListener('change', inputCurrencyToHandler);
amount.addEventListener('input', inputAmountToHandler);
button.addEventListener('click', submitButtonHandler);
result.addEventListener('change', submitButtonHandler);
