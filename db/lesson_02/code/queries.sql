-- ссылка на БД в google drive: https://docs.google.com/spreadsheets/d/1_F82nkr52Ed5iCwnURmVgvdHrkBftWMc5LmuDNuCO5o/edit#gid=0
-- ссылка на схему БД: https://drawsql.app/teams/team-3027/diagrams/contacts-book
-- создаём БД и таблицы
CREATE DATABASE contacts_book OWNER postgres;

CREATE TABLE person (id serial PRIMARY KEY, name text);

CREATE TABLE contact (
  id serial PRIMARY KEY,
  -- REFERENCES - означает связь между таблицами
  -- REFERENCES person (id) - колонка связана с id из таблицы person
  person_id integer REFERENCES person (id),
  type text,
  value text
);

-- Заполняем таблицы данными
INSERT INTO
  person (name)
VALUES
  ('Иванов Иван'),
  ('Иванов Иван'),
  ('Петров Пётр'),
  ('Сидоров Арсений');

INSERT INTO
  contact (person_id, type, value)
VALUES
  (1, 'phone', '+49111111111'),
  (1, 'phone', '88005555555'),
  (2, 'email', 'ivan@mail.com'),
  (3, 'link', 'vk.com/petr-1'),
  (3, 'email', 'petr@mail.com'),
  (4, 'email', 'arseniy@gmail.com'),
  (4, 'phone', '+79234440909');

-- JOIN - запрос позволяет выбрать данные из нескольких таблиц
SELECT
  *
FROM
  person
  JOIN contact -- соединяем таблицу person и contact
  ON person.id = contact.person_id;

-- соединяем по этому условию
-- выбираем имя и телефон (только телефоны)
SELECT
  person.name,
  contact.value
FROM
  person
  JOIN contact ON person.id = contact.person_id
WHERE
  contact.type = 'phone';

-- А теперь добавим таблицу группы и заполним данными
CREATE TABLE group (id serial PRIMARY KEY, name text);

INSERT INTO
  group (name)
VALUES
  ('friends'),
  ('work');

-- группы связаны с людьми связью многое ко многим
-- создаём промежуточную таблицу
CREATE TABLE person_group (
  person_id integer REFERENCES person (id),
  group_id integer REFERENCES group (id),
  -- в промежуточной таблице составной первичный ключ:
  PRIMARY KEY (person_id, group_id)
);

-- Добавляем людей в группы по ID
INSERT INTO
  person_group (person_id, group_id)
VALUES
  -- Иван - друг
  (1, 1),
  -- другой Иван тоже друг
  (2, 1),
  -- Пётр и друг
  (3, 1),
  -- и коллега
  (3, 2),
  -- Арсений - коллега
  (4, 2);

-- покажем все группы, в которые входит Арсений
-- тут нам придётся соединить 3 таблицы (person -> person_group -> group)
SELECT
  group.name
FROM
  person
  JOIN person_group ON person.id = person_group.person_id
  JOIN group ON person_group.group_id = group.id
WHERE
  person.name = 'Сидоров Арсений';