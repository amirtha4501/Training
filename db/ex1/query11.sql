-- 11. Write a query to get employee names and their respective department name

SELECT emp.first_name, emp.surname, dept.departments FROM db.employee emp, db.department dept where dept.department_id = emp.department_id;
