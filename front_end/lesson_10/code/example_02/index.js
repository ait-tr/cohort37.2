<<<<<<< HEAD
const sum = (a = 2, b = 2) => a + b;  // 2 - значения по умолчанию

const sumRes = sum(5);  // автоматически присвоится первому значению
console.log(sumRes);

/////////////////////////////////////////////////

const mult = (a = 5, b = 3) => a * b;

const multRes = mult(3);
console.log(multRes);

const pow = (a = 2, b = 3) => a**b;

const powRes = pow(3);
console.log(powRes);

const univ = (a, b, f) => {  // третий аргумент - функция
    return f(a, b);
}
// callback function
console.log(univ(3, 2, pow)); 

//
const univ1 = (a, b, f) => {  
    return f(a, b);
}
const callBackRes = univ(5, 4, (a, b) => a/b);
console.log(callBackRes);

// Написать функцию "hello" которая принимает строку, и колбек функцию.
// И колбек функция выполниться с первым аргументом (строкой), и результат 
// ее выполнения должен вернуться из функции "hello"
=======
// default arguments
const sum = (a, b = 2) => a + b;

// const sumResult = sum(5);
// console.log(sumResult);


///////

const multiply = (a, b) => a * b;
const pow = (a, b) => a ** b;



const universal = (a, b, f) => {
    const result = f(a, b);
    return result;
}

// callback
// const callBackResult = universal(3, 2, pow);

//
const callBackResult = universal(3, 2, (a, b) => a/b);


console.log(callBackResult)

//////////////////////////////////////////////////////////////////////////////////////////

// Написать функцию "hello" которая принимает строку, и колбек функцию.
// И колбек функция должна выполниться с первым аргументом (строкой), и результат ее выполнения должен вернуться из функции "hello" 

>>>>>>> 7899c183c540671f547497a271bd07fc5852b1e1

const hello = (str, f) => {
    return f(str);
}

<<<<<<< HEAD
// Вызвать эту функцию и передать ей своё имя и стрелочную функцию которая
//  принимает строку аргумент и возвращает строку Привет *строка аргумент*

// const str2 = hello("Kate", str => "Hello " + str);

console.log(str2);

const str2 = hello("Kate", (str) => {
    return `Привет ${str}`});
=======
// Теперь вызвем функцию hello, и передадим ей свое имя, и стрелочную функцию, которая принимает строку-аргумент,
// и возвращает строку "Привет *строка аргумент*"

// const str2 = hello("Мишель", str => "Привет " + str);



// console.log(str2);

const str2 = hello("Мишель", (str) => {
    // return "Привет " + str
    return `Привет ${str}`
});


>>>>>>> 7899c183c540671f547497a271bd07fc5852b1e1

/////
const a = "слово-1"
const b = "слово-b"
const c = "слово-c"
const d = "слово-d"

<<<<<<< HEAD
console.log("это у нас " + a + ", а это " + b + ", а это " + c);
console.log(`это у нас ${a}, а это ${b}, а это ${c}`)
=======

console.log("это у нас " + a + ", а это " + b + ", а это " + c);
console.log(`это у нас ${a}, а это ${b}, а это ${c}`);
>>>>>>> 7899c183c540671f547497a271bd07fc5852b1e1
