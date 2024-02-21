function double(number) {   // const double = number => number * 2;
    return number * 2;   
}
console.log(double(4));

function powMe(number) {  // const powMe = number => number ** 2;
    return number ** 2;  
}
console.log(powMe(3));

const univ = (number) => number % 2 === 0 ? double(number) : powMe(number);

console.log(univ(8));
console.log(univ(3));