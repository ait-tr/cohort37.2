const userInput = document.querySelector('#incertTime');
const submitButton = document.querySelector('button');
const timeCountdown = document.querySelector('#outputTime');

const inputTime = () => {
    
    if ( !userInput.value || userInput.value < 0) {
        userInput.value = 0;
    }
}

const submitButtonHandler = () => {

    inputTime();

    console.log(userInput.value);

    submitButton.removeEventListener('click', submitButtonHandler);

    submitButton.classList.add('buttonClick')
    
    let timeRemaining = parseInt(userInput.value);
     
    timeCountdown.textContent = `Left: ${userInput.value}`;

const countdownInterval = setInterval(() => {
        timeRemaining--;

        if (timeRemaining <= 0) {
            clearInterval(countdownInterval);
            timeCountdown.textContent = 'Time is up!';
            userInput.value = '';
            submitButton.classList.remove('buttonClick');
            submitButton.classList.add('buttonA');
            submitButton.addEventListener('click', submitButtonHandler);
        } else {
            timeCountdown.textContent = `Left: ${timeRemaining}`;   
        }
    }, 1000);
}
 


userInput.addEventListener('input', inputTime);
submitButton.addEventListener('click', submitButtonHandler);
