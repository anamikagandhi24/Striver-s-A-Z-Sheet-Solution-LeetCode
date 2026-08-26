# Write your MySQL query statement below
SELECT ROUND(SUM(case when a.event_date=b.first_order_date+ INTERVAL 1 DAY then 1 else 0 end)/count(DISTINCT a.player_id),2) as fraction 
from Activity a
JOIN
(SELECT player_id, MIN(event_date)AS first_order_date from Activity GROUP BY player_id) b
ON a.player_id=b.player_id;