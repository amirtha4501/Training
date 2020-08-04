-- get student's teacher according to course 
SELECT roll_no, first_name, student.department, student.course_id, staff.staff_name
  FROM exercise1.student AS student
 CROSS JOIN exercise1.staff AS staff
 WHERE student.course_id = staff.course_id;

-- get student and faculty belong to same department
SELECT roll_no, first_name, student.department, staff.staff_name 
  FROM exercise1.student AS student
 INNER JOIN	exercise1.staff AS staff 
 ON student.department = staff.department;

-- get student and their opted courses
SELECT roll_no, first_name, course.course_name 
  FROM exercise1.student AS student
  LEFT JOIN exercise1.course AS course
  ON student.course_id = course.id;
    
-- get staff of student based on opted course
SELECT student.first_name, staff.staff_id, staff.staff_name
  FROM exercise1.staff AS staff
 RIGHT JOIN exercise1.student AS student
 ON student.course_id = staff.course_id;
    
-- get name of student, staff who belong to same department and opted same course
SELECT student.first_name, student.department, staff.staff_name, course.course_name
  FROM exercise1.student AS student
 INNER JOIN exercise1.staff AS staff 
 ON student.department = staff.department
        
 INNER JOIN exercise1.course AS course 
 ON student.course_id = course.id 
    AND student.course_id = staff.course_id;
        
-- get all student and staff belong to same institution with and without duplicates

SELECT student.first_name, student.age, student.department
  FROM exercise1.student
 UNION ALL
SELECT staff.staff_name, staff.age, staff.department
  FROM exercise1.staff;
        
SELECT student.first_name, student.age, student.department
  FROM exercise1.student
 UNION DISTINCT
SELECT staff.staff_name, staff.age, staff.department
  FROM exercise1.staff;        
  
-- create view
CREATE VIEW exercise1.student_course AS 
SELECT student.roll_no, student.first_name, course.course_name
  FROM exercise1.student AS student
  JOIN exercise1.course AS course
    ON student.course_id = course.id;

-- select values from view
SELECT * FROM exercise1.student_course;

-- drop view
DROP VIEW exercise1.student_course;    