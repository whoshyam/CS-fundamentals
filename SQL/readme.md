# Table of Contents

- [Basics](#Basics)
- [practise probs](#practise-probs)
- [Leetcode SQL 50](#Leetcode-SQL-50)
 
---

### Basics

<details>
<summary><b>What is the difference between DELETE and TRUNCATE?</b></summary>
<p>
The delete statement removes single or multiple rows from an existing table depending on the specified condition.
DELETE statement is used to delete a row from a table.
 
The truncate command deletes the whole contents of an existing table without the table itself. It pserves the table structure or schema.
TRUNCATE statement is used to remove all the rows from a table.
</p>
</details>

<details>
<summary><b>What are aggregate functions? Provide examples.</b></summary>
<p>
  "Aggregate functions are
 SQL functions that perform a calculation on a set of values and return a single value. These functions are commonly used to summarize data, such as calculating totals, averages, counts, etc. Aggregate functions are often used with the GROUP BY clause in SQL to group rows that share a property.
ex--COUNT(),SUM()"
</p>
</details>

<details>
<summary><b>How can you optimize an SQL query?</b></summary>
<p>
  "Avoid SELECT * (Use Specific Columns)
Use Joins Instead of Subqueries
Use EXISTS Instead of IN for Subqueries
"
</p>
</details>

<details>
<summary><b>What is a cursor in SQL?</b></summary>
<p>
  "A cursor in SQL is a database object used to retrieve, manipulate, and navigate through a result set one row at a time. Cursors are particularly useful when you need to process individual rows returned by a query, especially in cases where a more procedural approach is required, like performing row-by-row operations.
"
</p>
</details>

<details>
<summary><b>What is the difference between a primary key and a unique key?</b></summary>
<p>
  "The primary key and unique key both are essential constraints of the SQL. The main difference among them is that the primary key identifies each record in the table. In contrast, the unique key pvents duplicate entries in a column except for a NULL value. The following comparison chart explains it more clearly:
 
Unique, can be null, table can have multiple unique atributes
"
</p>
</details>

<details>
<summary><b>What is the primary use of Normalization?</b></summary>
<p>
  "Normalization is mainly used to add, delete or modify a field that can be made in a single table. The primary use of Normalization is to remove redundancy and remove the insert, delete and update distractions. Normalization breaks the table into small partitions and then links them using different relationships to avoid the chances of redundancy.
"
</p>
</details>

<details>
<summary><b>What are the disadvantages of not performing database Normalization?</b></summary>
<p>
  "The occurrence of redundant terms in the database causes the waste of space in the disk.
 
Due to redundant terms, inconsistency may also occur. If any change is made in the data of one table but not made in the same data of another table, then inconsistency will occur. This inconsistency will lead to the maintenance problem and effects the ACID properties as well.
"
</p>
</details>

<details>
<summary><b>What is the difference between IN and BETWEEN operators?</b></summary>
<p>
  "The occurrence of redundant terms in the database causes the waste of space in the disk.
 
Due to redundant terms, inconsistency may also occur. If any change is made in the data of one table but not made in the same data of another table, then inconsistency will occur. This inconsistency will lead to the maintenance problem and effects the ACID properties as well."
</p>
</details>

<details>
<summary><b>What is the ACID property in a database?</b></summary>
<p>
  "The ACID properties are meant for the transaction that goes through a different group of tasks. A transaction is a single logical order of data. It provides properties to maintain consistency before and after the transaction in a database. It also ensures that the data transactions are processed reliably in a database system.
 
The ACID property is an acronym for Atomicity, Consistency, Isolation, and Durability.
 
Atomicity: It ensures that all statements or operations within the transaction unit must be executed successfully. If one part of the transaction fails, the entire transaction fails, and the database state is left unchanged. Its main features are COMMIT, ROLLBACK, and AUTO-COMMIT.
 
Consistency: This property ensures that the data must meet all validation rules. In simple words, we can say that the database changes state only when a transaction will be committed successfully. It also protects data from crashes.
 
Isolation: This property guarantees that the concurrent property of execution in the transaction unit must be operated independently. It also ensures that statements are transparent to each other. The main goal of providing isolation is to control concurrency in a database.
 
Durability: This property guarantees that once a transaction has been committed, it persists permanently even if the system crashes, power loss, or failed.
"
</p>
</details>

<details>
<summary><b>Explain ON DELETE CASCADE</b></summary>
<p>
  "ON DELETE CASCADE is an option that you can set on a foreign key constraint in a relational database. It defines the behavior that should occur when a row in the parent table (the table containing the primary key) is deleted.
 
CREATE TABLE orders (
order_id INT PRIMARY KEY,
customer_id INT,
FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
ON DELETE CASCADE
);"
</p>
</details>

<details>
<summary><b>Explain ON UPDATE CASCADE</b></summary>
<p>
  ON UPDATE CASCADE is another option you can set on a foreign key constraint. It defines the behavior that should occur when a row in the parent table is updated
</p>
</details>

---

## Leetcode SQL 50

<details>
<summary>1068. Product Sales Analysis I</summary>
  
  ```sql
"SELECT 
p.product_name, s.year, s.price
FROM 
Sales s
JOIN 
Product p
ON
s.product_id = p.product_id"
  ```

</details>

<details>
<summary>1075. Project Employees I</summary>

```sql
"SELECT 
project_id,
ROUND(AVG(experience_years), 2) AS average_years
FROM 
Project p
JOIN 
Employee e
ON 
p.employee_id = e.employee_id
GROUP BY 
project_id"
```

</details>

<details>
<summary>1141. User Activity for the Past 30 Days I</summary>

```sql
"SELECT activity_date AS day, COUNT(DISTINCT user_id) AS active_users
FROM Activity
WHERE (activity_date > ""2019-06-27"" AND activity_date <= ""2019-07-27"")
GROUP BY activity_date;"
```

</details>

<details>
<summary>1148. Article Views I</summary>

```sql
"select distinct author_id as id from Views
where author_id = viewer_id 
order by id;"
```

</details>

<details>
<summary>1211. Queries Quality and Percentage</summary>

```sql
"SELECT 
query_name,
ROUND(AVG(rating / position), 2) AS quality,
ROUND(AVG(rating < 3) * 100, 2) AS poor_query_percentage 
FROM 
Queries
GROUP BY 
query_name"
```

</details>

<details>
<summary>1251. Average Selling Price</summary>

```sql
"SELECT p.product_id, IFNULL(ROUND(SUM(units*price)/SUM(units),2),0) AS average_price
FROM Prices p LEFT JOIN UnitsSold u
ON p.product_id = u.product_id AND
u.purchase_date BETWEEN start_date AND end_date
group by product_id"
```

</details>

<details>
<summary>1280. Students and Examinations</summary>

```sql
"SELECT S.student_id, S.student_name, SUB.subject_name, 
count(E.subject_name) AS attended_exams FROM Students S CROSS JOIN 
Subjects SUB LEFT OUTER JOIN Examinations E ON 
S.student_id = E.student_id AND SUB.subject_name = E.subject_name 
GROUP BY S.student_id, S.student_name,SUB.subject_name ORDER BY 
S.student_id, SUB.subject_name"
```

</details>

<details>
<summary>1327. List the Products Ordered in a Period</summary>

```sql
"SELECT p.product_name AS product_name, sum(o.unit) AS unit FROM Products p
JOIN Orders o USING (product_id)
WHERE YEAR(o.order_date)='2020' AND MONTH(o.order_date)='02'
GROUP BY p.product_id
HAVING SUM(o.unit)>=100"
```

</details>

<details>
<summary>1484. Group Sold Products By The Date</summary>

```sql
"SELECT sell_date,
COUNT(DISTINCT(product)) AS num_sold, 
GROUP_CONCAT(DISTINCT product ORDER BY product ASC SEPARATOR ',') AS products
FROM Activities
GROUP BY sell_date
ORDER BY sell_date ASC"
```

</details>

<details>
<summary>1517. Find Users With Valid E-Mails</summary>

```sql
"SELECT
user_id,
name,
mail
FROM Users
WHERE mail LIKE '[a-zA-Z]%@leetcode.com' AND LEFT(mail, LEN(mail) - 13) NOT LIKE '%[^0-9a-zA-Z_.-]%'"
```

</details>

<details>
<summary>1378. Replace Employee ID With The Unique Identifier</summary>

```sql
"SELECT eu.unique_id AS unique_id, e.name
FROM Employees e
LEFT JOIN EmployeeUNI eu USING(id)"
```

</details>

<details>
<summary>1527. Patients With a Condition</summary>

```sql
"SELECT *
FROM Patients
WHERE conditions LIKE '% DIAB1%' OR conditions LIKE 'DIAB1%'"
```

</details>

<details>
<summary>1581. Customer Who Visited but Did Not Make Any Transactions</summary>

```sql
"SELECT 
customer_id, 
COUNT(visit_id) AS count_no_trans 
FROM 
Visits 
WHERE 
visit_id NOT IN (
SELECT 
visit_id 
FROM 
Transactions
) 
GROUP BY 
customer_id"
```

</details>

<details>
<summary>1633. Percentage of Users Attended a Contest</summary>

```sql
"select contest_id , round (count(distinct user_id )*100/(select count( user_id )from Users ),2)as percentage 
from Register 
group by contest_id 
order by percentage desc,contest_id"
```

</details>

<details>
<summary>1661. Average Time of Process per Machine</summary>

```sql
"SELECT a.machine_id, 
ROUND(AVG(b.timestamp - a.timestamp), 3) AS processing_time
FROM Activity a, 
Activity b
WHERE 
a.machine_id = b.machine_id
AND 
a.process_id = b.process_id
AND 
a.activity_type = 'start'
AND 
b.activity_type = 'end'
GROUP BY machine_id"
```

</details>

<details>
<summary>1667. Fix Names in a Table</summary>

```sql
"SELECT Users.user_id , CONCAT(UPPER(SUBSTR(Users.name,1,1)),LOWER(SUBSTR(Users.name,2))) AS name 
FROM Users
ORDER BY
Users.user_id ASC"
```

</details>

<details>
<summary>1683. Invalid Tweets</summary>

```sql
"SELECT tweet_id
FROM Tweets
WHERE CHAR_LENGTH(content) > 15"
```

</details>

<details>
<summary>1729. Find Followers Count</summary>

```sql
"SELECT user_id, COUNT(user_id) AS followers_count
FROM followers
GROUP BY user_id
ORDER BY user_id ASC;"
```

</details>

<details>
<summary>1731. The Number of Employees Which Report to Each Employee</summary>

```sql
"select e2.employee_id, 
e2.name, 
COUNT(e1.employee_id) as reports_count, 
ROUND(AVG(e1.age)) as average_age
from employees e1 join employees e2
on e1.reports_to = e2.employee_id
group by employee_id
order by employee_id"
```

</details>

<details>
<summary>175. Combine Two Tables</summary>

```sql
"select FirstName, LastName, City, State
from Person left join Address
on Person.PersonId = Address.PersonId
;"
```

</details>

<details>
<summary>1757. Recyclable and Low Fat Products</summary>

```sql
"SELECT
product_id
FROM
Products
WHERE
low_fats = 'Y' AND recyclable = 'Y'"
```

</details>

<details>
<summary>1789. Primary Department for Each Employee</summary>

```sql
"SELECT DISTINCT employee_id, department_id
FROM Employee
WHERE employee_id IN (
SELECT employee_id
FROM Employee
GROUP BY employee_id
HAVING COUNT(*) = 1
)
OR primary_flag = 'Y'
ORDER BY employee_id;"
```

</details>

<details>
<summary>181. Employees Earning More Than Their Managers</summary>

```sql
"SELECT e2.name as Employee
FROM employee e1
INNER JOIN employee e2 ON e1.id = e2.managerID
WHERE
e1.salary < e2.salary"
```

</details>

<details>
<summary>182. Duplicate Emails</summary>

```sql
"SELECT email from Person
group by email
having count(email) > 1;"
```

</details>

<details>
<summary>183. Customers Who Never Order</summary>

```sql
"SELECT name as Customers
from Customers
where id not in (
select customerId
from Orders
);"
```

</details>

<details>
<summary>196. Delete Duplicate Emails</summary>

```sql
"delete p1 from person p1,person p2 
where p1.email=p2.email and p1.id>p2.id;"
```

</details>

<details>
<summary>197. Rising Temperature</summary>

```sql"SELECT 
w1.id
FROM 
Weather w1
JOIN 
Weather w2
ON 
DATEDIFF(w1.recordDate, w2.recordDate) = 1
WHERE 
w1.temperature > w2.temperature;"

```

</details>

<details>
<summary>1978. Employees Whose Manager Left the Company</summary>

```sql
"SELECT e1.employee_id
FROM Employees e1
LEFT JOIN Employees e2
ON e1.manager_id = e2.employee_id
WHERE e1.salary < 30000 AND e2.employee_id IS NULL AND e1.manager_id IS NOT NULL
ORDER BY employee_id;"
```

</details>

<details>
<summary>2356. Number of Unique Subjects Taught by Each Teacher</summary>

```sql
select teacher_id,count(distinct subject_id) as cnt from Teacher group by teacher_id
```

</details>

<details>
<summary>577. Employee Bonus</summary>

```sql
"SELECT
Employee.name, Bonus.bonus
FROM
Employee
LEFT JOIN
Bonus ON Employee.empid = Bonus.empid
WHERE
bonus < 1000 OR bonus IS NULL
;"
```

</details>

<details>
<summary>584. Find Customer Referee</summary>

```sql
"SELECT
name
FROM
Customer
WHERE 
IFNULL(referee_id,0) <> 2;"
```

</details>

<details>
<summary>595. Big Countries</summary>

```sql
"SELECT 
* 
FROM 
world 
WHERE 
area >= 3000000 
OR population >= 25000000"
```

</details>

<details>
<summary>596. Classes More Than 5 Students</summary>

```sql
"SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;"
```

</details>

<details>
<summary>610. Triangle Judgement</summary>

```sql
"select 
x,y,z,
case when (x+y) > z and (x+z) > y and (y+z) > x then 'Yes' else 'No' end as triangle
from Triangle"
```

</details>

<details>
<summary>619. Biggest Single Number</summary>

```sql
"SELECT MAX(num) AS num
FROM (
SELECT num
FROM MyNumbers
GROUP BY num
HAVING COUNT(num) = 1
) AS unique_numbers;"
```

</details>

<details>
<summary>620. Not Boring Movies</summary>

```sql
"select * from Cinema
where id % 2 = 1 and description != 'boring'
order by rating desc"
```

</details>

<details>
<summary>1045. Customers Who Bought All Products</summary>

```sql
"SELECT customer_id FROM Customer GROUP BY customer_id
HAVING COUNT(distinct product_key) = (SELECT COUNT(product_key) FROM Product)'"
```

</details>

<details>
<summary>1070. Product Sales Analysis III</summary>

```sql
"SELECT 
product_id, 
year AS first_year, 
quantity, 
price 
FROM 
Sales 
WHERE 
(product_id, year) IN (
SELECT 
product_id, 
MIN(year) AS year 
FROM 
Sales 
GROUP BY 
product_id
);"
```

</details>

<details>
<summary>1164. Product Price at a Given Date</summary>

```sql
"SELECT
product_id,
IFNULL (price, 10) AS price
FROM
(
SELECT DISTINCT
product_id
FROM
Products
) AS UniqueProducts
LEFT JOIN (
SELECT DISTINCT
product_id,
FIRST_VALUE (new_price) OVER (
PARTITION BY
product_id
ORDER BY
change_date DESC
) AS price
FROM
Products
WHERE
change_date <= '2019-08-16'
) AS LastChangedPrice USING (product_id);"
```

</details>

<details>
<summary>1174. Immediate Food Delivery II</summary>

```sql
"Select 
round(avg(order_date = customer_pref_delivery_date)*100, 2) as immediate_percentage
from Delivery
where (customer_id, order_date) in (
Select customer_id, min(order_date) 
from Delivery
group by customer_id
);"
```

</details>

<details>
<summary>1193. Monthly Transactions I</summary>

```sql
"SELECT 
LEFT(trans_date, 7) AS month, country, 
COUNT(id) AS trans_count, 
SUM(state = 'approved') AS approved_count, 
SUM(amount) AS trans_total_amount, 
SUM(CASE 
WHEN state = 'approved' THEN amount 
ELSE 0 
END) AS approved_total_amount
FROM Transactions
GROUP BY month, country"
```

</details>

<details>
<summary>1204. Last Person to Fit in the Bus</summary>

```sql
"SELECT 
q1.person_name
FROM Queue q1 JOIN Queue q2 ON q1.turn >= q2.turn
GROUP BY q1.turn
HAVING SUM(q2.weight) <= 1000
ORDER BY SUM(q2.weight) DESC
LIMIT 1"
```

</details>

<details>
<summary>1321. Restaurant Growth</summary>

```sql
"SELECT 
DISTINCT visited_on,
amount,
ROUND(amount/7, 2) AS average_amount
FROM 
(SELECT
visited_on,
SUM(amount) OVER (
ORDER BY visited_on 
RANGE BETWEEN INTERVAL 6 DAY PRECEDING AND CURRENT ROW
) AS amount,
 
MIN(visited_on) OVER() as firstDay
FROM Customer
) AS c
WHERE
visited_on >= firstDay + INTERVAL 6 DAY;"
```

</details>

<details>
<summary>1327. List the Products Ordered in a Period</summary>

```sql
"SELECT p.product_name AS product_name, sum(o.unit) AS unit FROM Products p
JOIN Orders o USING (product_id)
WHERE YEAR(o.order_date)='2020' AND MONTH(o.order_date)='02'
GROUP BY p.product_id
HAVING SUM(o.unit)>=100"
```

</details>

<details>
<summary>1341. Movie Rating</summary>

```sql
"(
SELECT u.name AS results
FROM MovieRating mr, Users u
WHERE mr.user_id = u.user_id
GROUP BY mr.user_id
ORDER BY COUNT(1) DESC, u.name
LIMIT 1
)
UNION ALL
(
SELECT m.title AS results
FROM MovieRating mr, Movies m 
WHERE mr.movie_id = m.movie_id AND mr.created_at LIKE '2020-02%'
GROUP BY mr.movie_id
ORDER BY AVG(rating) DESC, m.title
LIMIT 1
)"
```

</details>

<details>
<summary>176. Second Highest Salary</summary>

```sql
"SELECT DISTINCT MAX(salary) AS SecondHighestSalary
FROM Employee a
WHERE Salary< (SELECT MAX(salary) FROM Employee b WHERE b.salary > a.salary)"
```

</details>

<details>
<summary>178. Rank Scores</summary>

```sql
"SELECT S.Score, COUNT(S2.Score) AS Rank FROM Scores S,
(SELECT DISTINCT Score FROM Scores) S2
WHERE S.Score<=S2.Score
GROUP BY S.Id 
ORDER BY S.Score DESC;"
```

</details>

<details>
<summary>180. Consecutive Numbers</summary>

```sql
"SELECT DISTINCT
l1.Num AS ConsecutiveNums
FROM
Logs l1,
Logs l2,
Logs l3
WHERE
l1.Id = l2.Id - 1
AND l2.Id = l3.Id - 1
AND l1.Num = l2.Num
AND l2.Num = l3.Num
;"
```

</details>

<details>
<summary>184. Department Highest Salary</summary>

```sql
"SELECT Department.name AS Department ,Employee.name AS Employee, Employee.salary
FROM Department JOIN Employee ON Employee.departmentId=Department.id 
WHERE(departmentId, salary) IN
(SELECT departmentId,MAX(salary) FROM Employee GROUP BY departmentId) ;"
```

</details>

<details>
<summary>1907. Count Salary Categories</summary>

```sql
"SELECT 'Low Salary' as category, COUNT(account_id) as accounts_count
FROM Accounts
WHERE income<20000
UNION
SELECT 'Average Salary' as category, COUNT(*)
FROM Accounts
WHERE income>=20000 AND income<=50000
UNION
SELECT 'High Salary' as category, COUNT(*)
FROM Accounts
WHERE income>50000"
```

</details>

<details>
<summary>1934. Confirmation Rate</summary>

```sql

select s.user_id, round(avg(if(c.action=""confirmed"",1,0)),2) as confirmation_rate
from Signups as s left join Confirmations as c on s.user_id= c.user_id group by user_id;"
```

</details>

<details>
<summary>550. Game Play Analysis IV</summary>

```sql
"SELECT
ROUND(COUNT(DISTINCT player_id) / (SELECT COUNT(DISTINCT player_id) FROM Activity), 2) AS fraction
FROM
Activity
WHERE
(player_id, DATE_SUB(event_date, INTERVAL 1 DAY))
IN (
SELECT player_id, MIN(event_date) AS first_login FROM Activity GROUP BY player_id
)"
```

</details>

<details>
<summary>570. Managers with at Least 5 Direct Reports</summary>

```sql
"SELECT E1.name
FROM Employee E1
JOIN (
SELECT managerId, COUNT(*) AS directReports
FROM Employee
GROUP BY managerId
HAVING COUNT(*) >= 5
) E2 ON E1.id = E2.managerId;"
```

</details>

<details>
<summary>585. Investments in 2016</summary>

```sql
"SELECT ROUND(SUM(tiv_2016), 2) AS tiv_2016
FROM Insurance
WHERE tiv_2015 IN (
SELECT tiv_2015
FROM Insurance
GROUP BY tiv_2015
HAVING COUNT(*) > 1
)
AND (lat, lon) IN (
SELECT lat, lon
FROM Insurance
GROUP BY lat, lon
HAVING COUNT(*) = 1
)"
```

</details>

<details>
<summary>595. Big Countries</summary>

```sql
"SELECT 
* 
FROM 
world 
WHERE 
area >= 3000000 
OR population >= 25000000"
```
  
</details>

<details>
<summary>596. Classes More Than 5 Students</summary>

```sql
"SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;"
```

</details>

<details>
<summary>602. Friend Requests II: Who Has the Most Friends</summary>

```sql
"select requester_id as id,
(select count(*) from RequestAccepted
where id=requester_id or id=accepter_id) as num
from RequestAccepted
group by requester_id
order by num desc limit 1"
```

</details>

<details>
<summary>610. Triangle Judgement</summary>

```sql
"SELECT x,y,z,
case WHEN (x+y) > z AND (x+z) > y AND (y+z) > x THEN 'Yes' ELSE 'No' end AS triangle
FROM Triangle"
```

</details>

<details>
<summary>619. Biggest Single Number</summary>

```sql
"SELECT MAX(num) AS num
FROM (
SELECT num
FROM MyNumbers
GROUP BY num
HAVING COUNT(num) = 1
) AS unique_numbers;"
```

</details>

<details>
<summary>626. Exchange Seats</summary>

```sql
"SELECT ROW_NUMBER() OVER() id, student
FROM seat
ORDER BY IF(MOD(id, 2) = 0, id-1, id+1)"
```

</details>

<details>
<summary>262. Trips and Users</summary>

```sql
"SELECT 
request_at AS Day, 
ROUND(
SUM(status != 'completed') / COUNT(*), 
2
) AS 'Cancellation Rate' 
FROM 
Trips 
LEFT JOIN Users AS Clients ON Trips.client_id = Clients.users_id 
LEFT JOIN Users AS Drivers ON Trips.driver_id = Drivers.users_id 
WHERE 
Clients.banned = 'No'
AND Drivers.banned = 'No' 
AND request_at BETWEEN '2013-10-01' 
AND '2013-10-03' 
GROUP BY 
Day"
```

</details>

<details>
<summary>185. Department Top Three Salaries</summary>

```sql
"WITH employee_department AS
(
SELECT d.id, 
d.name AS Department,
salary AS Salary, 
e.name AS Employee, 
DENSE_RANK()OVER(PARTITION BY d.id ORDER BY salary DESC) AS rnk
FROM Department d
JOIN Employee e
ON d.id = e.departmentId
)
SELECT Department, Employee, Salary
FROM employee_department
WHERE rnk <= 3"
```

</details>
