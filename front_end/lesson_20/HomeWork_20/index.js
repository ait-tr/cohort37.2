const userInput = document.querySelector('#incertTime');
const submitButton = document.querySelector('.button');
const timeCountdown = document.querySelector('#outputTime');

const inputTime = () => {
if (userInput.value < 0) userInput.value = 0;
}

const submitButtonHandler = () => {

    let timeRemaining = parseInt(userInput.value);

    timeCountdown.textContent = `Left: ${userInput.value}`;

    countdownInterval = setInterval(() => {
        timeRemaining--;

        if (timeRemaining <= 0) {
            timeCountdown.textContent = 'Time is up!';
        } else {
            timeCountdown.textContent = `Left: ${--userInput.value}`;
        }
    }, 1000);
}


userInput.addEventListener('input', inputTime);
submitButton.addEventListener('click', submitButtonHandler);
