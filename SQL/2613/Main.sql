-- Script SQL
-- Escreva suas consultas aqui
SELECT movies.id, movies.name
FROM movies 
INNER JOIN prices
ON movies.id_prices = prices.id AND prices.value < 2.0;
