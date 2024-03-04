Формат JSON:
JSON (JavaScript Object Notation) - это легковесный формат обмена данными, основанный на подмножестве синтаксиса JavaScript. JSON представляет собой текстовый формат, состоящий из пар "ключ-значение" и упорядоченных списков значений.
Формат JSON:
Пример JSON-данных
{
 "name": "Count Dracula",
 "age": 539,
 "title": "Count",
 "isVampire": true,
 "residence": {
   "location": "Castle Dracula",
   "country": "Transylvania"
 },
 "victims": ["Jonathan Harker", "Mina Harker", "Lucy Westenra"]
}
JSON.parse():
Пример использования JSON.parse() для преобразования строки JSON в объект JavaScript:
const jsonString = '{"name": "Count Dracula", "age": 539, "title": "Count", "isVampire": true, "residence": {"location": "Castle Dracula", "country": "Transylvania"}, "victims": ["Jonathan Harker", "Mina Harker", "Lucy Westenra"]}';

// Преобразование строки JSON в объект
const dracula = JSON.parse(jsonString);

console.log(dracula.name); // "Count Dracula"
console.log(dracula.age); // 539
console.log(dracula.residence.location); // "Castle Dracula"
JSON.stringify():
Пример использования JSON.stringify() для преобразования объекта JavaScript в строку JSON:
const dracula = {
 name: "Count Dracula",
 age: 539,
 title: "Count",
 isVampire: true,
 residence: {
   location: "Castle Dracula",
   country: "Transylvania"
 },
 victims: ["Jonathan Harker", "Mina Harker", "Lucy Westenra"]
};

// Преобразование объекта в строку JSON
const jsonString = JSON.stringify(dracula, null, 2);

console.log(jsonString);
/*
{
 "name": "Count Dracula",
 "age": 539,
 "title": "Count",
 "isVampire": true,
 "residence": {
   "location": "Castle Dracula",
   "country": "Transylvania"
 },
 "victims": ["Jonathan Harker", "Mina Harker", "Lucy Westenra"]
}
*/
В этих примерах используются данные о Графе Дракуле для демонстрации использования JSON.parse() и JSON.stringify() в JavaScript.