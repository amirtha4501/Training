-- add NOT NULL constraint
 ALTER TABLE exercise1.students
MODIFY email VARCHAR(30) NOT NULL;
     
-- add DEFAULT constraint to department column
 ALTER TABLE exercise1.students
MODIFY department VARCHAR(30) DEFAULT 'computer science';
     
-- add CHECK constraint to age column
 ALTER TABLE exercise1.students
   ADD CHECK (age >= 18);
  
-- add PRIMARY KEY constraint to roll_no column
 ALTER TABLE exercise1.students
   ADD PRIMARY KEY (roll_no);

-- drop PRIMARY KEY constraint to roll_no column
 ALTER TABLE exercise1.students
  DROP PRIMARY KEY;
       
-- add FOREIGN KEY constraint to course_id column
 ALTER TABLE exercise1.students
   ADD FOREIGN KEY (course_id) REFERENCES exercise1.courses(id);

-- create INDEX for email
CREATE INDEX email_index 
    ON exercise1.students(email);