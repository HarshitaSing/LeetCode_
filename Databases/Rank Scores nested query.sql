select s1.score,temp.rank
from Scores s1,
(select distinct(s2.score),
 rank() over(order by score desc) as `rank` 
 from Scores s2 group by s2.score) 
 as temp 
where s1.score = temp.score order by temp.score desc;