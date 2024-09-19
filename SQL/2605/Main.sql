-- Script SQL
-- Escreva suas consultas aqui
SELECT products.name,
	   providers.name
FROM products
INNER JOIN providers
on products.id_providers = providers.id
INNER JOIN categories
on products.id_categories = categories.id
WHERE categories.id = 6;
