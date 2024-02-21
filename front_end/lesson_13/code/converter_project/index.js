const currencyFrom = document.querySelector('#choice_1');
const currencyTo = document.querySelector('#choice_2');
const amount = document.querySelector('#input-amount');
const button = document.querySelector('#submit');
const result = document.querySelector('#result');

const calculator = (currencyFrom, currencyTo, amount) => {
    let currency1;
    let currency2;

    switch(currencyFrom){
        case "USD": currency1 = 1; break;
        case "EUR": currency1 = 0.92; break;
        case "GBP": currency1 = 0.8; break;
    }
    switch(currencyTo){
        case "USD": currency2 = 1; break;
        case "EUR": currency2 = 0.92; break;
        case "GBP": currency2 = 0.8; break;
    }
    const rate = amount/currency1*currency2;
    return rate.toFixed(2);
};

const submitButtonHandler = (evt) => {
    evt.preventDefault();
    let resultValue = calculator(currencyFrom.value, currencyTo.value, amount.value);
    result.textContent = resultValue;
};

document.querySelector('#converter-form').addEventListener('submit', submitButtonHandler);
