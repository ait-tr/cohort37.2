use("university2");

// // // Вставка факультетов
// db.faculties.insertMany([
//   { _id: "f1", name: "Информатика и вычислительная техника" },
//   { _id: "f2", name: "Прикладная математика и физика" },
//   { _id: "f3", name: "Биоинженерия и биоинформатика" },
//   { _id: "f4", name: "Экономика и управление" },
// ]);

// // // Вставка студентов с вложенным документом диплома
// db.students.insertMany([
//   {
//     _id: "s1",
//     faculty_id: "f1",
//     name: "Алексей Иванов",
//     age: 20,
//     discharged: false,
//     diploma: { title: "Разработка веб-приложения на React" },
//   },
//   {
//     _id: "s2",
//     faculty_id: "f1",
//     name: "Мария Петрова",
//     age: 30,
//     discharged: false,
//     diploma: { title: "Применение машинного обучения в финансах" },
//   },
//   {
//     _id: "s3",
//     faculty_id: "f2",
//     name: "Иван Сергеев",
//     discharged: false,
//     diploma: { title: "Анализ больших данных в биоинформатике" },
//   },
//   {
//     _id: "s4",
//     faculty_id: "f3",
//     name: "Елена Васильева",
//     age: 50,
//     discharged: false,
//     diploma: { title: "Исследование квантовых вычислений" },
//   },
//   {
//     _id: "s5",
//     faculty_id: "f4",
//     name: "Дмитрий Николаев",
//     discharged: false,
//     diploma: { title: "Разработка игры на Unity" },
//   },
//   {
//     _id: "s6",
//     faculty_id: "f1",
//     name: "Никита Жуков",
//     age: 22,
//     discharged: false,
//   },
//   {
//     _id: "s7",
//     faculty_id: "f2",
//     name: "Ольга Кузнецова",
//     discharged: false,
//   },
//   {
//     _id: "s8",
//     faculty_id: "f3",
//     name: "Павел Новиков",
//     age: 25,
//     discharged: false,
//   },
//   {
//     _id: "s9",
//     faculty_id: "f4",
//     name: "Анна Зайцева",
//     discharged: false,
//   },
//   {
//     _id: "s10",
//     faculty_id: "f1",
//     name: "Сергей Морозов",
//     age: 24,
//     discharged: false,
//   },
// ]);

// // // Вставка преподавателей
// db.teachers.insertMany([
//   { _id: "t1", name: "Андрей Андреев", students: ["s1", "s2", "s3"] },
//   { _id: "t2", name: "Виктория Семенова", students: ["s4", "s5"] },
//   { _id: "t3", name: "Георгий Павлов", students: ["s6", "s7"] },
//   { _id: "t4", name: "Светлана Алексеева", students: ["s8", "s9", "s10"] },
// ]);

// SQL:SELECT name FROM student ORDER BY age DESC LIMIT 3;
// db.students.aggregate([
//   // сортируем по возрасту
//   { $sort: { age: -1 } },
//   // берём только первых трёх
//   { $limit: 3 },
//   // выводим только имя
//   { $project: { name: 1, _id: 0 } },
// ]);

// SELECT
//   COUNT(*) as count,
//   AVG(age) as avg_age
// FROM
//   student
// GROUP BY
//   faculty_id;
db.students.aggregate([
  {
    $match: {
      age: { $exists: true },
    },
  },
  {
    $group: {
      _id: "$faculty_id",
      averageAge: {
        $avg: "$age",
      },
      studentsCount: {
        $count: {},
      },
    },
  },
]);

// SELECT
//   faculty_id,
//   COUNT(*) as count,
//   AVG(age) as avg_age
// FROM
//   student
// GROUP BY
//   faculty_id
// HAVING
//   AVG(age) > 30;
db.students.aggregate([
  // выбрали всех студентов с полем age
  {
    $match: {
      age: { $exists: true },
    },
  },
  // сгруппировали студентов по факультету и узнали ср. возраст и кол-во в каждой группе
  {
    $group: {
      _id: "$faculty_id",
      averageAge: {
        $avg: "$age",
      },
      studentsCount: {
        $count: {},
      },
    },
  },
  // оставляем только группы со ср. возрастом больше 30
  {
    $match: { averageAge: { $gt: 30 } },
  },
]);

db.students.aggregate([
  {
    $lookup: {
      from: "faculties",
      localField: "faculty_id",
      foreignField: "_id",
      as: "faculty",
    },
  },
]);

// SELECT
//   faculty.name,
//   COUNT(*) as count,
//   AVG(student.age) as avg_age
// FROM
//   student
//   JOIN faculty ON student.faculty_id = faculty.id
// GROUP BY
//   faculty.name
// HAVING
//   AVG(student.age) IS NOT NULL;
// db.students.aggregate([
//   // выбрали всех студентов с полем age
//   {
//     $match: {
//       age: { $exists: true },
//     },
//   },
//   {
//     $lookup: {
//       from: "faculties",
//       localField: "faculty_id",
//       foreignField: "_id",
//       as: "faculty",
//     },
//   },
//   // сгруппировали студентов по факультету и узнали ср. возраст и кол-во в каждой группе
//   {
//     $group: {
//       _id: "$faculty.name",
//       averageAge: {
//         $avg: "$age",
//       },
//       studentsCount: {
//         $count: {},
//       },
//     },
//   },
//   // оставляем только группы со ср. возрастом больше 30
//   {
//     $match: { averageAge: { $gt: 30 } },
//   },
// ]);

// вывести 2 случайных студента
// db.students.aggregate([{ $sample: { size: 2 } }]);

db.faculties.aggregate([
  {
    $lookup: {
      from: "students",
      localField: "_id",
      foreignField: "faculty_id",
      as: "students",
    },
  },
  {
    $match: {
      "students.age": {
        $gt: 25,
      },
    },
  },
]);