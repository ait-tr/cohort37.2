const playButton = document.querySelector('#play');
const quitButton = document.querySelector('#quit');
const resultDisplay = document.querySelector('#result');
const sound = document.querySelector('#sound');

playButton.addEventListener('click', function() {
    lotteryPromise()
        .then(number => {
        resultDisplay.textContent = `Ура, мы выиграли ${number}!`
    })
        .catch(number => {
        resultDisplay.textContent = `Не повезло, не подфортило`;
        sound.play();
    })        
});

quitButton.addEventListener('click', function() {
    resultDisplay.textContent = "Maybe next time";
});

function lotteryPromise() {
    return new Promise((accept, reject) => {
        const randomNumber = Math.floor(Math.random() * 100) + 1;
            if (randomNumber > 70) {
                accept(randomNumber);
            } else {
                reject(randomNumber);
            }
        }); 
    };


