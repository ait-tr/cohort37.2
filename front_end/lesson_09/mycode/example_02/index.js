const arrName = [1, 2, 3, 4, "a", null, NaN];

// for (let i = 0; i<arrName.length; i++){
//     console.log(arrName[i]);
// }
// for (let i = arrName.length-1; i >= 0; i--){  // в обратном порядке
//     console.log(arrName[i]);
// }

let i = 0;
while(i < arrName.length){
    console.log(arrName[i]);
    i++;
}

const arrTwo = []; // создаем пустой массив

for(let i = arrName.length -1; i >= 0; i--){  //  цикл для вывода в обратном порядке
    arrTwo.push(arrName[i]);  // добавляем существующий в пустой 
}
console.log(arrTwo);  // вывод в консоль обновленного массива в обратном порядке

const sArray = [1, 2, 3];
const[a, b, c] = sArray;

// const a = sArray[0];
// const b = sArray[1];
// const c = sArray[2];

console.log(a, b, c);