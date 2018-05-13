SELECT COUNT(id) AS unique_products, producer
FROM products
GROUP BY producer
ORDER BY unique_products DESC, producer;