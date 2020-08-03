select roll_no, first_name, department, score from exercise1.students
  where course_id in (select roll_no from exercise1.courses where students.score > course_id.min_score);
  

  
  
select * from exercise1.courses;
select * from exercise1.students;