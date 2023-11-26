
DECLARE @customerId1 AS INT =302;
DECLARE @customerId2 AS INT = 303;

DELETE FROM web_order;
DELETE FROM product;
DELETE FROM address; 


INSERT INTO product (id, product_name, description, price, available) VALUES (1, 'Product #1', 'Product One Description', 5.50, 1);
INSERT INTO product (id, product_name, description, price, available) VALUES (2, 'Product #2', 'Product Two Description', 6.50, 1);
INSERT INTO product (id, product_name, description, price, available) VALUES (3, 'Product #3', 'Product Thr Description', 7.50, 1);
INSERT INTO product (id, product_name, description, price, available) VALUES (4, 'Product #4', 'Product Fou Description', 8.50, 1);
INSERT INTO product (id, product_name, description, price, available) VALUES (5, 'Product #5', 'Product Fiv Description', 9.50, 1);
DECLARE @product1 INT, @product2 INT, @product3 INT, @product4 INT, @product5 AS INT;

SELECT @product1 = id FROM product WHERE product_name = 'Product #1';
SELECT @product2 = id FROM product WHERE product_name = 'Product #2';
SELECT @product3 = id FROM product WHERE product_name = 'Product #3';
SELECT @product4 = id FROM product WHERE product_name = 'Product #4';
SELECT @product5 = id FROM product WHERE product_name = 'Product #5';

INSERT INTO address (id, address_line, city, country, zip_code, customerid) VALUES (1,'123 Tester Hill', 'Powder Springs', 'United States', '30127', @customerId1);
INSERT INTO address (id, address_line, city, country, zip_code, customerid) VALUES (2,'321 Hill Tester', 'Marietta', 'United States', '72103', @customerId2);

DECLARE @address1 INT, @address2 INT; 

SELECT TOP 1 @address1 = id FROM address WHERE customerid = @customerId1 ORDER BY id DESC;
SELECT TOP 1 @address2 = id FROM address WHERE customerid = @customerId2 ORDER BY id DESC; 

INSERT INTO web_order (id, addressid, customerid, productid) VALUES (1, @address1, @customerId1, @product1);
INSERT INTO web_order (id, addressid, customerid, productid) VALUES (2, @address2, @customerId2, @product2);
INSERT INTO web_order (id, addressid, customerid, productid) VALUES (3, @address1, @customerId1, @product3);
INSERT INTO web_order (id, addressid, customerid, productid) VALUES (4, @address2, @customerId2, @product4);
INSERT INTO web_order (id, addressid, customerid, productid) VALUES (5, @address1, @customerId1, @product5);


