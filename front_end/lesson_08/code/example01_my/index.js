// console.log("test");  вывод на консоль

// ПЕРЕМЕННЫЕ:
// 1. number - все числа -> (2**53)
// 2. bigint - числа очень большие
// 3. string - string + char
// 4. boolean - tru / false
// 5. symbol - 
// 6. undefined - когда значение не определено -> переменная объявлена, но еще не знаем какая
// 7. null - пустота -> ничего

// var                      -> по умолханию (ели ничего не задано)

// let
// const a;                 -> в основном для всех переменных, определит сама 
// const a = 3;

//*****  scoup

// let newa;

// if (){
//     let newa = 9;           -> var / log - работает только в теле 
//     console.log(newa);
// };
//  console.log(newa);  -> здесь будет ошибка

//*****

// let a = 3;
// a = 4;
// console.log(a);

// const b = 3;              -> задал один раз и изменить нельзя
// b = 4;                    -> выдаст ошибку
// console.log(b);

// let a = 4;                -> можно менять не только значение, но и тип данных
// a = "world";
// let bool = true/false;
// let u = undefined;
// let n = null;
// let sy = Symbol(`inter`);  -> задаем уникальную переменную
// console.log(a);

let aa = 5;
let str = "555";
let bool = true;
let u = undefined;
let n = null;
let sy = Symbol('inter');
let bi = 1257n;

// console.log(typeof str);
// let typeOfVar = typeof n;
// console.log(typeOfVar);
// console.log(typeof typeOfVar);

//  *****

// "5"
// console.log( typeof aa);
// let aaStr = String(aa);
// console.log(typeof aaStr);
// ---
// "5"
// console.log( typeof aa);
// let aaStr = aa + "5";
// console.log(typeof aaStr);
// console.log(aaStr);
// ---
// console.log( typeof aa);
// let aaStr = aa + "5";
// console.log(typeof aaStr);
// console.log(aaStr);
// ---
// let strNum = Number(str);
// console.log(strNum + "= " + typeof strNum);
// ---
// let strNum = 10 + +str;    // -> или  let strNum = 10 + +str;
// let strNum = Number(true);
// console.log(strNum + "=" + typeof strNum);
// ---
// let strNum = Number("h15");
// console.log(typeof strNum);
// ---
// let newBool = Boolean("mike");
// console.log(newBool);
// let newBool = Boolean(1 -> +/-);  true
// let newBool = Boolean(0);       false
// console.log(newBool);
// let newBool = Boolean(null);
// console.log(newBool);
// let newBool = Boolean(undefined);
// console.log(newBool);

// if(null){
//     console.log('true');
// } else {
//     console.log('false');
// }

// to false
// 0, undefined, null, "", NaN


// ***** операторы *****

//  ->   + ; - ; / ; * ; % ; **(возведение в степень) ; (Math)
//  ->   if-else; const tRes = (true) ? a : b;
//  ->   > < <= >= === == !== !=

//  ->   ===          -> строгое сравнение сравнивает типы значения и результат (разные типы не сравнивает)   

//       ==           -> не строгое сравнение приводит к одному типу и потом сравнивает (сравнивает разные типы)
//  ->   ==          -> string -> number -> boolean  ( -> указатель приоритета преобразования)

//console.log(9===9);         ->  true;
// console.log(9==="9");      ->  false;
// console.log(9=="9");       ->  true;
// console.log(1 == true);    ->  true;

//console.log(true == "1");        ->  true;
//console.log(false == "0");       ->  true;
//console.log(true == "2");        ->  false;
//console.log(true == "world");    -> false;
//console.log(true == "true");     ->  false;
