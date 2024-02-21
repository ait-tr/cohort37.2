### Методы массивов в JavaScript:


#### 1. **`map`**
- **Описание:** Метод `map()` создает новый массив с результатами вызова предоставленной функции для каждого элемента в массиве.
- **Пример:**
 ```javascript
 const numbers = [1, 2, 3, 4, 5];
 const squaredNumbers = numbers.map(num => num ** 2);
 // squaredNumbers: [1, 4, 9, 16, 25]
 ```


#### 2. **`reduce`**
- **Описание:** Метод `reduce()` применяет функцию к аккумулятору и каждому значению массива (слева направо), сводя массив к одному значению.
- **Пример:**
 ```javascript
 const numbers = [1, 2, 3, 4, 5];
 const sum = numbers.reduce((acc, num) => acc + num, 0);
 // sum: 15
 ```


#### 3. **`forEach`**
- **Описание:** Метод `forEach()` выполняет предоставленную функцию один раз для каждого элемента массива.
- **Пример:**
 ```javascript
 const numbers = [1, 2, 3, 4, 5];
 numbers.forEach(num => console.log(num));
 // Output: 1, 2, 3, 4, 5
 ```


#### 4. **`filter`**
- **Описание:** Метод `filter()` создает новый массив с элементами, для которых предоставленная функция возвращает `true`.
- **Пример:**
 ```javascript
 const students = [
   { name: 'Alice', grade: 85 },
   { name: 'Bob', grade: 90 },
   { name: 'Charlie', grade: 78 },
 ];
 const highGrades = students.filter(student => student.grade > 80);
 // highGrades: [{ name: 'Alice', grade: 85 }, { name: 'Bob', grade: 90 }]
 ```


Эти методы обеспечивают мощные инструменты для манипуляции данными в массивах. Они улучшают читаемость кода и позволяют более эффективно работать с данными.