const array = [1, 5, [67, 78, 34], 12, 14];

function numbersArray (arr){
    return arr.flat();
}
const result = numbersArray(array);
console.log(result);


const nummbersArr = [1, 5, [67, 78, 34], 12, 14];

// const flatArr = (arr) => {
//     const newArr = [];
//     arr.forEach((element => {
//         if (Array.isArray(element)){
//             element.forEach(subelement => {
//                 newArr.push(subelement);
//             });;
//         }else{
//             newArr.push(element);
//         }
       
// }))
// return newArr;
// }

// console.log(flatArr(nummbersArr));



const arr =  [1, 5, [67, 78, 34], 12, 14];


// const newArray = (array) => {
//     const arr2 = [];
//     for(let i = 0; i < array.length; i++){
//     (Array.isArray(array[i]) ? arr2.push(...newArray(array[i])) : arr2.push(array[i]));
//     }
//     return arr2;
// }


// console.log(newArray(arr));


// spread operator
const arrayC = [1, 2, 3];

console.log(...arrayC);

const objC = {a: 1, b: 2};

const objCa = {...objC, c: 3};

console.log(...[1, 2, 4]);

console.log(objCa);

