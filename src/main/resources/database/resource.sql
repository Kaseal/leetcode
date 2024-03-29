# 175. Combine Two Tables (Easy)
SELECT FirstName, LastName, City, State
FROM Person p
	     LEFT JOIN Address a
	               ON p.PersonId = a.PersonId;

# 176. Second Highest Salary (Easy)
SELECT MAX(e.Salary) AS SecondHighestSalary
FROM Employee e
WHERE e.Salary < (SELECT MAX(Salary) FROM Employee);

SELECT IFNULL((SELECT DISTINCT Salary
               FROM Employee
               ORDER BY Salary DESC
               LIMIT 1 OFFSET 1), NULL) AS SecondHighestSalary;

# 181. Employees Earning More Than Their Managers (Easy)
SELECT e.Name AS Employee
FROM Employee e
WHERE e.ManagerId IS NOT NULL
  AND e.Salary > (SELECT Salary FROM Employee WHERE e.ManagerId = Id);

SELECT e1.Name AS Employee
FROM Employee e1,
     Employee e2
WHERE e1.ManagerId = e2.Id
  AND e1.Salary > e2.Salary;

# 627. Swap Salary (Easy)
UPDATE salary
SET sex = CASE
	          WHEN sex = 'f' THEN 'm'
	          WHEN sex = 'm' THEN 'f'
	END;

UPDATE salary
SET sex = IF(sex = 'f', 'm', 'f');

# 196. Delete Duplicate Emails (Easy)
DELETE
FROM Person p
WHERE p.Id NOT IN (SELECT * FROM (SELECT MIN(Id) FROM Person GROUP BY Email) AS ids);

DELETE p1
FROM Person p1,
     Person p2
WHERE p1.Email = p2.Email
  AND p1.Id > p2.Id;

# 610. Triangle Judgement (Easy)
SELECT x,
       y,
       z,
       CASE
	       WHEN x + y > z AND x + z > y AND y + z > x THEN 'Yes'
	       ELSE 'No'
	       END AS triangle
FROM triangle;

SELECT x,
       y,
       z,
       IF(x + y > z AND x + z > y AND y + z > x, 'Yes', 'No') AS triangle
FROM triangle;

# 1179. Reformat Department Table (Easy)
SELECT id,
       SUM(IF(month = 'Jan', revenue, NULL)) AS Jan_Revenue,
       SUM(IF(month = 'Feb', revenue, NULL)) AS Feb_Revenue,
       SUM(IF(month = 'Mar', revenue, NULL)) AS Mar_Revenue,
       SUM(IF(month = 'Apr', revenue, NULL)) AS Apr_Revenue,
       SUM(IF(month = 'May', revenue, NULL)) AS May_Revenue,
       SUM(IF(month = 'Jun', revenue, NULL)) AS Jun_Revenue,
       SUM(IF(month = 'Jul', revenue, NULL)) AS Jul_Revenue,
       SUM(IF(month = 'Aug', revenue, NULL)) AS Aug_Revenue,
       SUM(IF(month = 'Sep', revenue, NULL)) AS Sep_Revenue,
       SUM(IF(month = 'Oct', revenue, NULL)) AS Oct_Revenue,
       SUM(IF(month = 'Nov', revenue, NULL)) AS Nov_Revenue,
       SUM(IF(month = 'Dec', revenue, NULL)) AS Dec_Revenue
FROM Department
GROUP BY id;

SELECT id,
       MAX(CASE WHEN month = 'Jan' THEN revenue END) AS Jan_Revenue,
       MAX(CASE WHEN month = 'Feb' THEN revenue END) AS Feb_Revenue,
       MAX(CASE WHEN month = 'Mar' THEN revenue END) AS Mar_Revenue,
       MAX(CASE WHEN month = 'Apr' THEN revenue END) AS Apr_Revenue,
       MAX(CASE WHEN month = 'May' THEN revenue END) AS May_Revenue,
       MAX(CASE WHEN month = 'Jun' THEN revenue END) AS Jun_Revenue,
       MAX(CASE WHEN month = 'Jul' THEN revenue END) AS Jul_Revenue,
       MAX(CASE WHEN month = 'Aug' THEN revenue END) AS Aug_Revenue,
       MAX(CASE WHEN month = 'Sep' THEN revenue END) AS Sep_Revenue,
       MAX(CASE WHEN month = 'Oct' THEN revenue END) AS Oct_Revenue,
       MAX(CASE WHEN month = 'Nov' THEN revenue END) AS Nov_Revenue,
       MAX(CASE WHEN month = 'Dec' THEN revenue END) AS Dec_Revenue
FROM Department
GROUP BY id;

# 197. Rising Temperature (Easy)
SELECT w1.id
FROM Weather w1,
     Weather w2
WHERE w1.Temperature > w2.Temperature
  AND w1.RecordDate = w2.RecordDate + INTERVAL 1 DAY
ORDER BY w1.RecordDate;

SELECT w1.id
FROM Weather w1
	     JOIN Weather w2 ON DATEDIFF(w1.RecordDate, w2.RecordDate) = 1
WHERE w1.Temperature > w2.Temperature;

# 1517. Find Users With Valid E-Mails (Easy)
SELECT *
FROM Users
WHERE mail REGEXP '^[a-zA-Z]+[a-zA-Z0-9.\\-_]*@leetcode.com';

# 183. Customers Who Never Order (Easy)
SELECT c.Name AS Customers
FROM Customers AS c
WHERE c.id NOT IN (SELECT CustomerId FROM Orders);

SELECT c.Name AS Customers
FROM Customers AS c
	     LEFT JOIN Orders o ON c.Id = o.CustomerId
WHERE o.id IS NULL;

# 182. Duplicate Emails (Easy)
SELECT DISTINCT p1.Email
FROM Person p1,
     Person p2
WHERE p1.Email = p2.Email
  AND p1.id > p2.Id;

SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(Email) > 1;

# 1757. Recyclable and Low Fat Products (Easy)
SELECT product_id
FROM Products
WHERE low_fats = 'Y'
  AND recyclable = 'Y';

# 597. Friend Requests I: Overall Acceptance Rate (Easy)
SELECT IFNULL(ROUND((SELECT COUNT(DISTINCT ra.requester_id, ra.accepter_id) FROM RequestAccepted ra) /
                    (SELECT COUNT(DISTINCT fr.sender_id, fr.send_to_id) FROM FriendRequest fr), 2), 0) AS accept_rate;

# 577. Employee Bonus
SELECT e.Name name, b.Bonus bonus
FROM Employee e
	     LEFT JOIN Bonus b ON e.EmpId = b.EmpId
WHERE b.Bonus IS NULL
   OR b.Bonus < 1000;

# 1141. User Activity for the Past 30 Days I (Easy)
SELECT activity_date day, COUNT(DISTINCT user_id) active_users
FROM Activity a
WHERE activity_date > DATE_SUB('2019-07-27', INTERVAL 30 DAY)
GROUP BY day;

# 584. Find Customer Referee (Easy)
SELECT name
FROM customer
WHERE referee_id IS NULL
   OR referee_id <> 2;

# 1729. Find Followers Count (Easy)
SELECT user_id, COUNT(user_id) followers_count
FROM Followers
GROUP BY user_id
ORDER BY user_id;

# 1484. Group Sold Products By The Date (Easy)
SELECT sell_date, COUNT(DISTINCT product) num_sold, GROUP_CONCAT(DISTINCT product SEPARATOR ',') products
FROM Activities
GROUP BY sell_date
ORDER BY sell_date;

# 1113. Reported Posts (Easy)
SELECT extra report_reason, COUNT(DISTINCT post_id) report_count
FROM Actions
WHERE action_date = DATE_SUB('2019-07-05', INTERVAL 1 DAY)
  AND action = 'report'
  AND extra IS NOT NULL
GROUP BY extra;

# 574. Winning Candidate (Medium)
SELECT c.Name
FROM Candidate c
	     LEFT JOIN vote v ON c.id = v.CandidateId
GROUP BY v.CandidateId
ORDER BY COUNT(v.CandidateId) DESC
LIMIT 1;

# 178. Rank Scores (Medium)
SELECT Score, (SELECT COUNT(DISTINCT Score) FROM scores s2 WHERE s1.Score <= s2.Score) 'Rank'
FROM Scores s1
ORDER BY Score DESC;

SELECT Score, `Rank`
FROM (SELECT score,
             CAST(IF(@prevValue > score, @rowNum := @rowNum + 1, @rowNum) AS UNSIGNED) 'Rank',
             @prevValue := score
      FROM Scores,
           (SELECT @rowNum := 1, @prevValue := 0) s
      ORDER BY Score DESC) s;

# 1098. Unpopular Books (Medium)
SELECT b.book_id, b.name
FROM Orders o
	     RIGHT JOIN Books b ON o.book_id = b.book_id
WHERE b.available_from <= DATE_SUB('2019-06-23', INTERVAL 1 MONTH)
GROUP BY 1
HAVING SUM(CASE WHEN o.dispatch_date > DATE_SUB('2019-06-23', INTERVAL 1 YEAR) THEN o.quantity ELSE 0 END) < 10;