select * from exercise2.employee;
       
SELECT e1.emp_id, e1.first_name, e1.area, e2.department_id
  FROM exercise2.employee e1
 INNER JOIN exercise2.employee e2 
 ON e2.area = e1.area
   AND e2.department_id = e1.department_id;

-- emp from same dept and same area
SELECT DISTINCT e2.emp_id, e2.first_name, e2.area, e2.department_id
  FROM exercise2.employee e1
 INNER JOIN exercise2.employee e2 
 ON e2.department_id = e1.department_id where e2.area = e1.area
 ORDER BY department_id;
    
-- get fresher from employees
SELECT emp_id, first_name, area 
  FROM exercise2.employee 
 WHERE department_id IS NULL;

-- get employee having birthday on current day 
SELECT emp_id, first_name, dob 
  FROM exercise2.employee
 WHERE MONTH(dob) = MONTH(CURDATE()) 
   AND DAY(dob) = DAY(CURDATE());
 
-- self-join
SELECT e1.emp_id, e1.first_name, e2.emp_id, e2.first_name, e1.area
  FROM exercise2.employee AS e1, exercise2.employee AS e2
 WHERE e1.emp_id <> e2.emp_id
   AND e1.area = e2.area;

 
 

  -- ? Find out the highest and least paid in all the department
  -- ? Prepare an example for self-join
  -- ? Write a query to list out employees from the same area, and from the same department



-- list emp from same area, same dept

select * employee where department_id not in (
  select department_id from employee group by department_id having count(id)=1 
  select area from employee group by area having count(id)=1
);

SELECT e.emp_id, e.first_name, e.department_id, e.area FROM exercise2.employee e
 WHERE e.emp_id NOT IN (
  SELECT e.emp_id FROM exercise2.employee e GROUP BY e.department_id, e.area
  HAVING COUNT(e.emp_id) = 1
);