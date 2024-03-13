-- Разбор домашнего задания
-- Факультеты
CREATE TABLE faculty (id serial PRIMARY KEY, name text);

-- Студенты
-- связь один ко многим с факультетами: в одном факультете может учиться много студентов
CREATE TABLE student (
  id serial PRIMARY KEY,
  faculty_id int REFERENCES faculty (id),
  name text
);

-- Преподаватели
CREATE TABLE teacher (id serial PRIMARY KEY, name text);

-- Промежуточная таблица между студентами и преподавателями
-- для связи многие ко многим: один студент может учиться у многих преподавателей
-- и один преподаватель может преподавать многим студентам
CREATE TABLE student_teacher (
  student_id int REFERENCES student (id),
  teacher_id int REFERENCES teacher (id),
  PRIMARY KEY (student_id, teacher_id)
);

-- Дипломы
-- связь один к одному с таблицей студентов: у одного студента может быть только один диплом и наоборот
CREATE TABLE diploma (
  student_id int PRIMARY KEY REFERENCES student (id),
  title text
);

-- Заполняем данные
INSERT INTO
  faculty (name)
VALUES
  ('Информатика и вычислительная техника'),
  ('Прикладная математика и физика'),
  ('Биоинженерия и биоинформатика'),
  ('Экономика и управление');

INSERT INTO
  student (faculty_id, name)
VALUES
  (1, 'Алексей Иванов'),
  (1, 'Мария Петрова'),
  (2, 'Иван Сергеев'),
  (3, 'Елена Васильева'),
  (4, 'Дмитрий Николаев');

INSERT INTO
  teacher (name)
VALUES
  ('Андрей Андреев'),
  ('Виктория Семенова'),
  ('Георгий Павлов'),
  ('Светлана Алексеева');

INSERT INTO
  student_teacher (student_id, teacher_id)
VALUES
  (1, 1),
  (2, 2),
  (3, 3),
  (4, 4),
  (5, 1);

INSERT INTO
  diploma (student_id, title)
VALUES
  (1, 'Разработка веб-приложения на React'),
  (2, 'Применение машинного обучения в финансах'),
  (3, 'Анализ больших данных в биоинформатике'),
  (4, 'Исследование квантовых вычислений'),
  (5, 'Разработка игры на Unity');

-- JOIN запросы
-- выбрать всех студентов с их факультетами (связь один ко многим)
SELECT
  student.id as student_id,
  student.name as student_name,
  faculty.name as faculty_name
FROM
  student
  JOIN faculty ON student.faculty_id = faculty.id;

-- выбрать всех студентов с их дипломами (связь один к одному)
SELECT
  student.id as student_id,
  student.name as student_name,
  diploma.title as diploma_title
FROM
  student
  JOIN diploma ON diploma.student_id = student.id;

-- выбрать всех студентов преподавателя Андрея Андреева (связь многие ко многим)
SELECT
  *
FROM
  student
  JOIN student_teacher ON student_teacher.student_id = student.id
  JOIN teacher ON student_teacher.teacher_id = teacher.id
WHERE
  teacher.name = 'Андрей Андреев';