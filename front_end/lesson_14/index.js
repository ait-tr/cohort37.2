/*1. Получает число и возвращает это число умноженное на 2. Функція называется double.
2. Получает число и возвращает квадрат числа. Называется PowMe
3. Получает число, если четное умножает на 2 и возвращает результат. Если не четное возвращает квадрат.*/
let number = 5;
const double = (number) =>{
    return number*2;
}
const powMe = (number) =>{
    return number**2;
}
const etwasComplit = (number, f) => {
    if (number % 2 == 0){
        return f(number);
    } else{
        return powMe(number);
    }
} 

let result = etwasComplit(9, double)
console.log(result)

