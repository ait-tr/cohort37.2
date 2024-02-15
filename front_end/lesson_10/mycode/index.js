// const multy = (a,b) => a*b;
// const res = multy(2,3);
// const pow = (a,b) => a**b;
// const res2 = pow(3,2);
// const universal = (a, b, f) => {
//     return f(a,b)
// }
// console.log(universal(3,2,(a,b) => a**b));

const hello = (str,f) => {
    return f(str);
}
const b = str => "hello " + str;
const c ="World";
const something = hello(c, b); 
console.log(something);