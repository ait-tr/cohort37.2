const double = (number) => number*2;
const PowMe = (number) => number**2;
// const evenOrNot = (number) => {
//     if (number % 2 === 0){
//         return number*2;
//     } else {
//         return number**2;
//     }
// }
const triple = (number) => number*3;

const evenOrNot = (number) => {
    if (number % 2 === 0){
        return double(number);
    } else {
        return PowMe(number);
    }
}


let result = evenOrNot(8);
console.log(result);


