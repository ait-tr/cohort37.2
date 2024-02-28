const ourButton = document.querySelector('button');




ourButton.addEventListener('click', () =>{console.log('click')})

// const takeTime = () => {
//     let sum=0;
//     console.log('start to count');
//     const startTime = Date.now();

// for(let i = 0; i< 6000000000; i++) {
//     sum+=i;
// }
// const endTime = Date.now();
// console.log('count ' + (endTime-startTime));
// }

// takeTime();

const printHelloToConsol = () => {
    console.log('Hello')
}

const checkTimeouts = () => {
    setTimeout(printHelloToConsol, 5000);//what and when to make;
}

checkTimeouts();

const checkIntervals = () => {
    const funcInterval = () => {console.log('I am interval')}
    const idI = setInterval(funcInterval, 2000);
    setTimeout(() => {clearInterval(idI), 5000})
    clearInterval(idI);
}


checkIntervals();