const arrName = [1, 2, 3, 4, "a", null, undefined, NaN, [3, 4]];

// console.log(arrName[1]); // выводит элемент по индексу
// console.log(arrName.length); // вывод длины массива

// const addLast = arrName.push('last'); // добавляет элемент в массив
// console.log(addLast);

// arrName.push('last');
// console.log(arrName);

// const delLast = arrName.pop(); //удаляет ПОСЛЕДНИЙ элемент из массива
// console.log(delLast); // возвращает удаленный элемент
// console.log(arrName);  // возвращает длину массива

// shift / unshift  // удаление / добавление ПЕРВОГО элемента

// const testVar = arrName.unshift('a');
// const testVar = arrName.shift();

// console.log(testVar);
// console.log(arrName);

// const testVar = arrName.splice(1, 0, "1a"); 

// arrName[1] = '1a';  // присваивает новое значение по индексу

// console.log(testVar); 
// console.log(arrName);

for (let i = 1; i<=5; i++){
    console.log(i);
}