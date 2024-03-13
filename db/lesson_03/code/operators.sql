-- основные операторы SQL и операторы агрегации
-- LIKE, ILIKE - поиск по шаблону
-- % - любое количество символов
-- _ - один символ
-- фермеры с именем, начинающимся на J
SELECT
  *
FROM
  farmer
WHERE
  name LIKE 'J%';

-- фермеры с именем, содержащим букву j
SELECT
  *
FROM
  farmer
WHERE
  name LIKE '%j%';

-- фермеры с именем, содержащим букву j или J (без учета регистра)
SELECT
  *
FROM
  farmer
WHERE
  name ILIKE '%j%';

-- вместо двух символов _ может быть любой символ
SELECT
  *
FROM
  farmer
WHERE
  name LIKE 'Pie__e';

-- IN, NOT IN - выборка из нескольких значений
-- SELECT name FROM farmer WHERE country = 'France' OR country = 'Poland' OR country = 'Germany'
-- Все фермеры из Франции, Польши и Германии
SELECT
  name
FROM
  farmer
WHERE
  country IN ('France', 'Poland', 'Germany') -- Все фермеры не из Франции и Польши
SELECT
  name,
  country
FROM
  farmer
WHERE
  country NOT IN ('France', 'Poland') -- BETWEEN - выборка из диапазона
  -- Все фермеры с ростом от 177 до 180
SELECT
  *
FROM
  farmer
WHERE
  height BETWEEN 177
  AND 180;

-- Все фермеры с ростом менее 177 и более 180
SELECT
  *
FROM
  farmer
WHERE
  height NOT BETWEEN 177
  AND 180;

-- IS NULL - проверка на пустое значение
-- Все фермеры без возраста
SELECT
  *
FROM
  farmer
WHERE
  age IS NULL;

-- Все фермеры с возрастом
SELECT
  *
FROM
  farmer
WHERE
  age IS NOT NULL;

-- операторы агрегации
-- COUNT - количество фермеров, у которых рост между 177 и 180
SELECT
  COUNT(*)
FROM
  farmer
WHERE
  height BETWEEN 177
  AND 180;

-- SUM - сумма роста всех фермеров
SELECT
  SUM(height)
FROM
  farmer;

-- AVG - средний рост фермеров
SELECT
  AVG(height) AS avarage_height
FROM
  farmer;

-- MAX - максимальный рост фермеров
SELECT
  MAX(age) AS max_age
FROM
  farmer;

-- найдём имя самого взрослого фермера, для этого отсортируем фермеров по возрасту по убыванию и выберем первого
-- LIMIT - выбрать конкретное количество строк
SELECT
  name,
  age
FROM
  farmer
WHERE
  age IS NOT NULL
ORDER BY
  age DESC
LIMIT
  1;

-- GROUP BY - группировка по столбцу
-- вывести количество фермеров в каждой стране
SELECT
  country,
  COUNT(*)
FROM
  farmer
GROUP BY
  country;

-- сгруппировать фермеров по стране и вывести средний рост в каждой стране
SELECT
  country,
  AVG(height) AS average_height
FROM
  farmer
GROUP BY
  country;

-- HAVING - фильтрация по результатам группировки
-- вывести только те страны, в которых больше 1 фермера
SELECT
  country,
  COUNT(*)
FROM
  farmer
GROUP BY
  country
HAVING
  COUNT(*) > 1;

-- сгруппировать фермеров по количеству детей и вывести их средний возраст в каждой группе
-- вывести только те группы, в которых средний возраст меньше 50
SELECT
  number_of_children,
  AVG(age)
FROM
  farmer
GROUP BY
  number_of_children
HAVING
  AVG(age) < 50;