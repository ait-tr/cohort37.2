// В нашем проекте по обмену валют - перенастроить его так, чтобы
//  курсы валют брались с сервера, endpoint =
//   https://openexchangerates.org/api/latest.json?app_id=c56da6a380da489ea5745895577c2ac4

const currencyFrom = document.querySelector('#choice_1');
const currencyTo = document.querySelector('#choice_2');
const amount = document.querySelector('#input-amount');
const result= document.querySelector('#result');
const button = document.querySelector('#submit');

let rates = {};

const currencyData = async (q) => {  
    const response = await fetch(q); 
    const data = await response.json();  
    rates = data.rates;
    currencySelectors(rates);
}
currencyData('https://openexchangerates.org/api/latest.json?app_id=c56da6a380da489ea5745895577c2ac4');

function currencySelectors(rates) {
    Object.keys(rates).forEach(elem => {
        const optionFrom = new Option(elem, elem);
        const optionTo = new Option(elem, elem);
        currencyFrom.append(optionFrom);
        currencyTo.append(optionTo);
    });
}

const submitButtonHandler = async (evt) => {
    evt.preventDefault(); 
    const amountValue = amount.value;
    if (isNaN(amountValue) || amountValue < 0) {
        alert('Пожалуйста, введите число');
        return; 
    }
    const fromCurrency = currencyFrom.value;
    const toCurrency = currencyTo.value;
    if (rates[fromCurrency] && rates[toCurrency]) {
        const rate = rates[toCurrency] / rates[fromCurrency]; 
        const convertedAmount = (amountValue * rate).toFixed(2);
        result.textContent = `Результат: ${convertedAmount} ${toCurrency}`; 
    }
};
document.querySelector('#converter-form').addEventListener('submit', submitButtonHandler);
