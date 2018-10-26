-- Создание таблиц из задания

create table car_body (id serial primary key, name varchar(20));
create table engine (id serial primary key, name varchar(20));
create table transmission (id serial primary key, name varchar(20));
create table cars (id serial primary key, name varchar(20), car_body_id int references car_body(id), engine_id int references engine(id), transmission_id int references transmission(id));
-----------------------------------------------


--Заполнение таблиц данными

insert into car_body(name) values('car_body_first');
insert into car_body(name) values('car_body_second');
insert into car_body(name) values('car_body_third');
insert into car_body(name) values('car_body_fourth');

insert into engine(name) values('engine_first');
insert into engine(name) values('engine_second');
insert into engine(name) values('engine_third');

insert into transmission(name) values('transmission_first');
insert into transmission(name) values('transmission_second');
insert into transmission(name) values('transmission_third');
insert into transmission(name) values('transmission_fourth');

insert into cars(name, car_body_id, engine_id, transmission_id) values('Lada', '1', '1','3');
insert into cars(name, car_body_id, engine_id, transmission_id) values('Audi', '3', '2','3');
insert into cars(name, car_body_id, engine_id, transmission_id) values('BMW', '4', '2','1');
insert into cars(name, car_body_id, engine_id, transmission_id) values('KIA', '1', '1','3');
-----------------------------------------------


-- Запрос на вывод всех машин с используемыми комплектующими

select c.name, cb.name, e.name, t.name from cars as c left outer join car_body as cb on c.car_body_id = cb.id left outer join engine as e on c.engine_id = e.id left outer join transmission as t on c.transmission_id = t.id;
------------------------------------------------


-- Запросы на вывод комплектующих, которые не используются в машинах

select cb.name from car_body as cb left outer join cars as c on c.car_body_id = cb.id where c.id is null;
select e.name from engine as e left outer join cars as c on c.engine_id = e.id where c.id is null;
select t.name from transmission as t left outer join cars as c on c.transmission_id = t.id where c.id is null;
------------------------------------------------