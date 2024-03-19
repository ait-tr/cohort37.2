use("auto");

// db.cars.drop();

// db.cars.insertMany([
//   {
//     _id: 1,
//     brand: "BMW",
//     price: 20000,
//     model: "X5",
//     year: 2015,
//     horsepower: 300,
//   },
//   {
//     _id: 2,
//     brand: "BMW",
//     price: 25000,
//     model: "X6",
//     year: 2016,
//     horsepower: 320,
//   },
//   {
//     _id: 3,
//     brand: "Toyota",
//     price: 18000,
//     model: "Camry",
//     year: 2018,
//     horsepower: 268,
//   },
//   {
//     _id: 4,
//     brand: "Mercedes",
//     price: 35000,
//     model: "E-Class",
//     year: 2019,
//     horsepower: 295,
//   },
//   {
//     _id: 5,
//     brand: "BMW",
//     price: 30000,
//     model: "X3",
//     year: 2017,
//     horsepower: 280,
//   },
//   {
//     _id: 6,
//     brand: "Toyota",
//     price: 22000,
//     model: "Corolla",
//     year: 2020,
//     horsepower: 169,
//   },
//   {
//     _id: 7,
//     brand: "Audi",
//     price: 33000,
//     model: "A6",
//     year: 2021,
//     horsepower: 335,
//   },
//   {
//     _id: 8,
//     brand: "Tesla",
//     price: 45000,
//     model: "Model 3",
//     year: 2022,
//     horsepower: 450,
//   },
//   {
//     _id: 9,
//     brand: "BMW",
//     price: 28000,
//     model: "5 Series",
//     year: 2018,
//     horsepower: 248,
//   },
//   {
//     _id: 10,
//     brand: "Toyota",
//     price: 30000,
//     model: "RAV4",
//     year: 2021,
//     horsepower: 203,
//   },
// ]);

// db.cars.aggregate([
//   {
//     $group: {
//       _id: "$brand",
//       averagePrice: {
//         $avg: "$price",
//       },
//     },
//   },
// ]);

// db.cars.aggregate([
//   {
//     $group: {
//       _id: "$year",
//       averagePrice: {
//         $avg: "$price",
//       },
//     },
//   },
// ]);

// db.cars.aggregate([
//   {
//     $group: {
//       _id: "$brand",
//       maxHorsePower: {
//         $max: "$horsepower",
//       },
//     },
//   },
// ]);

// db.cars.aggregate([
//   {
//     $sort: { price: 1 },
//   },
//   {
//     $limit: 3,
//   },
// ]);

// выведем бренд с макс. кол-вом машин
// db.cars.aggregate([
//   {
//     $group: {
//       _id: "$brand",
//       carsCount: {
//         $count: {},
//       },
//     },
//   },
//   {
//     $sort: {
//       carsCount: -1,
//     },
//   },
//   {
//     $limit: 1,
//   },
// ]);

// db.cars.aggregate([
//   {
//     $match: {
//       brand: "BMW",
//     },
//   },
//   {
//     $sort: { price: -1 },
//   },
//   {
//     $limit: 3,
//   },
// ]);

// db.cars.aggregate([
//   {
//     $match: {
//       brand: "BMW",
//     },
//   },
//   {
//     $sample: {
//       size: 1,
//     },
//   },
// ]);

// db.owners.insertMany([
//   {
//     _id: 1,
//     owner: "Ivanov Ivan",
//     phone: "1234567",
//     cars: [1, 2, 3]
//   },
//   {
//     _id: 2,
//     owner: "Petrova Maria",
//     phone: "7654321",
//     cars: [4, 5]
//   },
//   {
//     _id: 3,
//     owner: "Sidorov Alexey",
//     phone: "1122334",
//     cars: [6, 7, 8]
//   },
//   {
//     _id: 4,
//     owner: "Kuznetsova Olga",
//     phone: "5566778",
//     cars: [9, 10]
//   }
// ]);

// db.owners.aggregate([
//   {
//     $lookup: {
//       from: "cars",
//       localField: "cars",
//       foreignField: "_id",
//       as: "cars",
//     },
//   },
// ]);

// db.owners.aggregate([
//   {
//     $lookup: {
//       from: "cars",
//       localField: "cars",
//       foreignField: "_id",
//       as: "cars",
//     },
//   },
//   {
//     $match: {
//       "cars.price": {
//         $gt: 35000,
//       },
//     },
//   },
// ]);

db.cars.aggregate([
  {
    $lookup: {
      from: "owners",
      localField: "_id",
      foreignField: "cars",
      as: "owner",
    },
  },
  {
    $group: {
      _id: "$owner.owner",
      averagePrice: {
        $avg: "$price",
      },
    },
  },
  {
    $match: {
      averagePrice: { $gt: 30000 },
    },
  },
]);
