/*
Enter your query here.
*/
SELECT NAME
FROM STUDENTS
WHERE Marks > 75 order by right(name, 3), ID ASC;