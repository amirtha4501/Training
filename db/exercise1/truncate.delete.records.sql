-- truncate records of students table
TRUNCATE TABLE exercise1.student;

-- delete records with and without where

DELETE FROM exercise1.student
 WHERE first_name = 'amirtha'
   AND department = 'civil';

DELETE FROM exercise1.student;