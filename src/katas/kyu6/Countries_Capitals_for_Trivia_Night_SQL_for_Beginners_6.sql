SELECT capital
FROM countries
WHERE LOWER(continent) IN ('africa', 'afrika')
    AND LOWER(country) LIKE 'e%'
ORDER BY capital
LIMIT 3;