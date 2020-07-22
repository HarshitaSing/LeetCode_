select Email 
from Person 
group by Email 
having COUNT(Email)>1;
