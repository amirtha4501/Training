-- 1. college details which are having IT / CSC departments across all the universities

-- 1a
SELECT c.code, c.name college_name, u.university_name, c.city, c.state, c.year_opened, d.dept_name, e.name hod
  FROM exercise3.college c 
  LEFT JOIN exercise3.university u
  ON u.univ_code = c.univ_code
  LEFT JOIN exercise3.department d 
  ON d.dept_code IN 
       (SELECT cd.udept_code 
          FROM exercise3.college_department cd 
         WHERE cd.college_id = c.id)
  LEFT JOIN exercise3.employee e
  ON e.college_id = c.id
       AND e.desig_id IN 
       (SELECT des.id
          FROM exercise3.designation des
         WHERE des.name = 'hod')
 WHERE d.dept_name IN ('cse', 'it');
 
-- 1b
SELECT c.code, c.name college_name, u.university_name, c.city, c.state, c.year_opened, dept.dept_name, e.name hod
  FROM exercise3.employee e
  LEFT JOIN exercise3.designation des
  ON e.desig_id = des.id
  LEFT JOIN exercise3.college_department cd
  ON e.cdept_id = cd.cdept_id
  LEFT JOIN exercise3.department dept 
  ON cd.udept_code = dept.dept_code
  LEFT JOIN exercise3.college c 
  ON cd.college_id = c.id
  LEFT JOIN exercise3.university u
  ON c.univ_code = u.univ_code 
 WHERE des.name = 'hod' 
   AND dept.dept_name IN ('cse', 'it');


-- 2. final year students details who are studying under a particular university and selected cities alone
SELECT s.roll_number, s.name, s.gender, s.dob, s.email, s.phone, s.address, c.name college_name, d.dept_name department_name
  FROM exercise3.student s 
  LEFT JOIN exercise3.college c 
  ON s.college_id = c.id
  LEFT JOIN exercise3.department d 
  ON dept_code IN 
       (SELECT cd.udept_code 
          FROM exercise3.college_department cd 
         WHERE s.cdept_id = cd.cdept_id) 
  LEFT JOIN exercise3.university u 
  ON c.univ_code = u.univ_code 
 WHERE academic_year = YEAR(NOW()) - 3 
   AND c.city IN ('chennai','coimbatore') 
   AND u.university_name = ('anna university');

-- 3. students details who are studying under a particular university and selected cities
SELECT s.roll_number, s.name, s.gender, s.dob, s.email, s.phone, s.address, c.name college_name, d.dept_name department_name, e.name hod_name
  FROM exercise3.student s
  LEFT JOIN exercise3.college c
  ON c.id = s.college_id
  LEFT JOIN exercise3.department d 
  ON d.dept_code IN 
       (SELECT cd.udept_code 
          FROM exercise3.college_department cd 
         WHERE cd.college_id = c.id)
  LEFT JOIN exercise3.employee e
  ON e.college_id = c.id
       AND e.desig_id IN 
       (SELECT des.id
          FROM exercise3.designation des
         WHERE des.name = 'hod')
  LEFT JOIN exercise3.university u 
  ON c.univ_code = u.univ_code 
 WHERE c.city IN ('chennai','coimbatore') 
   AND u.university_name = ('anna university') LIMIT 20;
 
-- 4. employee details sorted by rank and college_name
SELECT e.id, e.name, e.dob, e.email, e.phone, c.name college_name, c.city college_location, d.dept_name department_name, des.rank
  FROM exercise3.employee e
  LEFT JOIN exercise3.college c 
  ON e.college_id = c.id
  LEFT JOIN exercise3.university u 
  ON c.univ_code = u.univ_code 
  LEFT JOIN exercise3.designation des
  ON e.desig_id = des.id
  LEFT JOIN exercise3.department d 
  ON dept_code IN 
       (SELECT cd.udept_code 
          FROM exercise3.college_department cd 
         WHERE e.cdept_id = cd.cdept_id) 
 WHERE c.city IN ('chennai','coimbatore') 
   AND u.university_name = ('anna university') 
 ORDER BY c.name, des.rank;
 
-- 5. students details along with their GRADE,CREDIT, etc., with pagination
SELECT s.id, s.roll_number, s.name, s.gender, s.dob, s.email, s.phone, s.address, c.name college_name, u.university_name, sr.grade, sr.credits, sr.semester,
       CASE WHEN grade='a+' THEN 10 / credits
            WHEN grade='a' THEN 9 / credits
            WHEN grade='b+' THEN 8 / credits
            WHEN grade='b' THEN 7 / credits
            WHEN grade='c' THEN 6 / credits
            WHEN grade='f' THEN 0 / credits
       END gpa
  FROM exercise3.student s 
  LEFT JOIN exercise3.college c 
    ON s.college_id = c.id
  LEFT JOIN exercise3.university u 
    ON c.univ_code = u.univ_code
  LEFT JOIN exercise3.semester_result sr
    ON s.id = sr.stud_id 
 ORDER BY c.name, sr.semester
 LIMIT 10 OFFSET 10;

-- 8. employee vacancy position in all the departments from all the colleges 
SELECT des.name designation, des.rank, c.name college, dept.dept_name, u.university_name 
  FROM exercise3.college_department cd
 CROSS JOIN exercise3.designation des
 CROSS JOIN exercise3.employee e
  LEFT JOIN exercise3.department dept 
  ON cd.udept_code = dept.dept_code 
  LEFT JOIN exercise3.college c 
  ON cd.college_id = c.id
  LEFT JOIN exercise3.university u 
  ON c.univ_code = u.univ_code
 WHERE e.cdept_id = cd.cdept_id 
   AND e.desig_id = des.id;
 
-- 9. 
SELECT sf.semester, SUM(amount) collected_amount
  FROM exercise3.semester_fee sf
 WHERE paid_status = 'paid' 
 GROUP BY semester;

-- 10.  shows students details who scored above specified gpa

-- 10a
SELECT s.roll_number, s.name, s.dob, s.gender, s.email, s.phone, s.address, s.academic_year, 
       CASE WHEN grade='a+' THEN 10 / credits
            WHEN grade='a' THEN 9 / credits
            WHEN grade='b+' THEN 8 / credits
            WHEN grade='b' THEN 7 / credits
            WHEN grade='c' THEN 6 / credits
            WHEN grade='f' THEN 0 / credits
        END gpa
  FROM exercise3.student s
 INNER JOIN exercise3.semester_result sr
 ON sr.stud_id = s.id
 WHERE sr.semester = 4
   AND CASE WHEN grade='a+' THEN 10 / credits
            WHEN grade='a' THEN 9 / credits
            WHEN grade='b+' THEN 8 / credits
            WHEN grade='b' THEN 7 / credits
            WHEN grade='c' THEN 6 / credits
            WHEN grade='f' THEN 0 / credits
       END > 8;
       
-- 10b
SELECT s.roll_number, s.name, s.dob, s.gender, s.email, s.phone, s.address, s.academic_year, 
       CASE WHEN grade='a+' THEN 10 / credits
            WHEN grade='a' THEN 9 / credits
            WHEN grade='b+' THEN 8 / credits
            WHEN grade='b' THEN 7 / credits
            WHEN grade='c' THEN 6 / credits
            WHEN grade='f' THEN 0 / credits
        END gpa
  FROM exercise3.student s
 INNER JOIN exercise3.semester_result sr
 ON sr.stud_id = s.id
 WHERE sr.semester = 4
   AND CASE WHEN grade='a+' THEN 10 / credits
            WHEN grade='a' THEN 9 / credits
            WHEN grade='b+' THEN 8 / credits
            WHEN grade='b' THEN 7 / credits
            WHEN grade='c' THEN 6 / credits
            WHEN grade='f' THEN 0 / credits
       END > 5;