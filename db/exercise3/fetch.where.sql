-- 1. college details which are having IT / CSC departments across all the universities
SELECT code, name college_name, (SELECT university_name 
                                   FROM exercise3.university u 
                                  WHERE u.univ_code = c.univ_code) university_name
       , city, state, year_opened 
  FROM exercise3.college c 
 WHERE id IN ((SELECT college_id 
                 FROM exercise3.college_department 
                WHERE udept_code IN (SELECT dept_code 
                                       FROM exercise3.department 
                                      WHERE dept_name IN ('cse', 'it'))));

-- 2. final year students details who are studying under a particular university and selected cities alone

SELECT stu.roll_number, stu.name, stu.gender, stu.dob, stu.email, stu.phone, stu.address,
       (SELECT name 
          FROM exercise3.college clg
         WHERE clg.id = stu.college_id) college_name, 
         
       (SELECT dept_name 
          FROM exercise3.department 
         WHERE dept_code IN 
               (SELECT cd.udept_code 
                  FROM exercise3.college_department cd 
                 WHERE stu.cdept_id = cd.cdept_id)) department_name
  FROM exercise3.student stu, exercise3.college college, exercise3.university univ
 WHERE academic_year + 3 = YEAR(NOW())
   AND stu.college_id = college.id 
   AND college.city IN ('coimbatore', 'chennai')
   AND college.univ_code = univ.univ_code 
   AND univ.university_name = 'anna university';

SELECT roll_number, name, gender, dob, email, phone, address,
       (SELECT name 
          FROM exercise3.college clg
         WHERE clg.id = stu.college_id) college_name, 
         
       (SELECT dept_name 
          FROM exercise3.department 
         WHERE dept_code IN 
               (SELECT cd.udept_code 
                  FROM exercise3.college_department cd 
                 WHERE stu.cdept_id = cd.cdept_id)) department_name
  FROM exercise3.student stu
 WHERE academic_year + 3 = YEAR(NOW());

-- 3 students details who are studying under a particular university 
-- and selected cities alone. Fetch 20 records for every run
SELECT stu.roll_number, stu.name, stu.gender, stu.dob, stu.email, stu.phone, stu.address,
       (SELECT name 
          FROM exercise3.college clg
         WHERE clg.id = stu.college_id) college_name, 
         
       (SELECT dept_name 
          FROM exercise3.department 
         WHERE dept_code IN 
               (SELECT cd.udept_code 
                  FROM exercise3.college_department cd 
                 WHERE stu.cdept_id = cd.cdept_id)) department_name,
                 
        (SELECT emp.name 
           FROM exercise3.employee emp
          WHERE stu.cdept_id = emp.cdept_id 
            AND stu.college_id = emp.college_id) HOD_name
            
  FROM exercise3.student stu, exercise3.college college, exercise3.university univ
 WHERE stu.college_id = college.id 
   AND college.city IN ('coimbatore', 'chennai', 'trichy')
   AND college.univ_code = univ.univ_code 
   AND univ.university_name IN ('anna university', 'annamalai university') LIMIT 20;