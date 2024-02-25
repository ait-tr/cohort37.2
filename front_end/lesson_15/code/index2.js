/*1. Напишите фукнцию, которая будет принимать массив. Массив может содержать
любые строки и числа. Функция должна вернуть объект, который содержит свойства,
ключ и значение которых равны соответствующему элементу массива.
Пример работы функции:*/

const randomArray = ["apple", 2, "orange", "grape", 134, "kiwi", "strawberry", 15, "watermelon", "pineapple"];

const randomArrInObject = randomArray.map(element =>{
    let randomObject = {};
    randomObject[element] = element;
    return randomObject;
}) 
console.log(randomArrInObject);

/* Напишите функцию, которая превратит массив который содержит элементы в виде массивов из двух элементов, в объект.
   Первый элемент каждого внутреннего массива ключ, второй - значение. Например такой:*/

   const johnDoeArr = [
    [ 'height', 170 ],
    [ 'weight', 80 ],
    [ 'sport', 'regbi' ],
    [ 'full name', 'John Doe' ],
    [ 'sing', 'love' ],
    [ 'speed', 90 ]
  ]
  let objFromOtherArr = {};
  const objectFromOtherArray = johnDoeArr.map(element =>{
    objFromOtherArr[element[0]] = element[1];
  })
  console.log(objFromOtherArr);

  /*должна принимать объект и возвращать строку, где будут перечислены все значения свойств объекта через запятую.*/
  const johnDoe = { height: 170,
    weight: 80,
    sport: 'regbi',
    sing: 'love',
    speed: 90 };

const stringFromObj = (obj) => Object.values(obj).join(', ');
console.log(stringFromObj(johnDoe));

/*Напишите функцию, которая принимает объект и возвращает другой обьект, который
содержит все свойства исходного обьетка, но значения свойств - это их типы.*/


 

