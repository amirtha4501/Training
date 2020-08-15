SELECT NOW();

SELECT MIN(age) min_age
      ,MAX(age) max_age 
  FROM exercise1.student;

SELECT SUM(score) overall_score
      ,AVG(score) avg_score
      ,COUNT(roll_no) avg_student
  FROM exercise1.student 
 WHERE department IN ('bme', 'civil');