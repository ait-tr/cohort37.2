// function simpleOrNot(number){
//     if(number <= 1){
//         return false;
//     }
//     for (let i=2; i<= number-1; i++) {
//         if (number % i === 0){
//             return false;
//         }
//     }
//     return true;
// }
// function find(n){
//     const simpleNumbers = [];
//     for(let i=2; i<=n; i++){         
//         if(simpleOrNot(i)){
//            simpleNumbers.push(i);
//         }
//     }
//     return simpleNumbers;
// }
// console.log(simpleOrNot(3));
// console.log(find(17));


const prime = (d) => {
    if(d <= 1){
                return false;
            }
    
    for (let i=2; i<d; i++){
        if (d % i===0){
            return false;
        }
    }
    return true;
}

const primeArray = (n, f)=>{
    let Array = [];
    for (let i = 2; i<=n; i++){
        if (f(i)) {
            Array.push(i);
        }
    }
    return Array;
}

console.log("Задание 4");
console.log(primeArray(12, prime));