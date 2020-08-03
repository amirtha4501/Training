-- truncate records of students table
TRUNCATE TABLE exercise1.students;

-- delete records
DELETE FROM exercise1.students;

DELETE FROM exercise1.students
 WHERE first_name = 'amirtha'
   AND department = 'civil';
