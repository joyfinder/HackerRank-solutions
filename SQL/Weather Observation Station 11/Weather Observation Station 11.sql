/*
Enter your query here.
*/
SELECT DISTINCT CITY
FROM STATION
WHERE left(city, 1) NOT in ('a','e','i','o','u')
OR right(city, 1) NOT in ('a','e','i','o','u')