-- разбор предыдущего домашнего задания
CREATE TABLE faculty (
  id serial PRIMARY KEY,
  name text NOT NULL UNIQUE
);

-- Студенты
-- связь один ко многим с факультетами: в одном факультете может учиться много студентов
CREATE TABLE student (
  id serial PRIMARY KEY,
  faculty_id int NOT NULL REFERENCES faculty (id),
  name text NOT NULL,
  age int CHECK(
    age BETWEEN 16
    AND 90
  ),
  discharged bool NOT NULL DEFAULT(false)
);

CREATE INDEX student_name_index ON student(name);

-- Преподаватели
CREATE TABLE teacher (id serial PRIMARY KEY, name text NOT NULL);

-- Промежуточная таблица между студентами и преподавателями
-- для связи многие ко многим: один студент может учиться у многих преподавателей
-- и один преподаватель может преподавать многим студентам
CREATE TABLE student_teacher (
  student_id int REFERENCES student (id) ON DELETE CASCADE,
  teacher_id int REFERENCES teacher (id) ON DELETE CASCADE,
  PRIMARY KEY (student_id, teacher_id)
);

-- Дипломы
-- связь один к одному с таблицей студентов: у одного студента может быть только один диплом и наоборот
CREATE TABLE diploma (
  student_id int PRIMARY KEY REFERENCES student (id) ON DELETE CASCADE,
  title text NOT NULL
);

INSERT INTO
  faculty (name)
VALUES
  ('Информатика и вычислительная техника'),
  ('Прикладная математика и физика'),
  ('Биоинженерия и биоинформатика'),
  ('Экономика и управление');

INSERT INTO
  student (faculty_id, name, age)
VALUES
  (1, 'Алексей Иванов', 20),
  (1, 'Мария Петрова', 30),
  (2, 'Иван Сергеев', 40),
  (3, 'Елена Васильева', 50),
  (4, 'Дмитрий Николаев', 60);

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

-- После удаления студента сработают правила ON DELETE внешних ключей
DELETE FROM
  student
WHERE
  id = 1;

-- LIKE
SELECT
  *
FROM
  student
WHERE
  name LIKE 'Е%';

-- ILIKE
SELECT
  *
FROM
  student
WHERE
  name ILIKE 'е%';

-- IN
SELECT
  *
FROM
  student
WHERE
  faculty_id IN (2, 3) -- NOT IN
SELECT
  *
FROM
  student
WHERE
  faculty_id NOT IN (2, 3) -- BETWEEN
SELECT
  *
FROM
  student
WHERE
  age BETWEEN 30
  AND 50;

SELECT
  *
FROM
  student
WHERE
  age NOT BETWEEN 30
  AND 50;

SELECT
  *
FROM
  student
WHERE
  age IS NULL;

-- COUNT
SELECT
  COUNT(*) as students_count
FROM
  student
WHERE
  age IS NULL;

-- MAX, MIN, AVG
SELECT
  MAX(age)
FROM
  student;

SELECT
  MIN(age)
FROM
  student;

SELECT
  AVG(age)
FROM
  student;

-- GROUP BY
SELECT
  COUNT(*) as count,
  AVG(age) as avg_age
FROM
  student
GROUP BY
  faculty_id;

SELECT
  faculty_id,
  COUNT(*) as count,
  AVG(age) as avg_age
FROM
  student
GROUP BY
  faculty_id
HAVING
  AVG(age) IS NOT NULL;

SELECT
  faculty.name,
  COUNT(*) as count,
  AVG(student.age) as avg_age
FROM
  student
  JOIN faculty ON student.faculty_id = faculty.id
GROUP BY
  faculty.name
HAVING
  AVG(student.age) IS NOT NULL;