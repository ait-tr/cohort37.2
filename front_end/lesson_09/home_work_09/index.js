const length = 10;
const numbers = [...Array(length)]; 
for (let i = 0; i < numbers.length; i++) { 
    numbers[i] = Math.ceil((Math.random())*100);
  }
console.log(numbers); 

const maxValue = Math.max(...numbers);
console.log("max " + maxValue);
const minValue = Math.min(...numbers);
console.log("min " + minValue);
console.log("sum of max and min: ")
console.log(maxValue+minValue);

//Вырезать первый элемент и добавить его в конец массива.
const firstNumb = numbers.shift();
numbers.push(firstNumb);
console.log(firstNumb + "; " + numbers);

//Найти сумму всех элементов массива. Вывести в консоль.
let sumNumb = 0;
for (let i = 0; i < numbers.length; i++) { 
    sumNumb += numbers[i];
  }
console.log("sum of all numbers=" + sumNumb); 

//Объявить массив из 5 элементов и заполнить его любыми числами.
//Присвоить 5 переменным значения из массива с помощью деструктуризации.


const numbers2 = [...Array()]; 
for (let i = 0; i < 5; i++) { 
    numbers2[i] = Math.ceil((Math.random())*100);
  }
console.log("Seccond Array: " + numbers2); 
const [a, b, c, d, e] = numbers2;
console.log("a=" + a);
console.log("b=" +b);
console.log("c=" +c);
console.log("d=" +d);
console.log("e=" +e);

//Итак, самое длинное научное название: метилпропенилендигидроксициннаменилакрилическая  кислота.
let newSentences = '';

for(let i = 0; i < sentence.length; i++){
    if(sentence[i] !==  "," && sentence[i] !==  ":" && sentence[i] !==  "." ){
        newSentences += sentence[i];
    }
}
 console.log(newSentences);

 const newArray = newSentences.split(" ");

 for(let i = 0; i < newArray.length; i++){
  console.log(newArray[i]);
 }