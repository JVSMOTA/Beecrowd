-- Script SQL
-- Escreva suas consultas aqui
SELECT products.name,
       categories.name
FROM products
INNER JOIN categories
on products.id_categories = categories.id
WHERE products.amount > 100 AND (categories.id <= 3 OR categories.id = 6 OR categories.id = 9);
