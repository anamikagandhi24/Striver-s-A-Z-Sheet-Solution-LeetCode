# Write your MySQL query statement below
SELECT Register.contest_id, ROUND(COUNT(Register.user_id)/(SELECT COUNT(*) FROM Users)*100,2) AS percentage
FROM Register
LEFT JOIN Users
ON Users.user_id=Register.user_id
GROUP BY contest_id
ORDER BY percentage desc, contest_id asc;
