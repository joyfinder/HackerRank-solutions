/*
Enter your query here.
*/
SET @num = 0;
SELECT repeat('* ', @num := @num + 1)
FROM information_schema.tables
limit 20;