// ////////////////// МЕТОДЫ МАССИВОВ ////////////////////////////

// const arr = [1, 5, 6, 2, 3, 11, 22, 21];  // исходный массив

////////////////////////////// MAP ////////////////////////////
// const newArrMap = arr.map(
//     (arrElem) => {return arrElem + 2});  // допустим мы хотим добавить 2 к каждому элементу
// // console.log(newArrMap);

///////////////////////////////////////////////////////////////////
// const newArrMap1 = arr.map(
//     (arrElem, i) => {return arrElem + i});  // допустим мы хотим обратиться к элементу и добавить значение индекса
// // console.log(newArrMap1);


////////////////////////////////////////////////////////////////
// const newArrMap2 = arr.map(
//     (arrElem) => {return arrElem*arrElem}); //возводит в квадрат
// // console.log(newArrMap2);

// const squareFunction = (arrElem) => {  // функция возведения в квадрат
//     return arrElem * arrElem;
// };

// const newArrMap3 = arr.map(squareFunction); // передаем переменной функцию в параметре

// console.log(newArrMap3);

//////////////////////////////////////////////////////////////////
// функция которая умножает четные на 2 а нечетные делит на 3 
const arr = [1, 2, 3, 5, 7, 11, 18, 22, 17, 21];

const modifyArr = (arr) => arr.map(num => num % 2 === 0 ? num * 2 : num / 3);
const newArr = modifyArr(arr);
// console.log(newArr);

/////////////////// METHOD SORT /////////////////////////////

const sortedArr= arr.sort(   // принимает call back функцию для сортировки
(a, b) => {
    if(a < b ){
        return -1
    }
    if(a > b){
        return 1
    } else {
        return 0
    }
});
// console.log(sortedArr);

///////////////// FILTER //////////////////////////////////
// вернуть массив с элементами меньше 5

const filteredArr = arr.filter(
    (a) => {return a > 5}
)
console.log(filteredArr);

////////////////////// FOR EACH ///////////////////////////////
 // отфильтровать элементы меньше 17

const newFilteredWithForEach = []; 
    arr.forEach(element => {
        if (element < 17) {
            newFilteredWithForEach.push(element);
        }
    });
console.log(newFilteredWithForEach);

///////////////////////////////////////////////////////////
// найти сумму всех элементов массива 
//const arr = [1, 2, 3, 5, 7, 11, 18, 22, 17, 21];

let sumOfAllElements = 0;

arr.forEach(element => {
sumOfAllElements += element;
});
console.log(sumOfAllElements);