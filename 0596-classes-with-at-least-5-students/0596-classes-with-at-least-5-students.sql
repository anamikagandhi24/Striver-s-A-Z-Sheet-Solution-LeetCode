# Write your MySQL query statement below
SELECT class FROM (SELECT class, count(*)from Courses  group by class having count(*) >=5
)t;