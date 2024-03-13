-- ограничения (constraints) - это правила, которые накладываются на данные в таблице
-- Фермеры
CREATE TABLE farmer (
  id serial PRIMARY KEY,
  height int,
  -- CHECK - проверка на валидность данных
  --   age > 18 - возраст фермера должен быть больше 18
  age int CHECK (age > 18),
  -- NOT NULL - поле не может быть пустым
  --  имя фермера не может быть пустым
  name varchar NOT NULL,
  number_of_children int,
  -- DEFAULT - значение по умолчанию
  -- страна по умолчанию Германия
  country varchar NOT NULL DEFAULT ('Germany'),
  -- UNIQUE - уникальное значение
  -- номер фермера должен быть уникальным
  farmer_num int UNIQUE NOT NULL
);

CREATE TABLE animal (
  id serial PRIMARY KEY,
  -- ON DELETE CASCADE - если удалили фермера то удаляются все его животные
  -- ON DELETE SET NULL - если удалили фермера то в поле farmer_id его животных ставится NULL
  -- без ON DELETE невозможно удалить фермера, пока у него есть животные
  farmer_id integer REFERENCES farmer(id) ON DELETE CASCADE,
  type text NOT NULL,
  name text NOT NULL
);

INSERT INTO
  farmer (
    name,
    height,
    age,
    number_of_children,
    country,
    farmer_num
  )
VALUES
  ('Johanes', 180, 20, 5, 'Germany', 123),
  ('Pierre', 175, 40, 2, 'France', 456),
  ('Gerard', 184, 60, 4, 'Germany', 333),
  ('Marek', 168, 51, 0, 'Poland', 180),
  ('Hans', 177, 30, 1, 'Germany', 190);

INSERT INTO
  animal (farmer_id, type, name)
VALUES
  (1, 'cow', 'Бурёнка'),
  (1, 'dog', 'Шарик'),
  (2, 'cat', 'Мурка');