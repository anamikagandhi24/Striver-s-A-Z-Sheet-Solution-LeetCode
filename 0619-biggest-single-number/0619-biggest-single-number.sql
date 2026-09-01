# Write your MySQL query statement below
select MAX(single) as num from (select num as single from MyNumbers
group by num
having count(num)=1 )t;