# Write your MySQL query statement below
SELECT Prices.product_id, COALESCE (ROUND(SUM(UnitsSold.units*Prices.price)/SUM(units),2),0) AS average_price
FROM Prices 
LEFT JOIN UnitsSold
ON Prices.product_id=UnitsSold.product_id
AND purchase_date>=start_date AND purchase_date<=end_date
GROUP BY product_id;