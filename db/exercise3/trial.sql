-- collected and uncollected semester fees amount per semester
-- for each college under an university. Result should be filtered
-- based on given year.

SELECT semester_fee.semester, 
       SUM(IF(semester_fee.paid_status = 'paid', semester_fee.amount, 0)) Collected, 
       SUM(IF(semester_fee.paid_status = 'unpaid', semester_fee.amount, 0)) Uncollected, 
       semester_fee.paid_status, student.id, college.name college_name, university.university_name
  FROM exercise3.semester_fee
  LEFT JOIN exercise3.student 
    ON semester_fee.stud_id = student.id
  LEFT JOIN exercise3.college 
    ON college.id = student.college_id 
  LEFT JOIN exercise3.university
    ON university.univ_code = college.univ_code
 WHERE semester_fee.paid_year IN ('2019', '2018','2020')
 GROUP BY college.name;

-- Collected semester fees amount for each university for the given year
SELECT SUM(IF(semester_fee.paid_status = 'paid', semester_fee.amount, 0)) Collected, university.university_name
  FROM exercise3.semester_fee
   LEFT JOIN exercise3.student 
    ON semester_fee.stud_id = student.id
  LEFT JOIN exercise3.college 
    ON college.id = student.college_id 
  LEFT JOIN exercise3.university
    ON university.univ_code = college.univ_code
 WHERE semester_fee.paid_year IN ('2019', '2018','2020')
 GROUP BY university.university_name;



SELECT FIRST_VALUE(first_name) OVER (ORDER BY roll_no) student
FROM exercise1.student;

SELECT roll_no, department, 
    FIRST_VALUE(first_name) OVER (
        PARTITION BY department) student_name
FROM
    exercise1.student;

SELECT LAST_VALUE(first_name) OVER (ORDER BY roll_no) name
  FROM exercise1.student;




SELECT designation.name designation, designation.rank, college.name college, department.dept_name, university.university_name
  FROM exercise3.college_department
 CROSS JOIN exercise3.designation
 CROSS JOIN exercise3.employee
  LEFT JOIN exercise3.department 
    ON college_department.udept_code = department.dept_code 
  LEFT JOIN exercise3.college
    ON college_department.college_id = college.id
  LEFT JOIN exercise3.university 
    ON college.univ_code = university.univ_code
 WHERE employee.cdept_id = college_department.cdept_id 
   AND employee.desig_id = designation.id;
   
   
   