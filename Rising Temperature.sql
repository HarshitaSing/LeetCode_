select w.Id 
from Weather w, Weather w1 
where datediff(w.RecordDate, w1.RecordDate)  = 1
and w.Temperature >w1.Temperature;