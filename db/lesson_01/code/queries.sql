-- создание БД
CREATE DATABASE geography OWNER postgres;

-- создание таблицы
CREATE TABLE countries (
  id serial PRIMARY KEY,
  name varchar(80),
  population integer,
  area integer
);

-- добавление данных
INSERT INTO countries (name, population, area) VALUES
  ('Германия', 82000000, 357592),
  ('Россия', 147000000, 20000000),
  ('Китай', 1400000000, 9597000),
  ('Эльдорадо', 1000, 100000),
  ('МВидео', 5000000, 200000);

-- показать все страны
SELECT
  *
FROM
  countries;

-- показать все страны в алфавитном порядке
-- если у нас русский язык понадобится доп настройка
SELECT
  name
FROM
  countries
ORDER BY
  name ASC; -- по возрастанию

SELECT
  name
FROM
  countries
ORDER BY
  name DESC; -- по убыванию

-- вывести все страны с населением больше 100 млн человек
SELECT
  *
FROM
  countries
WHERE
  population > 100000000;

-- изменить население страны по названию
UPDATE
  countries
SET
  population = 90000000
WHERE
  name = 'Германия';

-- изменить площадь страны если в ней живёт больше 1 млрд чел
UPDATE
  countries
SET
  area = 15000000
WHERE
  population > 1000000000;

-- удалить страну по названию
DELETE FROM
  countries
WHERE
  name = 'МВидео';

-- удалить страну с населением меньше 1000000
DELETE FROM
  countries
WHERE
  population < 1000000;

-- Удалить страну с населением больше 100 млн чел и площадью меньше 200 млн
DELETE FROM
  countries
WHERE
  population > 100000000 AND area < 200000000;
