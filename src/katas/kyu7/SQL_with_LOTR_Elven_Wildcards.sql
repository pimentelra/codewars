SELECT initcap(concat_ws(' ', firstname, lastname)) AS shortlist
FROM elves
WHERE firstname LIKE '%tegil%'
OR    lastname  LIKE '%astar%';