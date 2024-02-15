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
console.log(square(4.5));


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

function prime(num) {
    if (num <= 1) return false;
    for (let i = 2; i < num; i++){
        if(num % i ===0) return false;
        }
        return true;
    }

function findPrime(n) {
    const primes = [];
    for (let num = 2; num <= n; num++) {
        if (prime(num)) {
            primes.push(num);
        }
    }
    return primes;
}
console.log(findPrime(17));