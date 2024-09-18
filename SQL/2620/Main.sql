-- Script SQL
-- Escreva suas consultas aqui
SELECT customers.name,
	   orders.id
FROM customers
INNER JOIN orders
ON orders.id_customers = customers.id
WHERE orders.orders_date BETWEEN '2015/12/31' AND '2016/07/01';
