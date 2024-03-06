const currencyData = async (q) => {
    const serverReponse = await fetch(q);
    const body = await serverReponse.json(); 
    showCurrency(body.rates);
    return body.rates;
}
currencyData('https://openexchangerates.org/api/latest.json?app_id=c56da6a380da489ea5745895577c2ac4');



const currencyFrom = document.querySelector('#choice_1');
const currencyTo = document.querySelector('#choice_2');
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




const calculator = (currencyFrom, currencyTo, amount) => {


    const rate = amount/currency1*currency2;
    return rate.toFixed(2);
};

const submitButtonHandler = (evt) => {
    evt.preventDefault();
    let resultValue = calculator(currencyFrom, currencyTo, amount);
    result.textContent = resultValue;
};

currencyFrom.addEventListener('change', inputCurrencyFromHandler);
currencyTo.addEventListener('change', inputCurrencyToHandler);
amount.addEventListener('input', inputAmountToHandler)

//document.querySelector('#converter-form').addEventListener('submit', submitButtonHandler);