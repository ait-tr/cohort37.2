const ourButton = document.querySelector('button');

ourButton.addEventListener('click', () => {console.log('Click')});

const takeTime = () => {
    let sum = 0;
    console.log('Start count');
    const startTime = Date.now();
        for(let i = 0; i < 600000000; i++) {
        sum +=i;
  }
  const endTime = Date.now();
console.log('Finished in: ' + (endTime - startTime) + ' sec');
}
takeTime();

const printHelloToConsole = () => {
console.log('Hello')
}

const checkTimeOuts = () => {
  console.log('1');
  setTimeout(() => {console.log('2')}, 0);
  console.log('3');
  setTimeout(() => {console.log('4')}, 2000);
  console.log('5');
}
// checkTimeOuts();

/////// setInterval

const checkIntervals = () => {
  let count = 5;

  const funcInterval = () => {
    console.log('I am interval')
    count -= 1;
    if(count <=0){
      clearInterval(idI)
    }
  }
  const idI = setInterval(funcInterval, 1000);

}
checkIntervals();