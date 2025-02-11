-- create new database
create database test

---------------------------------------------------------------------------------------------------

-- table categories
create table categories(
	id serial primary key,
	category_name varchar(255) not null
)

-- table products
create table products(
	id serial primary key,
	product_name varchar not null,
	product_price int,
	categories_id int not null,
	constraint fk_categories foreign key (categories_id) references categories(id) on delete cascade
)

-- table customers
create table customers(
	id serial primary key,
	customer_name varchar(255) not null,
	customer_address varchar
)

-- table orders
create table orders(
	id serial primary key,
	customer_id int not null,
	order_date date not null,
	constraint fk_customers foreign key (customer_id) references customers(id) on delete cascade
)

-- table order items
create table order_items(
	id serial primary key,
	order_id int not null,
	product_id int not null,
	quantity int not null,
	constraint fk_orders foreign key (order_id) references orders(id) on delete cascade,
	constraint fk_products foreign key (product_id) references products(id) on delete cascade
)

-- table product review
create table products_reviews(
	id serial primary key,
	product_id int not null,
	customer_id int not null,
	rating int,
	description varchar,
	review_date date,
	constraint fk_products foreign key (product_id) references products(id) on delete cascade,
	constraint fk_customers foreign key (customer_id) references customers(id) on delete cascade
)

-- table payment details
create table payment_detail(
	order_id int not null,
	payment_method varchar,
	is_paid boolean default false,
	payment_date date,
	constraint fk_orders foreign key (order_id) references orders(id) on delete cascade
)

---------------------------------------------------------------------------------------------------

-- input data categories
insert into categories (category_name)
values
('Food'),
('Book'),
('Tools')

-- input data products
insert into products
(product_name, product_price, categories_id)
values
('Apel',25000,1),
('Quran',75000,2),
('Tang',35000,3)

-- input data customer
insert into customers (customer_name, customer_address)
values
('Dimas', 'Depok'),
('Sulaksono', 'Jakarta')

-- input data orders
insert into orders
(customer_id, order_date)
values
(1,'2025-02-10'),
(2,'2025-02-11')

-- input data order items
insert into order_items
(order_id, product_id, quantity)
values
(1, 2, 100),
(2, 1, 20),
(2, 3, 50)

-- input data product reviews
insert into products_reviews
(product_id, customer_id, rating, description, review_date)
values
(1, 1, 5, 'apelnya enak', '2025-02-11'),
(2, 2, 5, 'sampulnya bagus, aku suka', '2025-02-11'),
(3, 2, 4, 'lumayan', '2025-02-11')

-- input payment_details
insert into payment_detail
(order_id, payment_method, is_paid, payment_date)
values
(1, 'BCA', true, '2025-02-10'),
(2, 'Cash', true, '2025-02-11')


---------------------------------------------------------------------------------------------------

-- select categories
select * from categories c

-- select products
select * from products p

-- select customers
select * from customers c

-- select orders
select * from orders o

-- select order_items
select * from order_items oi

-- select products_reviews
select * from products_reviews pr

-- select payment_detail
select * from payment_detail pd


---------------------------------------------------------------------------------------------------

-- join products with categories
select
	p2.id,
	p2.product_name,
	p2.product_price,
	c.category_name
from products p2
inner join categories c on c.id = p2.categories_id


-- join orders with customers
select
	o.id,
	o.order_date,
	c.customer_name
from orders o
inner join customers c on c.id = o.customer_id

-- join orders items with products
select
	oi.order_id,
	p.product_name,
	oi.quantity,
	p.product_price,
	(p.product_price * oi.quantity) as sub_total
from order_items oi
inner join products p on p.id = oi.product_id

-- join orders, orders items with products
select
	--o.id as order_id,
	--o.customer_id,
	o.order_date,
	p.product_name,
	p.product_price,
	oi.quantity,
	(p.product_price * oi.quantity) as sub_total
from orders o
inner join order_items oi on oi.order_id = o.id
inner join products p on p.id = oi.product_id
where o.id = 2

union all -- buat gabungin dua select

select
	null, null, null, null,
	sum(p.product_price * oi.quantity) as total -- total pesanan
from orders o
inner join order_items oi on oi.order_id = o.id
inner join products p on p.id = oi.product_id
where o.id = 2

-- join product review with products and customers
select
	c.customer_name,
    p.product_name,
	pr.rating,
	pr.description,
	pr.review_date
from products_reviews pr
inner join products p on p.id = pr.product_id
inner join customers c on c.id = pr.customer_id

---------------------------------------------------------------------------------------------------

-- view product details
create view product_details as
select
	p.id as "id produk",
	p.product_name as "nama produk",
	p.product_price as "harga produk",
	c.category_name as "kategori"
from products p
inner join categories c on c.id = p.categories_id

select * from product_details

drop view product_details

-- view customer_orders
create view customer_orders as
select
	c.customer_name as "nama pelanggan",
	o.id as "nomor pesanan",
	o.order_date as "tanggal pesan",
	p.product_name as "nama produk",
	p.product_price as "harga",
	oi.quantity as "jumlah",
	(p.product_price * oi.quantity) as "sub total"
from orders o
inner join order_items oi on oi.order_id = o.id
inner join products p on p.id = oi.product_id
inner join customers c on c.id = o.customer_id

select * from customer_orders where "nomor pesanan" = 2
union all -- buat gabungin dua select
select
	null, null, null, null, null, null,
	sum("harga" * "jumlah") as total -- total pesanan
from customer_orders where "nomor pesanan" = 2

drop view customers_orders


-- view order items details
create view order_items_details as
select
	oi.order_id as "nomor pesanan",
	c.category_name as "kategori",
	p.product_name as "nama produk",
	p.product_price as "harga produk",
	oi.quantity as "jumlah",
	(p.product_price * oi.quantity) as "sub total"
from order_items oi
inner join products p on p.id = oi.product_id
inner join categories c on c.id = p.categories_id

select * from order_items_details
where "nomor pesanan" = 2

drop view order_items_details

-- view product reviews details
create view product_reviews_details as
select
	c.customer_name as "nama pembeli",
	pr.review_date as "tanggal review",
	p.product_name as "nama produk",
	pr.rating as "penilaian 1-5",
	pr.description "deskripsi"
from products_reviews pr
inner join products p on p.id = pr.product_id
inner join customers c on c.id = pr.customer_id

select * from product_reviews_details
where "penilaian 1-5" > 4

drop view product_reviews_details

