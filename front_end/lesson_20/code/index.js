/*Использовать reduce и в прниципе можно любой другой метод массива*/

const numbArr = [2,6,8,1,7,];

const average = (arr) => {
    let averageA = 0;
    
        const summ = arr.reduce((acc, value) => acc+value, 0);
        averageA = summ/arr.length;
        return averageA;
    
}
console.log(average(numbArr));