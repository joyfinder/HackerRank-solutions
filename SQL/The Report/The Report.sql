/*
Enter your query here.
*/
SELECT (CASE g.grade < 8 WHEN TRUE THEN null ELSE s.name END), g.grade, s.marks
FROM students s INNER JOIN grades g on s.marks
Between min_mark AND max_mark order by g.grade desc, s.name, s.marks;
