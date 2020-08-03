-- fetch records

SELECT roll_no, first_name, department, email, dob, age, course_id
  FROM exercise1.students;
  
SELECT roll_no, first_name, department
  FROM exercise1.students;
  
SELECT first_name
  FROM exercise1.students LIMIT 1;                    

SELECT first_name
  FROM exercise1.students ORDER BY roll_no DESC LIMIT 1;                    

-- filter records - AND, OR, NOT, LIKE, IN, ANY, wildcards ( % _ )

SELECT roll_no, first_name, department, email, dob, age, course_id
  FROM exercise1.students
 WHERE first_name LIKE '%tha'
   AND NOT course_id = 1;
 
SELECT roll_no, first_name, department, email, dob, age, course_id
  FROM exercise1.students
 WHERE age = 18
    OR NOT department = 'bme';
  
SELECT roll_no, first_name, department, email, age
  FROM exercise1.students
 WHERE department IN ('computer science', 'mechanical')
    OR first_name LIKE '_mm_';
    
SELECT roll_no, first_name, department, age, course_id
  FROM exercise1.students
 WHERE department = ANY 
       (SELECT department 
          FROM exercise1.staff
		 WHERE NOT age = 25);

SELECT roll_no, first_name, department, age, course_id
  FROM exercise1.students
 WHERE department = ALL 
       (SELECT department 
          FROM exercise1.staff
		 WHERE department IN ('civil', 'bme', 'computer science'));
         