// console.log('Was geht ab?');

// 1.number(2 ^ 53)
// 2.bigint
// 3.string
// 4.boolean
// 5.symbol
// 6.undefined
// 7.null

// var
// let
// const a;
// const a = 3;
//******
// let newa = 1;

// if(true){                
//     let newa = 9;        модификатор переменной LET виден только в scope
//     console.log(newa);   при каждом написании LET мы объявляем переменную
// }
// console.log(newa);


// var newa = 1;            // var видно на полях класса
                            // устаревший вид, используется редко
// if(true){
//     var newa = 9;
//     console.log(newa);
// }
// console.log(newa);


//****** 
// let a = 3;
// a = 4;
// console.log(a)

// const b = 3;
// // b=4;
// будет ошибка так как const задаёт финальное значение
// console.log(b)

// let c = 4 ;
// c = b;
// console.log(c)
// в этом случае переменная переопределит тип данных

let a = 5;
let str = "555";
let bool = true;
let u = undefined;
let n = null;
let sy = Symbol('inter');    // используется для задания уникальных ключей в объектах
let bi = 1223n; // для записи BIGINT в конце ставится буква n, выделяется больше памяти


// let typeOfVar = typeof sy;
// console.log(typeOfVar);

//***********************************/

// приведения числа к строке
// "5"
// console.log(typeof a);

// // let aStr = String(a);
// let aaStr = a+"5";
// лютая дичь
// console.log(aaStr);

//Строку в число

// let strNum = Number(str);
// let strNum = 10 + +str; //плюс без пробела 
// let strNum = 10 + +str; //плюс без пробела 
// console.log(strNum+"="+typeof strNum);

// to FALSE 
// null, 0 ,NaN, undefined, ""

// операторы 
// + - * / ** %

// === ==
// 
// console.log(9 === "9"); // false
// console.log(9 == "9"); // true
console.log(1 == true);

// == Boolean Integer String ==

console.log(true == "0");

