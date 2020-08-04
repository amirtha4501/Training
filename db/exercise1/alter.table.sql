-- add new columns 
 ALTER TABLE exercise1.student 
   ADD COLUMN email     VARCHAR(30)
 , ADD COLUMN score     INT(2)
 , ADD COLUMN dob       VARCHAR(10)
 , ADD COLUMN age       INT(2)
 , ADD COLUMN score1    INT(3)
 , ADD COLUMN score2    INT(3)
 , ADD COLUMN course_id INT(2);
  
-- modify datatype of dob in students
 ALTER TABLE exercise1.student
MODIFY dob DATE; 

-- drop a column from student
 ALTER TABLE exercise1.student
  DROP COLUMN score2;

-- rename column in student
 ALTER TABLE exercise1.student
RENAME COLUMN score1 
    TO score; 

