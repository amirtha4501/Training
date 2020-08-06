-- 1. college details which are having IT / CSC departments across all the universities
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
 WHERE academic_year = YEAR(NOW()) - 3 AND c.city IN ('chennai','coimbatore') AND u.university_name = ('anna university');

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
 WHERE c.city IN ('chennai','coimbatore') AND u.university_name = ('anna university') LIMIT 20;
 
-- 4. employee details sorted by rank and college_name
SELECT e.id, e.name, e.dob, e.email, e.phone, c.name college_name, c.city college_location, d.dept_name department_name, des.rank
  FROM exercise3.employee AS e
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
SELECT s.id, s.roll_number, s.name, s.gender, s.dob, s.email, s.phone, s.address, c.name college_name, u.university_name, sr.grade, sr.credits, sr.semester
  FROM exercise3.student s 
  LEFT JOIN exercise3.college c 
    ON s.college_id = c.id
  LEFT JOIN exercise3.university u 
    ON c.univ_code = u.univ_code
  LEFT JOIN exercise3.semester_result sr
    ON s.id = sr.stud_id 
 ORDER BY c.name, sr.semester
 LIMIT 10 OFFSET 10;
