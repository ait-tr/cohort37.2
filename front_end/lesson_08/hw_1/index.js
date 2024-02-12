/* to string */

//Всё будет просто строкой
console.log('17 to string is ' + String(17));
console.log('-17.17 to string is ' + String(-17.17));
console.log('false to string is ' + String(false));
console.log('null to string is ' + String(null));
console.log('undefined to string is ' + String(undefined));
console.log('0 to string is ' + String(0));

console.log('-----------------------------------');

/* to number */
console.log("'17' to number is " + Number(17));
console.log('true to number is ' + Number(true));               // = 1
console.log('false to number is ' + Number(false));             // = 0
console.log('null to number is ' + Number(null));               // = 0
console.log('undefined to number is ' + Number(undefined));     // = NaN
console.log("'   20   ' to number is " + Number('   20  '));
console.log("'      ' to number is " + Number('     '));
console.log("'   30d   ' to number is " + Number('  30d   '));  // = NaN

console.log('-----------------------------------');

/* to boolean */
console.log('null to boolean is ' + Boolean(null));
console.log('undefined to boolean is ' + Boolean(undefined));
console.log('0 to boolean is ' + Boolean(0));
console.log('-0 to boolean is ' + Boolean(-0));
console.log('NaN to boolean is ' + Boolean(NaN));
console.log("'' to boolean is " + Boolean(''));
console.log("' ' to boolean is " + Boolean(' '));               //true      пробел идёт тоже как значение
console.log('17 to boolean is ' + Boolean(17));
console.log("'Hello' to boolean is " + Boolean('Hello'));
