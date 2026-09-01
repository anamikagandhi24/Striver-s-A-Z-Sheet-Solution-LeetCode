# Write your MySQL query statement below
SELECT a.product_id, first_year, quantity, price from (SELECT product_id, MIN(year) AS first_year
FROM Sales
GROUP BY product_id)a
JOIN Sales b
on a.product_id=b.product_id
and a.first_year=b.year;