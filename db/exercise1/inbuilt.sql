SELECT NOW();

SELECT MIN(age) AS min_age, MAX(age) AS max_age 
  FROM exercise1.students;

SELECT SUM(score) AS overall_score, AVG(score) AS avg_score, COUNT(roll_no) AS avg_students
  FROM exercise1.students 
 WHERE department IN ('bme', 'civil');