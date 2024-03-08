--LC 176. Second Highest Salary
select max(salary) as SecondHighestSalary from Employee where salary not in
 (select max(salary) from Employee );

-- 177. Nth Highest Salary
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N = N-1;
  RETURN (
      SELECT DISTINCT(salary) from Employee order by salary DESC
      LIMIT 1 OFFSET N
      
  );
END

