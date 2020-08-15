-- 7. get employees and their lead

SELECT e1.emp_id
      ,e1.first_name emp_name
      ,e2.first_name lead_name
  FROM exercise2.employee e1
      ,exercise2.employee e2 
 WHERE e1.lead_id = e2.emp_id; 
 
SELECT e1.emp_id
      ,e1.first_name
      ,e2.first_name lead_name
  FROM exercise2.employee e1
  LEFT JOIN exercise2.employee e2 
    ON e1.lead_id = e2.emp_id; 