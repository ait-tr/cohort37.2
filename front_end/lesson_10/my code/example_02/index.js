// default arguments
const sum = (a = 2, b = 2) => a + b;

const resultS = sum(5);
// console.log(resultS);


//////////

const multiplication = (a, b) => a * b;

const resultM = multiplication(5);
// console.log(resultM);


const pow = (a, b) => a ** b;

const resultP = pow(5);
// console.log(resultP);

const universal = (a, b, f) => {
    return f(a, b);
}

//callback
// console.log(universal(3, 3, pow));

// console.log(universal(3, 3, (a, b) => a / b ));

//

function hello(str, f) {
    return f(str);
}

// 
const name = "Мишель";
const f = str => `Привет ${str}`;
const str2 = hello(name, f);

const str3 = hello("Michelle", str => {
    return `Привет ${str}`
})

console.log(str2);
console.log(str3);