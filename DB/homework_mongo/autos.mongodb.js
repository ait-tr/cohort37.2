use("autopark");

db.autos.insertMany([
    {
      "_id": 1,
      "brand": "BMW",
      "price": 20000,
      "model": "X5",
      "year": 2015,
      "horsepower": 300
    },
    {
      "_id": 2,
      "brand": "Audi",
      "price": 18000,
      "model": "A4",
      "year": 2018,
      "horsepower": 250
    },
    {
      "_id": 3,
      "brand": "Mercedes",
      "price": 22000,
      "model": "C-Class",
      "year": 2015,
      "horsepower": 280
    },
    {
      "_id": 4,
      "brand": "Toyota",
      "price": 15000,
      "model": "Camry",
      "year": 2016,
      "horsepower": 200
    },
    {
      "_id": 5,
      "brand": "BMW",
      "price": 30000,
      "model": "M3",
      "year": 2017,
      "horsepower": 400
    },
    {
      "_id": 6,
      "brand": "Audi",
      "price": 25000,
      "model": "Q5",
      "year": 2018,
      "horsepower": 300
    },
    {
      "_id": 7,
      "brand": "Mercedes",
      "price": 28000,
      "model": "E-Class",
      "year": 2019,
      "horsepower": 350
    },
    {
      "_id": 8,
      "brand": "Toyota",
      "price": 17000,
      "model": "RAV4",
      "year": 2016,
      "horsepower": 220
    },
    {
      "_id": 9,
      "brand": "Honda",
      "price": 20000,
      "model": "Accord",
      "year": 2018,
      "horsepower": 250
    },
    {
      "_id": 10,
      "brand": "Ford",
      "price": 19000,
      "model": "Mustang",
      "year": 2017,
      "horsepower": 350
    }
  ]);

db.autos.find();

/*v Выведите среднюю цену по брендам (задание на использование group).
v Выведите среднюю цену по годам.
v Выведите максимальную мощность по брендам.
v Выведите 3 самых дешевые машины.
v Выведите 3 самых дорогие машины определенного бренда.
v Выведите случайный автомобиль марки бмв (или другой на ваше усмотрение).*/

db.autos.aggregate([
{$group: {_id: "$brand", average_price: {$avg: "$price"}}}
]);

db.autos.aggregate([
{$group: {_id: "$year", average_price: {$avg: "$price"}}}
]);

db.autos.aggregate([
    {$group: {_id: "$brand", average_horsepower: {$max: "$horsepower"}}}
    ]);

    db.autos.aggregate([
        {$sort: {price: 1}},
        {$limit: 3}
       ]);

       db.autos.aggregate([
        {$match: {brand: "BMW"}},
        {$sort: {price: -1}},
        {$limit: 3}
       ]);

       db.autos.aggregate([
        {$match: {brand: "Toyota"}},
        {$sample: { size: 1, }, },
       ]);

db.owners.drop();
     
db.owners.insertMany([
    {
      autos: ["1","3","5"],
      owner: "Ivanov Ivan",
      phone: "1234567"
    },
    {
        autos: ["2","4","6","10"],
      owner: "Petrov Petr",
      phone: "2345678"
    },
    {
        autos: ["7","8","9"],
      owner: "Sidorov Sidr",
      phone: "3456789"
    },
   
  ]);




db.owners.find();



/* v Выведите владельцев вместе с их автомобилями
Выведите тех кто владеет автомобилями дороже 20000
Выведите среднюю цену машин у каждого владельца если эта цена больше 20000*/

db.owners.aggregate([
{$group: {_id: "$price", up20000_price: {$avg: "$price"}}}
]);
db.owners.aggregate([
{$lookup: {
    from: "autos", 
    localField: "model", 
    foreignField: "autos",  
    as: 'auto'
  }}
 ]);


 