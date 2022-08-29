insert into User(id, first_name, last_name, age)
values(1, 'Pankaj','Deshmukh',23);

insert into Cart(id, user_id, price, qty)
values (1, 1, 0 , 0);

insert into Product(product_id, product_name, product_price, genre, authour, publication)
values
(201, 'java', 1200, '1st', 'Pankaj', 'PD publication'),
(202, 'java script', 1200, '2nd', 'Suraj', 'viky publication'),
(203, 'block chain', 250, '30th', 'Prakash ', 'sarkar publication'),
(204, 'C++', 570, '5th', 'Roman', 'roman publication');

insert into Product(product_id, product_name, product_price, type, brand, design)
values (2005, 'Jackets', 351, 'Bommer jackets ', 'Vasant Apparel', 'Its boommer jacket black');