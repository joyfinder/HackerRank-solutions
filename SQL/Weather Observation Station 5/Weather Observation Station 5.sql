/*
Enter your query here.
*/
SELECT CITY, length(CITY)
FROM STATION order by length(CITY), 
city limit 1;

SELECT CITY, length(CITY)
FROM STATION order by length(CITY) desc, 
city limit 1;