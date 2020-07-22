/*Write your MySQL query statement below
*/

select temp.Name as Department,e.Name as Employee,temp.maxsal as Salary 
from 
	(select e.id,max(e.Salary) as maxsal,d.Name,e.DepartmentId as dept 
	from Employee e 
	inner join Department d on e.DepartmentId = d.Id 
	group by e.DepartmentId,d.Name) as temp 
inner join Employee e on e.Salary = temp.maxsal and e.DepartmentId=temp.dept;