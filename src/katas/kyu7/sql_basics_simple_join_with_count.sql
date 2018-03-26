SELECT p.*, COUNT(t.id) toy_count
FROM people p
JOIN toys t ON p.id = t.people_id
GROUP BY p.id;