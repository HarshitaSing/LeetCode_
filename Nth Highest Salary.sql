CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
     
      select max(Salary) from Employee e1 where N-1 = (select count(distinct Salary) from Employee e2 where e2.Salary > e1.Salary)
      
);
END