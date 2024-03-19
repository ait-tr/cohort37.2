use("test_db");

db.drinks.insertMany([
    { name: "Espresso Martini", price: 10, strength: 40, tags: ["коктейль", "кофейный"] },
    { name: "Mohito", price: 8, strength: 20, tags: ["коктейль", "освежающий"] },
    { name: "Glintwein", price: 6, strength: 15, tags: ["горячий", "пряный"] },
    { name: "Gin tonic", price: 11, strength: 22, tags: ["коктейль", "освежающий"] },
    { name: "Margarita", price: 13, strength: 30, tags: ["коктейль", "лимонный"] },
    { name: "Champain", price: 20, strength: 12, tags: ["дессертный", "праздничный"] },
    { name: "Wiskey", price: 15, strength: 40, tags: ["крепкий", "элитный"] },
    { name: "Cofee latte", price: 5, strength: 0, tags: ["горячий", "кофейный"] },
    { name: "White Russian", price: 12, strength: 20, tags: ["коктейль", "кремовый"] },
    { name: "Cider", price: 7, strength: 5, tags: ["освежающий", "фруктовый"] },
    { name: "Irish cofee", price: 9, strength: 15, tags: ["горячий", "кофейный","кремовый"] }
  ])

//          самый дорогой напиток
//   db.drinks.find().sort({ price: -1 }).limit(1)

// //          топ три самых дешевых напитка
// db.drinks.find().sort({ price: 1 }).limit(3)

//         название самого крепкого напитка
// db.drinks.find().sort({ strength: -1 },{ name: 1 }).limit(3)

// // название напитков, в которых присутсвует искомый тег
db.drinks.find({ tags: "кремовый" },{ name: 1 })