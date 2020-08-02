-- add new columns 
 ALTER TABLE exercise1.students 
   ADD COLUMN email     VARCHAR(30)
 , ADD COLUMN score     INT(2)
 , ADD COLUMN dob       VARCHAR(10)
 , ADD COLUMN age       INT(2)
 , ADD COLUMN course_id INT(2);
  
-- modify datatype of dob in students
 ALTER TABLE exercise1.students
MODIFY dob DATE; 

-- drop a column from students
 ALTER TABLE exercise1.students
  DROP COLUMN cgpa;

-- rename column in students
 ALTER TABLE exercise1.students
RENAME COLUMN score 
    TO cgpa; 

