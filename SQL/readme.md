### Questions

<details>
<summary><b>What is the difference between DELETE and TRUNCATE?</b></summary>
<pre>
  "The delete statement removes single or multiple rows from an existing table depending on the specified condition.
DELETE statement is used to delete a row from a table.
 
The truncate command deletes the whole contents of an existing table without the table itself. It preserves the table structure or schema.
TRUNCATE statement is used to remove all the rows from a table.
"
</pre>
</details>

<details>
<summary><b>What are aggregate functions? Provide examples.</b></summary>
<pre>
  "Aggregate functions are
 SQL functions that perform a calculation on a set of values and return a single value. These functions are commonly used to summarize data, such as calculating totals, averages, counts, etc. Aggregate functions are often used with the GROUP BY clause in SQL to group rows that share a property.
ex--COUNT(),SUM()"
</pre>
</details>

<details>
<summary><b>How can you optimize an SQL query?</b></summary>
<pre>
  "Avoid SELECT * (Use Specific Columns)
Use Joins Instead of Subqueries
Use EXISTS Instead of IN for Subqueries
"
</pre>
</details>

<details>
<summary><b>What is a cursor in SQL?</b></summary>
<pre>
  "A cursor in SQL is a database object used to retrieve, manipulate, and navigate through a result set one row at a time. Cursors are particularly useful when you need to process individual rows returned by a query, especially in cases where a more procedural approach is required, like performing row-by-row operations.
"
</pre>
</details>

<details>
<summary><b>What is the difference between a primary key and a unique key?</b></summary>
<pre>
  "The primary key and unique key both are essential constraints of the SQL. The main difference among them is that the primary key identifies each record in the table. In contrast, the unique key prevents duplicate entries in a column except for a NULL value. The following comparison chart explains it more clearly:
 
Unique, can be null, table can have multiple unique atributes
"
</pre>
</details>

<details>
<summary><b>What is the primary use of Normalization?</b></summary>
<pre>
  "Normalization is mainly used to add, delete or modify a field that can be made in a single table. The primary use of Normalization is to remove redundancy and remove the insert, delete and update distractions. Normalization breaks the table into small partitions and then links them using different relationships to avoid the chances of redundancy.
"
</pre>
</details>

<details>
<summary><b>What are the disadvantages of not performing database Normalization?</b></summary>
<pre>
  "The occurrence of redundant terms in the database causes the waste of space in the disk.
 
Due to redundant terms, inconsistency may also occur. If any change is made in the data of one table but not made in the same data of another table, then inconsistency will occur. This inconsistency will lead to the maintenance problem and effects the ACID properties as well.
"
</pre>
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
<pre>
  "The ACID properties are meant for the transaction that goes through a different group of tasks. A transaction is a single logical order of data. It provides properties to maintain consistency before and after the transaction in a database. It also ensures that the data transactions are processed reliably in a database system.
 
The ACID property is an acronym for Atomicity, Consistency, Isolation, and Durability.
 
Atomicity: It ensures that all statements or operations within the transaction unit must be executed successfully. If one part of the transaction fails, the entire transaction fails, and the database state is left unchanged. Its main features are COMMIT, ROLLBACK, and AUTO-COMMIT.
 
Consistency: This property ensures that the data must meet all validation rules. In simple words, we can say that the database changes state only when a transaction will be committed successfully. It also protects data from crashes.
 
Isolation: This property guarantees that the concurrent property of execution in the transaction unit must be operated independently. It also ensures that statements are transparent to each other. The main goal of providing isolation is to control concurrency in a database.
 
Durability: This property guarantees that once a transaction has been committed, it persists permanently even if the system crashes, power loss, or failed.
"
</pre>
</details>

<details>
<summary><b>Explain ON DELETE CASCADE</b></summary>
<pre>
  "ON DELETE CASCADE is an option that you can set on a foreign key constraint in a relational database. It defines the behavior that should occur when a row in the parent table (the table containing the primary key) is deleted.
 
CREATE TABLE orders (
order_id INT PRIMARY KEY,
customer_id INT,
FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
ON DELETE CASCADE
);"
</pre>
</details>

<details>
<summary><b>Explain ON UPDATE CASCADE</b></summary>
<pre>
  ON UPDATE CASCADE is another option you can set on a foreign key constraint. It defines the behavior that should occur when a row in the parent table is updated
</pre>
</details>

