
-- Создание таблиц
CREATE TABLE type (id SERIAL PRIMARY KEY, name VARCHAR(30));
CREATE TABLE product (id SERIAL PRIMARY KEY, name VARCHAR(30), type_id INT REFERENCES type(id), expired_date TIMESTAMP, price FLOAT);

-- Внес изменение в таблицу,т.к. в задаче оказалось нужно доп.поле
ALTER TABLE product ADD COLUMN value INT;

-- Заполнение таблиц
INSERT INTO type (name) VALUES ('СЫР');
INSERT INTO type (name) VALUES ('МОЛОКО');
INSERT INTO type (name) VALUES ('РЫБА');
INSERT INTO type (name) VALUES ('ДЕСЕРТ');

-- Заполнение таблицы
INSERT INTO product (name, type_id, expired_date, price, value) VALUES ('Пармезан', '1', '2018-10-30', '300.5', '34');
INSERT INTO product (name, type_id, expired_date, price, value) VALUES ('Сливочный', '1', '2018-11-05', '260.0', '14');
INSERT INTO product (name, type_id, expired_date, price, value) VALUES ('Деревенское 2,5', '2', '2018-10-29', '45.0', '70');
INSERT INTO product (name, type_id, expired_date, price, value) VALUES ('Деревенское 3,5', '2', '2018-10-30', '54.3', '4');
INSERT INTO product (name, type_id, expired_date, price, value) VALUES ('Самса', '3', '2018-11-05', '215.0', '16');
INSERT INTO product (name, type_id, expired_date, price, value) VALUES ('Сельдь', '3', '2018-11-10', '295.0', '23');
INSERT INTO product (name, type_id, expired_date, price, value) VALUES ('Золотая марка', '4', '2018-11-30', '90.0', '104');
INSERT INTO product (name, type_id, expired_date, price, value) VALUES ('Сибирское мороженое', '4', '2018-11-30', '300.5', '57');


--Запросы по заданию:

----Получение всех продуктов с типом "СЫР"
SELECT * FROM product WHERE type_id = '1';

----Получение всех продуктов, в имени которых есть слово "мороженое"
SELECT * FROM product as p WHERE p.name LIKE '%мороженое%';

----Получить все продукты, срок годности кот. заканчивается в сл. месяце
SELECT * FROM product as p WHERE p.expired_date > '2018-11-01';

----Получить самый дорогой продукт
SELECT MAX(price) FROM product;

----Выводит количество всех продуктов определенного типа(в данном случае 2).
SELECT count(*) FROM product where type_id = '2';

----Запрос получение всех продуктов с типом "СЫР" и "МОЛОКО"
SELECT * FROM product WHERE type_id = '1' OR type_id='2';

----Запрос, который выводит тип продуктов, которых осталось меньше 10 штук.
SELECT type_id FROM product WHERE value < '10';

----Вывести все продукты и их тип
SELECT name, type_id FROM product;
