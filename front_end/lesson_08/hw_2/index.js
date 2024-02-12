const a = 17;
const b = 5;
console.log(a > b);
console.log(a <= b);
console.log(a == b);
console.log(a != b);

console.log('-----------------------------------');

console.log('a' < 'b');             //true сравнение кода символа
console.log('ab' > 'a');            //true сумируется код символа

console.log('-----------------------------------');

console.log('17' > 1);              //true сумируется код символа

console.log('-----------------------------------');

console.log(17 === 1);
console.log(17 === 17);
console.log(17 === '17');
console.log(17 === true);
console.log('0' === '');
console.log(true === false);
console.log(true === true);
console.log(null === undefined);
console.log(false === 0);

console.log('-----------------------------------');

console.log(17 == '17');
console.log('0' == '');
console.log(0 == '');
console.log(null == undefined);
console.log(false == 0);

console.log('-----------------------------------');

console.log(undefined == null);
console.log(undefined == 0);    // нету значения
console.log(null == 0);         // пустота
console.log(undefined < 0);     // нету значения что-бы сравнивать 
console.log(undefined > 0);     // нету значения что-бы сравнивать 
