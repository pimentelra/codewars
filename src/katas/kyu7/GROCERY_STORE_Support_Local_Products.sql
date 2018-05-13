SELECT COUNT(id) AS products, country
FROM products
WHERE country IN ('Canada', 'United States of America')
GROUP BY country
ORDER BY products DESC;