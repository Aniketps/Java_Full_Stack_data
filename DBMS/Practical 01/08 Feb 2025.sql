/*
Q1. Create Table name as Player with column id,name ,run and age and perform following operation on table
Add new column address using alter command 
Change run column name to  total run
*/
use aniket;
create table player(id int(3), name varchar(25), run int(3), age int(3));
alter table player add column address varchar(25);
alter table player rename column run to total_run;
desc player;

-- Q2. Insert 10 records in the Player table.
insert into player values(1, "Aniket", 95, 21, "Wagholi");
insert into player values(2, "Rohit", 80, 33, "Pune");
insert into player values(3, "Kishor", 100, 22, "Ganesh Nagar");
insert into player values(4, "Kali", 81, 40, "Kashi");
insert into player values(5, "Hari", 103, 21, "Beed");
insert into player values(6, "Rampal", 101, 33, "Haripur"), (7, "Mali", 20, 20, "Khanpur"), (8, "Ram", 75, 31, "Shikrapur"), (9, "Shyam", 150, 55, "Nagar"), 
(10, "Ramesh", 40, 35, "Manipur");

-- Q3. Select all records of player 
select * from player;

-- Q4. Delete player whose id is 1
delete from player where id=1;
select * from player;

-- Q5. Update the player run  40000 whose id is 2
update player set total_run=40000 where id = 2;
select * from player;

-- Q6. fetch player whose run is 40000, 40,100,101
select * from player where total_run in(40000,40,100,101);

-- Q7. Fetch max run from player table
select max(total_run) as "max runs" from player;

-- Q8. fetch min run from player table
select min(total_run) as "min run" from player;

-- Q9. find the average run of the player table.
select avg(total_run) as "Avarage Runs" from player;

-- Q10. find the sum of all player run
select sum(total_run) as "Total runs" from player;

-- Q11. count total number of player from table
select count(*) as "Total Player Count" from player;

-- Q12. WA SQL query fetch player whose run is not 5000
select * from player where not total_run=5000;
-- OR
select * from player where total_run!=5000;
-- OR
select * from player where total_run<>5000;

-- Q13. WA SQL Query to fetch player whose run is 101 and name is not abc
select * from player where total_run=101 and not name="abc";
-- OR
select * from player where total_run=101 && not name="abc";

-- Q14 drop column address from player
alter table player drop column address;
desc player;

-- Q15. drop table player from database
drop table player;
show tables;


-- Personal Practice on extra Q
-- Add a new column team (VARCHAR) and ensure NULL values are not allowed.
alter table player add team varchar(25) not null;
desc player;

-- Change total run to only allow values greater than 0.
alter table player add constraint check (total_run>0);
-- one more
alter table player add constraint check_age check (age>18);

-- Ensure that name is always unique.
alter table player modify name varchar(25) unique;

-- Add a constraint to make sure age cannot be more than 45.
alter table player drop constraint check_age;
alter table player add constraint check_age check (age between 55 and 18);

-- Insert 15 new players, ensuring at least 3 have the same team.

-- Try inserting a player with age = 50. What happens? Fix it.

-- Try inserting a duplicate name. What error do you get?

-- Fetch players whose age is between 20 and 30 and have more than 10,000 runs.

-- Retrieve players who belong to a team but have scored less than 5,000 runs.

-- Fetch the second highest run scorer (without using LIMIT).

-- Find players whose names start and end with a vowel.