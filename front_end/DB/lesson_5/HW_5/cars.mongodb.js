use("cars");

db.cars.insertMany([
    { id: 1, brand: "BMW", model: "X5", price: 20000, year: 2015, hp: 300 },
    { id: 2, brand: "BMW", model: "M3", price: 25000, year: 2017, hp: 425 },
    { id: 3, brand: "Audi", model: "A4", price: 18000, year: 2015, hp: 250 },
    { id: 4, brand: "Audi", model: "Q7", price: 28000, year: 2018, hp: 329 },
    { id: 5, brand: "Toyota", model: "Camry", price: 15000, year: 2017, hp: 268 },
    { id: 6, brand: "Toyota", model: "Corolla", price: 12000, year: 2015, hp: 132 },
    { id: 7, brand: "Ford", model: "Mustang", price: 26000, year: 2018, hp: 310 },
    { id: 8, brand: "Ford", model: "Fiesta", price: 14000, year: 2016, hp: 120 },
    { id: 9, brand: "Mercedes", model: "C-Class", price: 27000, year: 2019, hp: 255 },
    { id: 10, brand: "Mercedes", model: "E-Class", price: 32000, year: 2015, hp: 302 },
    { id: 11, brand: "Mercedes", model: "E-Class", price: 35000, year: 2018, hp: 245}
  ]);

//   среднюю цену по брендам (задание на использование group).
// db.cars.aggregate([
//     {$group: {
//       id: "$brand",
//       AvgPrice: {
//         $avg: "$price"
//       }
//     }}]);
//  среднюю цену по годам.
// db.cars.aggregate([
//     {$group: {
//       id: "$year",
//       AvgPrice: {
//         $avg: "$price"
//       }
//     }}]);
//  максимальную мощность по брендам.
// db.cars.aggregate([
//     {$group: {
//       id: "$brand",
//       MaxHorsepower: {
//         $max: "$hp"
//       }
//     }}]);
//  3 самых дешевые машины.
// db.cars.find().sort({price: 1}).limit(3);

//  3 самых дорогие машины определенного бренда.
// db.cars.find({brand: "Mercedes"}).sort({price: -1}).limit(3);

// // Выведите случайный автомобиль марки
db.cars.aggregate([
    { $match: { brand: "Mustang" } }, 
    { $sample: { size: 1 } }
  ]);