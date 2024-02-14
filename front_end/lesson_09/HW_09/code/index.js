//  Task1: Объявить массив из 10 элементов и заполнить его случайными числами 
//  от 1 до 100. Найти максимальное и минимальное значение в массиве.
//  Вывести в консоль.

 let array = [];
 for (let i = 0; i < 10; i++) {
    array.push(Math.floor(Math.random() * 100) + 1);
 }
let min = Math.min(...array);
let max = Math.max(...array);

console.log(array);
console.log(min);
console.log(max);
console.log("Sum of min + max " + (min + max)); // Task3


// Task2: Объвить массив из 10 любых, заполнить. Вырезать первый элемент 
// и добавить его в конец массива.

let array1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let firstEl = array1.shift();
array1.push(firstEl);

console.log(array1);


// Task3: Объявить массив из 10 элементов и заполнить его случайными числами 
// от 1 до 100. Найти минимальное и максимальное значение в массиве.
//  Вывести в консоль их сумму.



// Task4: Объявить массив из 10 элементов и заполнить его случайными числами 
// от 1 до 100. Найти сумму всех элементов массива. Вывести в консоль.

let array2= [];
 for (let i = 0; i < 10; i++) {
    array2.push(Math.floor(Math.random() * 100) + 1);
 }
console.log(array2);

let sum = 0;
for (let i = 0; i < array2.length; i++) {
    sum += array[i];
}
console.log(sum);

// Task5: Объявить массив из 5 элементов и заполнить его любыми числами.
//  Присвоить 5 переменным значения из массива с помощью деструктуризации.

let num = [1, 5, 3, 8, 10];
let [a, b, c, d,e] = num;
console.log(a);
console.log(b);
console.log(c);
console.log(d);
console.log(e);

// Task6: Разбить строку на слова и вывести в консоль по одному слову в строке.

// Итак, самое длинное научное название: метилпропенилендигидроксициннаменилакрилическая  кислота.

let text = "Итак, самое длинное научное название: метилпропенилендигидроксициннаменилакрилическая кислота.";
let emptyText = "";

for (let i = 0; i < text.length; i ++){
    let char = text[i];
    if (char !== ',' && char !== '.' && char !== ':'){
        emptyText += char;
    }
}
    let words = [];
    let tempWord = "";

    for (i = 0; i < emptyText.length; i++){
        let char = emptyText[i];
        if (char !== ''){
            tempWord += char;
        } else if (tempWord.length > 0)
        words.push(tempWord);
        tempWord = "";
    }

if (tempWord.length > 0){
    words.push(tempWord);
}

for (let i = 0; i < words.length; i++){
    console.log(words[i]);
}





