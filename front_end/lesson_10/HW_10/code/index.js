// Task1:

function pairedNum (num) {
    const roundNum = Math.floor(num);
    return roundNum % 2 === 0 ? 'even' : 'odd';
}
console.log(pairedNum(8.8))

// Task2:

const square = a => {
const roundA = Math.floor(a);
return roundA * roundA;
};
const squareRes = square(4.5);
console.log(squareRes);


// Task3:

const sumEven = (start, end) => {
    let sum = 0;
    const startR = Math.floor(start);
    const endR = Math.floor(end);

    for (let i = startR; i <= endR; i++){
        if (i % 2 === 0) {
            sum += i;
        }
    }
return sum;
};
console.log(sumEven(2, 8.7));


// Task4:

