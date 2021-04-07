# 175. Combine Two Tables (Easy)
Create table Person (PersonId int, FirstName varchar(255), LastName varchar(255));
Create table Address (AddressId int, PersonId int, City varchar(255), State varchar(255));
Truncate table Person;
insert into Person (PersonId, LastName, FirstName) values ('1', 'Wang', 'Allen');
Truncate table Address;
insert into Address (AddressId, PersonId, City, State) values ('1', '2', 'New York City', 'New York');

# 176. Second Highest Salary (Easy)
Create table If Not Exists Employee (Id int, Salary int);
Truncate table Employee;
insert into Employee (Id, Salary) values ('1', '100');
insert into Employee (Id, Salary) values ('2', '200');
insert into Employee (Id, Salary) values ('3', '300');

# 181. Employees Earning More Than Their Managers (Easy)
Create table If Not Exists Employee (Id int, Name varchar(255), Salary int, ManagerId int);
Truncate table Employee;
insert into Employee (Id, Name, Salary, ManagerId) values ('1', 'Joe', '70000', '3');
insert into Employee (Id, Name, Salary, ManagerId) values ('2', 'Henry', '80000', '4');
insert into Employee (Id, Name, Salary, ManagerId) values ('3', 'Sam', '60000', NULL);
insert into Employee (Id, Name, Salary, ManagerId) values ('4', 'Max', '90000', NULL);

# 627. Swap Salary (Easy)
create table if not exists salary(id int, name varchar(100), sex char(1), salary int);
Truncate table salary;
insert into salary (id, name, sex, salary) values ('1', 'A', 'm', '2500');
insert into salary (id, name, sex, salary) values ('2', 'B', 'f', '1500');
insert into salary (id, name, sex, salary) values ('3', 'C', 'm', '5500');
insert into salary (id, name, sex, salary) values ('4', 'D', 'f', '500');

# 196. Delete Duplicate Emails (Easy)
ALTER TABLE Person ADD Id INT, ADD Email VARCHAR(255);
Truncate table Person;
insert into Person (Id, Email) values ('1', 'john@example.com');
insert into Person (Id, Email) values ('2', 'bob@example.com');
insert into Person (Id, Email) values ('3', 'john@example.com');

# 610. Triangle Judgement (Easy)
Create table If Not Exists triangle (x int, y int, z int);
Truncate table triangle;
insert into triangle (x, y, z) values ('13', '15', '30');
insert into triangle (x, y, z) values ('10', '20', '15');

# 1179. Reformat Department Table (Easy)
Create table If Not Exists Department (id int, revenue int, month varchar(5));
Truncate table Department;
insert into Department (id, revenue, month) values ('1', '8000', 'Jan');
insert into Department (id, revenue, month) values ('2', '9000', 'Jan');
insert into Department (id, revenue, month) values ('3', '10000', 'Feb');
insert into Department (id, revenue, month) values ('1', '7000', 'Feb');
insert into Department (id, revenue, month) values ('1', '6000', 'Mar');

# 197. Rising Temperature (Easy)
Create table If Not Exists Weather (Id int, RecordDate date, Temperature int);
Truncate table Weather;
insert into Weather (Id, RecordDate, Temperature) values ('1', '2015-01-01', '10');
insert into Weather (Id, RecordDate, Temperature) values ('2', '2015-01-02', '25');
insert into Weather (Id, RecordDate, Temperature) values ('3', '2015-01-03', '20');
insert into Weather (Id, RecordDate, Temperature) values ('4', '2015-01-04', '30');

# 1517. Find Users With Valid E-Mails (Easy)
Create table If Not Exists Users (user_id int, name varchar(30), mail varchar(50));
Truncate table Users;
insert into Users (user_id, name, mail) values ('1', 'Winston', 'winston@leetcode.com');
insert into Users (user_id, name, mail) values ('2', 'Jonathan', 'jonathanisgreat');
insert into Users (user_id, name, mail) values ('3', 'Annabelle', 'bella-@leetcode.com');
insert into Users (user_id, name, mail) values ('4', 'Sally', 'sally.come@leetcode.com');
insert into Users (user_id, name, mail) values ('5', 'Marwan', 'quarz#2020@leetcode.com');
insert into Users (user_id, name, mail) values ('6', 'David', 'david69@gmail.com');
insert into Users (user_id, name, mail) values ('7', 'Shapiro', '.shapo@leetcode.com');