# Write your MySQL query statement below
SELECT employee_id, department_id from Employee where primary_flag='Y'
OR employee_id IN (
    Select employee_id 
    from Employee 
    GROUP BY employee_id 
    Having count(*)=1
);