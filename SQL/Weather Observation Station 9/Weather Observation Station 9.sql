/*
Enter your query here.
*/
SELECT DISTINCT CITY
FROM STATION
WHERE left(city, 1) NOT IN ('a','e','i','o','u');