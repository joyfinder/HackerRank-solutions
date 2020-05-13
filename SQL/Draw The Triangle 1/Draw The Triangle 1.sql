/*
Enter your query here.
*/

SET @num = 21;
SELECT repeat('* ', @num := @num - 1) 
FROM information_schema.tables;
