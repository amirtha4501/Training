-- 3. make emp_id as primary key
 ALTER TABLE exercise2.employee 
   ADD PRIMARY KEY (emp_id);
  
-- 4. increment 10% of every employee salary
UPDATE exercise2.employee 
   SET annual_salary = annual_salary + (annual_salary * 0.1);
   
-- add area column
 ALTER TABLE exercise2.employee
   ADD COLUMN area INT;

-- add lead column
 ALTER TABLE exercise2.employee
   ADD COLUMN lead_id INT;
