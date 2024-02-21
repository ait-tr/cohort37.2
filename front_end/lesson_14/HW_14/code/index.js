//Task1: Напишите фукнцию, которая будет принимать массив. Массив 
// может содержать любые строки и числа. Функция должна вернуть объект,
//  который содержит свойства, ключ и значение которых равны 
//  соответствующему элементу массива.

const iPhone = {
    'full name': 'Iphone 15 Pro Max',
    size: [15, 8],
    weight: 350,
    colours: ['black', 'white', 'gold']
    
}
let colObject = {};

for (let key in iPhone) {
    if (key === 'colours') {
        for (let colour of iPhone[key]) {
            colObject[colour] = colour;
        }
    }
}
// console.log(colObject);

// Task2: Напишите функцию, которая превратит массив который содержит 
// элементы в виде массивов из двух элементов, в объект. Первый элемент 
// каждого внутреннего массива ключ, второй - значение

const array = [
    ['height', 170],
    ['weight', 80],
    ['sport', 'regbi'],
    ['full name', 'John Doe'],
    ['sing', 'love'],
    ['speed', 90]
];
function arrToObj(arr){
    const obj = {};
    for(let i=0; i< arr.length; i++){
        let key = arr[i][0];
        let value = arr[i][1];
        obj[key] = value;
    }
    return obj;
}
// console.log(arrToObj(array));

// Task3: Функция должна принимать объект и возвращать строку, где будут
//  перечислены все значения свойств объекта через запятую.

const iPhone15 = {
    'full name': 'Iphone 15 Pro Max',
    size: 15,
    weight: 350,
    colour: 'black'
}
function objectValToStr(obj) {
    const values = Object.values(obj);
    return values.join(', ');
}
const resStr = objectValToStr(iPhone15);
// console.log(resStr);

// Task4: Напишите функцию, которая принимает объект и возвращает 
// другой объект, который содержит все свойства исходного объекта,
//  но значения свойств - это их типы.

const typesFromObjectwithAll = (obj) => {
    let objTypesAll = {};
    for(let key in obj){
        let objValue = obj[key];
        let objType = typeof objValue;

        objTypesAll[key] = {
            value: objValue,
            type: objType
        }
    }
    return objTypesAll;
}
console.log(typesFromObjectwithAll(iPhone));