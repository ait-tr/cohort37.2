use("school_db");


// удалить коллекцию
// db.users.drop();

// Операторы

// Больше $gt - greater then
// Получим всех старше 25
// У кого не был указан не попали в этот диапазон
// db.users.find({ age: { $gt: 25 } });

// Меньше $lt - less then
// db.users.find({ age: { $lt: 25 } });

// Меньше $lte - less or equal then - меньше или равно
// db.users.find({ age: { $lte: 25 } });

// Больше или равно $gte
// db.users.find({ age: { $gte: 25 } });

// Равно $eq
// всех у кого имя Егор
// db.users.find({ name: { $eq: "Egor" } });

// Неравно $ne
// все у кого имя не егор
// db.users.find({ name: { $ne: "Egor" } });

// все, у кого возраст не равен чему-то
// у кого не задано значение - тоже подойдут
// db.users.find({age: {$ne: 34}});

// Мы можем вибирать те поля, которые нужны
// вторым параметрам передаем в метод find
// db.users.find({age: 34}, {name: 1});

// Тоже самое, но без id
// db.users.find({ age: 34 }, { name: 1, _id: 0 });

// выведем всех пользователей с возрастом 34
// у них покажутся - все поля кроме id
// db.users.find({age: 34}, {_id: 0});

// Оператор $in - входит в
// выведем всех с именами джон или анна
// db.users.find({ name: { $in: ["John", "Anna"] } });

// Оператор $nin - not in - не входит в "черный лист"
// все у кого имя не джон и не анна
// db.users.find({ name: { $nin: ["John", "Anna"] } });

// Логическое и - $and
// найдем человека с возрастом 34 и именем != анна
// db.users.find({
//   $and: [{ age: 34 }, { name: { $ne: "Anna" } }],
// });

// Чаще всего можем обойтись без and
// db.users.find({ age: 34, name: { $ne: "Anna" } });

// Логическое или
// db.users.find({ $or: [{ age: 34 }, { name: "Ded Igor" }] });

// Отрицание
// все у кого возраст не больше семидесяти
// db.users.find({ age: { $not: { $gt: 70 } } });

// Exist - проверка наличия поля - $exist
// все у кого есть поле age (IS NOT NULL)
// db.users.find({ age: { $exists: true } });
//  все у кого есть поле age - только их имена
// db.users.find({age: {$exists: true}}, {name: 1, _id:0 });

// db.users.insertMany([
//   { name: "Fred", salary: 2000, costs: 1500 },
//   { name: "Kristina", salary: 1300, costs: 2500 },
// ]);

// Вывести всех, кто живет по средствам: salary > costs
// $expr
// const x = 20 > 10;
// db.users.find({ $expr: { $gt: ["$salary", "$costs"] } });

// Вывести тех, кто не живет по средствам: salary < costs
// db.users.find({ $expr: { $lt: ["$salary", "$costs"] } });

//
// db.users.insertMany([
//   {
//     name: "John Snow",
//     hobbys: ["swords", "bows", "wolfs", "red-head"],
//     age: 20,
//   },
//   { name: "Han Solo", hobbys: ["space", "blasters"], age: 36 },
//   { name: "Igor", hobbys: ["space"], age: 36 },
// ]);

// выбрать людей с хотя одним из указанных хобби: "space", "snowboard"
// db.users.find({ hobbys: { $in: ["space", "snowboard"] } });

// Все  кто не интересуется "space", "snowboard"
// db.users.find({ hobbys: { $nin: ["space", "snowboard"] } });

// Если нужно найти по одному хобби можно не пользоваться оператором $in
// db.users.find({ hobbys: "bows" });

// "space" in hobbys AND "blasters" in hobbys
// db.users.find({
//   $and: [{ hobbys: "space" }, { hobbys: "blasters" }],
// });

