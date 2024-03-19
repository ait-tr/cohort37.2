use("zoo");

// db.animals.insertMany([
//   { kind: "tiger", weight: 300, name: "Alan", predatory: true },
//   { kind: "penguin", weight: 2, name: "Kovalsky", predatory: true },
//   { kind: "chicken", weight: 1, name: "Cipa", predatory: false },
//   { kind: "shark", weight: 400, name: "Sharp", predatory: false },
//   { kind: "shark", weight: 450, name: "John", predatory: false },
//   { kind: "panda", weight: 200, name: "Po", predatory: false },
// ]);

// изменить поле у всех акул
// SQL: UPDATE animals SET predatory = true WHERE kind = "shark";
// db.animals.updateMany({ kind: "shark" }, { $set: { predatory: true } });

// увеличить вес всех животных на 3
// SQL: UPDATE animals SET weight = weight + 3;
// db.animals.updateMany({}, { $inc: { weight: 3 } });

// переименовать поле weight в kg
// db.animals.updateMany({}, { $rename: { weight: "kg" } });

// добавить поле foods
// db.animals.updateMany(
//   { predatory: true },
//   { $set: { foods: ["fish", "squid"] } }
// );

// добавить значение в массив
// db.animals.updateOne({ kind: "tiger" }, { $push: { foods: "wolf" } });
// db.animals.updateOne({ kind: "shark" }, { $push: { foods: "wolf" } });

// удаляем значение из массива
// db.animals.updateOne({ kind: "tiger" }, { $pull: { foods: "squid" } });

// SQL: UPDATE animals SET predatory = NULL WHERE kind = 'chicken' LIMIT 1
// удаляет поле
// db.animals.updateOne({ kind: "chicken" }, { $unset: { predatory: "" } });

// находим пингвина, а потом меняем ему поле по id
// const pinguin = db.animals.findOne({ kind: "penguin" }, { _id: 1 });

// изменить имя пингвина
// db.animals.updateOne(
//   { _id: ObjectId(pinguin._id) },
//   { $set: { name: "Kovalsky 2" } }
// );

// удалить одну акулу
// db.animals.deleteOne({ kind: "shark" });

// удалить всех акул
// db.animals.deleteMany({ kind: "shark" });

// db.animals.deleteOne({ _id: ObjectId(pinguin._id) });

db.animals.find();