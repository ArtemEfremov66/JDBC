INSERT INTO CUSTOMERS (id, name, surname, age, phone_number)
values ('1','Artem', 'Efr', '26', '2354'),
('2','Stiv', 'Zhop', '36', '2364'),
('3','Mint', 'Vops', '46', '3364'),
('4','Rol', 'Hot', '12', '3764');

update CUSTOMERS
set name='alexey'
where id = 3;

INSERT INTO ORDERS (id, date, customer_id , product_name , amount)
values ('1','01.05', '4', 'banana', '4'),
('2','05.04', '3', 'apple', '1'),
('3','23.05', '2', 'orange', '2'),
('4','03.09', '1', 'melow', '1');