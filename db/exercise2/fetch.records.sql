-- ? get highest and least paid employee
SELECT e1.emp_id, e1.first_name, e1.annual_salary, e1.department_id
  FROM exercise2.employee e1
  JOIN (SELECT department_id, MAX(annual_salary) AS salary 
          FROM exercise2.employee
         GROUP BY department_id) e2
    ON e1.department_id = e2.department_id AND e1.annual_salary = e2.salary 
 UNION 
SELECT e1.emp_id, e1.first_name, e1.annual_salary, e1.department_id 
  FROM exercise2.employee e1
  JOIN (SELECT department_id, MIN(annual_salary) AS salary 
          FROM exercise2.employee
         GROUP BY department_id) e2
    ON e1.department_id = e2.department_id AND e1.annual_salary = e2.salary;

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


-- ? list staff from same area and same department

SELECT DISTINCT e2.emp_id, e2.first_name, e2.area, e2.department_id
  FROM exercise2.employee e1
 INNER JOIN exercise2.employee e2 
 ON e2.department_id = e1.department_id 
 WHERE e2.area = e1.area
 ORDER BY department_id;

SELECT e.emp_id, e.first_name, e.department_id, e.area 
  FROM exercise2.employee e
 WHERE e.emp_id NOT IN
       (SELECT e.emp_id 
          FROM exercise2.employee e 
         GROUP BY e.department_id, e.area
HAVING COUNT(e.emp_id) = 1
);

-- get fresher from employees
SELECT emp_id, first_name, dob 
  FROM exercise2.employee 
 WHERE department_id IS NULL;

-- get employee names and their respective department name
SELECT employee.emp_id, employee.first_name AS emp_name, department.department_name 
  FROM exercise2.employee AS employee, exercise2.department AS department 
 WHERE employee.department_id = department.id;
 
-- get employee having birthday on current day 
SELECT emp_id, first_name, dob 
  FROM exercise2.employee
 WHERE MONTH(dob) = MONTH(CURDATE()) 
   AND DAY(dob) = DAY(CURDATE());
