/*
Enter your query here.
*/

SELECT ROUND(abs((MAX(LAT_N) - MIN(LAT_N)))+ABS((MAX(LONG_W)-MIN(LONG_W))),4) 
FROM STATION