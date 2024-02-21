const arr = [1,2,3,5,7,10,11,17,21,24];

// const arrPlusTwo = (array) => {
// const newArr = [];
// for (let i = 0; i<array.length; i++){
//     newArr[i] = array[i]+2;
// }
// return newArr;
// }

// //console.log(arrPlusTwo(arr));

// const pow = (elem) => {
//     return elem**2
// }

// const newArrayMap = arr.map (
//     pow);

// console.log(newArrayMap)

const evenNotEven = (elem) =>{
    if (elem%2==0){
        return elem*3
    }
    else {
        return elem*2
    }
}
const newArrayMap2 = arr.map(
    evenNotEven);

console.log(newArrayMap2);

const filteredEl = [];
let sum = 0;
const summ = arr.forEach(
    (elem) => {
        
        sum=sum+elem;
          
    })
    console.log(sum)

