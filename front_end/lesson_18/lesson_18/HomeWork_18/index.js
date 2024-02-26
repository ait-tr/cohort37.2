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

const lineNumbers = [1,2,3,4,5,6,7,8,9]

const reverce = (arr) => {
    return arr.sort((a,b) => b-a)
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

 const ourBlvdCustomers = (obj) => {
    let arrCustomers = []; 
    for(const key in obj){
        const client = {
            name: obj[key].name,
            age: obj[key].age,
            id: key
        };
        arrCustomers.push(client);
    
    }
    return arrCustomers;
 }
 console.log(ourBlvdCustomers(customers));