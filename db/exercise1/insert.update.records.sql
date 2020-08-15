-- insert records into tables

INSERT INTO exercise1.student (roll_no, first_name, last_name, department, email, dob, age, course_id, score)
VALUES (1, 'ammu', 'easwaran', 'mechanical', 'ammu@gmail.com', '2001-05-04', 19, 2, 99);

INSERT INTO exercise1.student (roll_no, first_name, last_name, email, dob, age, course_id, score)
VALUES (2, 'amirtha', 'easwaran', 'amirtha@gmail.com', '2001-05-04', 19, 2, 85);

INSERT INTO exercise1.student (roll_no, first_name, department, email, dob, age, course_id, score)
VALUES (3, 'savitha', 'bme', 'savi@gmail.com', '2001-05-04', 19, 2, 100);

INSERT INTO exercise1.student (roll_no, first_name, department, email, dob, age, course_id, score)
VALUES (4, 'savitha', 'bme', 'savi123@gmail.com', '2001-05-04', 19, 1, 90);

INSERT INTO exercise1.student (roll_no, first_name, department, email, dob, age, course_id, score)
VALUES (5, 'kavitha', 'bme', 'kavi@gmail.com', '2001-05-04', 21, 3, 60);

INSERT INTO exercise1.course (id, course_name, min_score)
VALUES (1, 'data science', 85)
	   ,(2, 'artificial intelligence', 75)
      ,(3, 'building architecture', 50)
      ,(4, 'networking', 90);
       
-- update records

UPDATE exercise1.student
   SET age = 18;
   
UPDATE exercise1.student
   SET department = 'civil'
      ,age = 20
 WHERE department = 'mechanical';
 