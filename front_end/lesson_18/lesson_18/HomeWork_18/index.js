/*Написать функцию, которая принимает на вход массив имен
и возвращает массив имен, начинающихся на букву "а" (большую или маленькую).*/
const names = ['Jasmine', 'Amelia', 'Noah', 'Sofia', 'Alexander', 'Liam', 'Isabella', 'Lucas', 'Aaron', 'Mia', 'Oliver', 'Ava', 'Ethan'];

const filterNames = (array, letter) => {
    const namesStartsFromA = array.filter(element => element.charAt(0).toLowerCase()===(letter))
    return namesStartsFromA;
}


console.log(filterNames(names, 'a'));

/*Написать функцию, которая принимает на вход массив числе и возвращает их сумму. */

const numbers = [42, 17, 9, 25, 63, 11, 87, 36, 5, 72]

const summ = (arr) => {
    const newSumm = arr.reduce(function(sum,num) {
        return sum + num;
    })
return newSumm;
} 

console.log(summ(numbers));

/*Написать функцию, которая принимает на вход массив чисел и возвращает
массив из тех же элементов, но в обратном порядке.*/

const lineNumbers = [2, 4, 3 ,1]

const reverce = (arr) => {
    return arr.slice().reverse();
}
console.log(reverce(lineNumbers));

/*Написать функцию, которая примет объект и вернет массив обьектов*/

const customers = {
    'customer-id-1': {
       name: 'William',
       age: 54,
    },
    'customer-id-2': {
       name: 'Tom',
       age: 17,
    }
 }

 const ourBlvdCustomers = (c) => {
    const client = Object.entries(c).map(([key, value]) => ({...value, id: key}));
    
    return client;
    }
 

 console.log(ourBlvdCustomers(customers));