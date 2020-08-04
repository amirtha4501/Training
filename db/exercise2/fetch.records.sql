-- get highest and least paid employee
SELECT e1.emp_id, e1.first_name, e1.annual_salary, e1.department_id
  FROM exercise2.employee e1
  JOIN (SELECT department_id, MAX(annual_salary) AS salary 
       FROM exercise2.employee
       GROUP BY department_id) e2
    ON e1.department_id = e2.department_id and e1.annual_salary = e2.salary 
 UNION 
SELECT e1.emp_id, e1.first_name, e1.annual_salary, e1.department_id 
  FROM exercise2.employee e1
  JOIN (SELECT department_id, MIN(annual_salary) AS salary 
  FROM exercise2.employee
       GROUP BY department_id) e2
    ON e1.department_id = e2.department_id and e1.annual_salary = e2.salary;

-- get minimum and maximum salary of each department

SELECT department_id, MAX(annual_salary) AS max_salary, MIN(annual_salary) AS min_salary
  FROM exercise2.employee 
 GROUP BY department_id;

SELECT department_id, MAX(annual_salary) AS salary 
  FROM exercise2.employee
 GROUP BY department_id
 UNION ALL
SELECT department_id, MIN(annual_salary) 
  FROM exercise2.employee 
 GROUP BY department_id;
