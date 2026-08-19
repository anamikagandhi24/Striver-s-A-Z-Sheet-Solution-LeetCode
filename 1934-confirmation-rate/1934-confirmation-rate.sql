# Write your MySQL query statement below
SELECT Signups.user_id,
CASE
when Count(Confirmations.action)=0 THEN 0
ELSE ROUND((SUM(CASE WHEN action='confirmed'THEN 1 ELSE 0 END)/COUNT(Confirmations.action)),2) END
 AS confirmation_rate
FROM Signups 
LEFT JOIN Confirmations
ON Signups.user_id=Confirmations.user_id
GROUP BY Signups.user_id
ORDER BY confirmation_rate;