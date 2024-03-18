use("bar");

// удалим коллекцию напитков
// db.drinks.drop();

db.drinks.insertMany([
  {
    name: "Margarita",
    price: 6,
    alcohol: 20,
    tags: ["cocktail", "cold"],
  },
  {
    name: "Espresso Martini",
    price: 8,
    alcohol: 18,
    tags: ["cocktail", "cold", "coffee"],
  },
  {
    name: "Old Fashioned",
    price: 7,
    alcohol: 30,
    tags: ["cocktail", "strong", "whiskey"],
  },
  {
    name: "Mojito",
    price: 5,
    alcohol: 15,
    tags: ["cocktail", "refreshing", "mint"],
  },
  {
    name: "Negroni",
    price: 9,
    alcohol: 25,
    tags: ["cocktail", "bitter", "gin"],
  },
  {
    name: "Pina Colada",
    price: 7,
    alcohol: 20,
    tags: ["cocktail", "tropical", "rum"],
  },
]);

// найти самый дорогой напиток
db.drinks.find().sort({ price: -1 }).limit(1);

// Выведите топ три самых дешевых напитка
db.drinks.find().sort({ price: 1 }).limit(3);

// Выведите название самого крепкого напитка.
db.drinks.find({}, { name: 1, _id: 0 }).sort({ alcohol: -1 }).limit(1);

// получите название напитков, в которых присутсвует искомый тег "cold"
// db.drinks.find({ tags: "cold" }, { name: 1, _id: 0 });

// // получите название напитков, в которых присутсвует искомые теги "cold" или "strong"
// db.drinks.find({ tags: { $in: ["cold", "strong"] } }, { name: 1, _id: 0 });
