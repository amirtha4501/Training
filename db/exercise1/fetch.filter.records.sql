-- fetch records

SELECT roll_no, first_name, department, email, dob, age, course_id
  FROM exercise1.student;
  
SELECT roll_no, first_name, department
  FROM exercise1.student;
  
-- get first and last records

SELECT first_name
  FROM exercise1.student LIMIT 1;                    

SELECT first_name
  FROM exercise1.student ORDER BY roll_no DESC LIMIT 1;                    

-- filter records - AND, OR, NOT, LIKE, IN, ANY, wildcards ( % _ )

SELECT roll_no, first_name, department, email, dob, age, course_id
  FROM exercise1.student
 WHERE first_name LIKE '%tha'
   AND NOT course_id = 1;
 
SELECT roll_no, first_name, department, email, dob, age, course_id
  FROM exercise1.student
 WHERE age = 18
    OR NOT department = 'bme';
  
SELECT roll_no, first_name, department, email, age
  FROM exercise1.student
 WHERE department IN ('computer science', 'mechanical')
    OR first_name LIKE '_mm_';
    
SELECT roll_no, first_name, department, age, course_id
  FROM exercise1.student
 WHERE department = ANY 
       (SELECT department 
          FROM exercise1.staff
		 WHERE NOT age = 25);

SELECT roll_no, first_name, department, age, course_id
  FROM exercise1.student
 WHERE department = ALL 
       (SELECT department 
          FROM exercise1.staff
		 WHERE department IN ('civil', 'bme', 'computer science'));
         