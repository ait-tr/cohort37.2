// Написать функцию, которая принимает масив из чисел, и возвращает 
// новые масив, такого же размера, четные числа остаются неизменными,
//  а нечетные умножаются на 2

const arrOfNumbers = [2, 3, 4, 5];
const newArr = modifyArr(arrOfNumbers);

function modifyArr(arrOfNumbers) {
    return arrOfNumbers.map(num => num % 2 === 0 ? num : num * 2);
}
console.log(newArr);