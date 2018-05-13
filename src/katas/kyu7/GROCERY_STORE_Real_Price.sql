SELECT name, weight, price, (round((price/(weight * 1./1000.)) ::numeric, 2) ::double precision) AS price_per_kg
FROM products
ORDER BY price_per_kg, name;