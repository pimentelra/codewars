WITH RECURSIVE factorial(n, fact) AS (
    VALUES (0, cast(1 AS BIGINT))
    UNION ALL
    SELECT n + 1, (n + 1) * fact
    FROM factorial
)
SELECT n, fact FROM factorial LIMIT 17;