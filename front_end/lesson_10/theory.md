﻿## Function Declarations (Объявление функции):


Объявление функции в JavaScript представляет собой блок кода, который можно вызывать при необходимости.


```javascript
function greet(name) {
  console.log(`Hello, ${name}!`);
}


greet("John"); // Вызов функции
```


## Anonymous Functions (Безымянные функции):


Безымянные функции - это функции без имени, часто используемые как аргументы для других функций (колбэки).


```javascript
let add = function(x, y) {
  return x + y;
};


let result = add(3, 5); // result равен 8
```


## Arrow Functions (Стрелочные функции):


Стрелочные функции представляют собой сокращенный синтаксис для объявления функций. Они обладают некоторыми особенностями, такими как сохранение контекста `this`.


```javascript
let multiply = (a, b) => a * b;


let square = x => x * x;


let greet = () => console.log("Hello!");
```
Таким образом, функции в JavaScript могут быть объявлены различными способами, включая объявление, безымянные функции и стрелочные функции. 


## Шаблонные строки (Template Strings):


Шаблонные строки предоставляют удобный способ вставки переменных и выражений в строки.


```javascript
let name = "Alice";
let greeting = `Hello, ${name}!`;
console.log(greeting); // "Hello, Alice!"
```


В шаблонных строках можно использовать выражения, заключенные в `${}`, что облегчает вставку значений переменных внутрь строки.


Шаблонные строки предоставляют удобный синтаксис для работы со строками, включая вставку значений переменных.