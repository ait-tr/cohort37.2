### Object Literal (Литерал объекта):


Литерал объекта в JavaScript представляет собой способ создания объекта путем определения его свойств и их значений в фигурных скобках `{}`.


```javascript
// Object literal
const person = {
  name: 'John',
  age: 25,
  city: 'Example City'
};
```


### Object Syntax (Работа с ключами, брекет-синтаксис):


Объект в JavaScript может содержать строки, числа и символы в качестве ключей. Доступ к значениям объекта можно получить с использованием точечной нотации или брекет-синтаксиса.


```javascript
// Доступ к значению по ключу (точечная нотация)
const personName = person.name;


// Доступ к значению по ключу (брекет-синтаксис)
const personAge = person['age'];
```


### Получение Значений по Ключу:


```javascript
const person = {
  name: 'John',
  age: 25,
  city: 'Example City'
};


const name = person.name; // 'John'
const age = person['age']; // 25
```


### Получение Ключей/Значений:


```javascript
const person = {
  name: 'John',
  age: 25,
  city: 'Example City'
};


const keys = Object.keys(person); // ['name', 'age', 'city']
const values = Object.values(person); // ['John', 25, 'Example City']
```


### Удаление Свойств из Объекта:


```javascript
const person = {
  name: 'John',
  age: 25,
  city: 'Example City'
};


delete person.age; // Удаление свойства 'age'
```


### Проверка Свойств Объекта:


```javascript
const person = {
  name: 'John',
  age: 25,
  city: 'Example City'
};


const hasAge = 'age' in person; // true
const hasGender = 'gender' in person; // false
```


### Перебор Ключей:


```javascript
const person = {
  name: 'John',
  age: 25,
  city: 'Example City'
};


// Перебор ключей
for (let key in person) {
  console.log(key); // 'name', 'age', 'city'
}


// Перебор значений
for (let key in person) {
  console.log(person[key]); // 'John', 25, 'Example City'
}
```


Эти методы помогают в управлении и взаимодействии с объектами в JavaScript, обеспечивая доступ к их свойствам и значениям.