const startButton = document.querySelector('#startBtn');
const countdownElement = document.querySelector('#countdown');

function startTimer() {
let time = document.querySelector('#timeInput').value;
countdownElement.textContent = `countdown: ${time}`;

const updCountdown = () => {
  time -= 1;
  countdownElement.textContent = `countdown: ${time}`;
    if (time <= 0) {
      clearInterval(timerId);
      countdownElement.textContent = "OUPS!"; 
      }
    };
    const timerId = setInterval(updCountdown, 1000);
  }
  startButton.addEventListener('click', startTimer);