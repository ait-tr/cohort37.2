// Task1: Написать функцию, которая принимает на вход массив имен и возвращает
//  массив имен, начинающихся на букву "а" (большую или маленькую).

const names = ["Alex", "Bob", "Chris", "Alice", "Anna", "Frank", "Aurora", "Jack", "Kate"];

function filterNames(names) {
    return names.filter(name => name[0] === 'A' || name[0] === 'a');
}
console.log(filterNames(names));

// Task2: Написать функцию, которая принимает на вход массив числе и возвращает 
// их сумму. Если получится использовать метод reduce - будет здорово.

const nums = [3, 2, 6, 10, 1, 8];

function sum(nums) {
    return nums.reduce((acc, currentValue) => acc + currentValue, 0);
}
console.log(sum(nums));

// Task3: Написать функцию, которая принимает на вход массив чисел и возвращает 
// массив из тех же элементов, но в обратном порядке.

const numbers = [3, 7, 9, 1, 6, 10];

function revNumbers(numbers) {
    return numbers.reverse();
}
console.log(revNumbers(numbers));

// Task4: Написать функцию, которая примет объект вида:

const customer = {
    'customer-id-1': {
       name: 'William',
       age: 54
    },
    'customer-id-2': {
       name: 'Tоm',
      age: 17
   }
 }
// и вернет массив обьектов вида:
// [{name: 'William', age: 54, id: 'customer-id-1’}, {name: 'Tom', age: 17, id: 'customer-id-2'}]

const objToArray = (obj) => Object.keys(obj).map((key) => ({
    id: key,
    ...obj[key]
}));
console.log(objToArray(customer));