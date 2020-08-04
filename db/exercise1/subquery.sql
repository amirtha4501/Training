-- get students who is eligible to attend courses
SELECT roll_no, first_name, department, course_id, score 
  FROM exercise1.student
 WHERE course_id IN
       (SELECT id 
          FROM exercise1.course 
         WHERE student.score >= course.min_score);
  
-- get students who didn't choose data science course
SELECT roll_no, first_name
  FROM exercise1.student 
 WHERE course_id IN
       (SELECT id 
          FROM exercise1.course 
         WHERE NOT course_name = 'data science');
  