CREATE table CUSTOMERS (
id bigserial primary key,
name text,
surname text,
age integer,
phone_number bigserial);

CREATE table ORDERS (
id bigserial primary key,
date text,
customer_id bigserial,
product_name text,
amount integer,
foreign key (customer_id) references CUSTOMERS (id)
);

