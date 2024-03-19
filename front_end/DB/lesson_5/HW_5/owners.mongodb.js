use("owners");

db.owners.insertMany([
    { car_id: 1, owner: "Paul Smith", phone: "1234567" },
    { car_id: [2, 8, 10], owner: "Max Newman", phone: "8476520" },
    { car_id: 3, owner: "John Black", phone: "7654321" },
    { car_id: 4, owner: "Jane Hewston", phone: "9876543" },
    { car_id: [5, 9], owner: "Emily Johnson", phone: "1122334" },
    { car_id: 6, owner: "Michael Brown", phone: "2233445" },
    { car_id: [7, 11], owner: "Linda White", phone: "3344556" },
  ]);

//   Выведите владельцев вместе с их автомобилями
db.owners.aggregate([
    {$lookup: {
      from: "cars",
      localField: "car_ids",
      foreignField: "id",
      as: "cars"
    }

    }]);
// Выведите тех кто владеет автомобилями дороже 20000
// db.owners.aggregate([
//     {$lookup: {
//       from: "cars",
//       localField: "car_ids",
//       foreignField: "id",
//       as: "cars"
//     }},
//     {$match: {"cars.price": {$gt: 20000}}
//     }
// ])
// Выведите среднюю цену машин у каждого владельца если эта цена больше 20000
// db.owners.aggregate([
//     {$lookup: {
//       from: "cars",
//       localField: "car_ids",
//       foreignField: "id",
//       as: "cars"
//     }},
//     {$addFields: {avgPrice: {$avg: "$cars.price"}} },
//     {$match: {avgPrice: {$gt: 20000}}
//     }
// ])