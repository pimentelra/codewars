SELECT
  race, count(id) AS count
FROM demographics
GROUP BY race
ORDER BY count DESC;