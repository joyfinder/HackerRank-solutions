/*
Enter your query here.
*/

/* these are the columns we want to output */
select c.hacker_id, h.name ,count(c.hacker_id) as c_count

/* this is the join we want to output them from */
from Hackers as h
    inner join Challenges as c on c.hacker_id = h.hacker_id

/* after they have been grouped by hacker */
group by c.hacker_id, h.name

/* Selecting filters*/
having 
    /* Outputing counts*/
    c_count in 
        /* Selecting counting less than 1 challenge IDs*/
        (select temp2.cnt
         from (select count(*) as cnt 
               from challenges
               group by hacker_id) temp2        
         group by temp2.cnt
         having count(temp2.cnt) = 1)

    or c_count = 
        /* Maximum counts */
        (SELECT MAX(temp1.cnt)
        from (SELECT COUNT(hacker_id) as cnt
             from Challenges
             group by hacker_id
             order by hacker_id) temp1)

order by c_count DESC, c.hacker_id;