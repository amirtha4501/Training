-- 1. college details which are having IT / CSC departments across all the universities

-- 1a
SELECT college.code
      ,college.name college_name
      ,university.university_name
      ,college.city
      ,college.state
      ,college.year_opened
      ,department.dept_name
      ,employee.name hod
  FROM exercise3.college
  LEFT JOIN exercise3.university
    ON university.univ_code = college.univ_code
  LEFT JOIN exercise3.department
    ON department.dept_code IN 
       (SELECT college_department.udept_code 
          FROM exercise3.college_department
         WHERE college_department.college_id = college.id)
  LEFT JOIN exercise3.employee
    ON employee.college_id = college.id
       AND employee.desig_id IN 
       (SELECT designation.id
          FROM exercise3.designation
         WHERE designation.name = 'hod')
 WHERE department.dept_name IN ('cse', 'it');
 
-- 1b
SELECT college.code
      ,college.name college_name
      ,university.university_name
      ,college.city
      ,college.state
      ,college.year_opened
      ,department.dept_name
      ,employee.name hod
  FROM exercise3.employee
  LEFT JOIN exercise3.designation
    ON employee.desig_id = designation.id
  LEFT JOIN exercise3.college_department
    ON employee.cdept_id = college_department.cdept_id
  LEFT JOIN exercise3.department 
    ON college_department.udept_code = department.dept_code
  LEFT JOIN exercise3.college
    ON college_department.college_id = college.id
  LEFT JOIN exercise3.university
    ON college.univ_code = university.univ_code 
 WHERE designation.name = 'hod' 
   AND department.dept_name IN ('cse', 'it');


-- 2. final year students details who are studying under a particular university and selected cities alone
SELECT student.roll_number
      ,student.name
      ,student.gender
      ,student.dob
      ,student.email
      ,student.phone
      ,student.address
      ,college.name college_name
      ,department.dept_name department_name
  FROM exercise3.student
  LEFT JOIN exercise3.college
    ON student.college_id = college.id
  LEFT JOIN exercise3.department 
    ON dept_code IN 
       (SELECT college_department.udept_code 
          FROM exercise3.college_department
         WHERE student.cdept_id = college_department.cdept_id) 
  LEFT JOIN exercise3.university
    ON college.univ_code = university.univ_code 
 WHERE academic_year = YEAR(NOW()) - 3 
   AND college.city IN ('chennai', 'coimbatore') 
   AND university.university_name = ('anna university');

-- 3. students details who are studying under a particular university and selected cities
SELECT student.roll_number
      ,student.name
      ,student.gender
      ,student.dob
      ,student.email
      ,student.phone
      ,student.address
      ,college.name college_name
      ,department.dept_name department_name
      ,employee.name hod_name
  FROM exercise3.student
  LEFT JOIN exercise3.college
    ON college.id = student.college_id
  LEFT JOIN exercise3.department
    ON department.dept_code IN 
       (SELECT college_department.udept_code 
          FROM exercise3.college_department
         WHERE college_department.college_id = college.id)
  LEFT JOIN exercise3.employee
    ON employee.college_id = college.id
       AND employee.desig_id IN 
       (SELECT designation.id
          FROM exercise3.designation
         WHERE designation.name = 'hod')
  LEFT JOIN exercise3.university
    ON college.univ_code = university.univ_code 
 WHERE college.city IN ('chennai', 'coimbatore') 
   AND university.university_name = ('anna university') LIMIT 20;
 
-- 4. employee details sorted by rank and college_name
SELECT employee.id
      ,employee.name
      ,employee.dob
      ,employee.email
      ,employee.phone
      ,college.name college_name
      ,college.city college_location
      ,department.dept_name department_name
      ,designation.rank
  FROM exercise3.employee
  LEFT JOIN exercise3.college 
    ON employee.college_id = college.id
  LEFT JOIN exercise3.university
    ON college.univ_code = university.univ_code 
  LEFT JOIN exercise3.designation
    ON employee.desig_id = designation.id
  LEFT JOIN exercise3.department 
    ON dept_code IN 
       (SELECT college_department.udept_code 
          FROM exercise3.college_department
         WHERE employee.cdept_id = college_department.cdept_id) 
 WHERE college.city IN ('chennai', 'coimbatore') 
   AND university.university_name = ('anna university') 
 ORDER BY college.name, designation.rank;
 
-- 5. students details along with their GRADE,CREDIT, etc., with pagination
SELECT student.id
      ,student.roll_number
      ,student.name
      ,student.gender
      ,student.dob
      ,student.email
      ,student.phone
      ,student.address
      ,college.name college_name
      ,university.university_name
      ,semester_result.grade
      ,semester_result.credits
      ,semester_result.semester
      ,CASE WHEN grade='a+' THEN 10
            WHEN grade='a'  THEN 9
            WHEN grade='b+' THEN 8
            WHEN grade='b'  THEN 7
            WHEN grade='c'  THEN 6
            WHEN grade='f'  THEN 0
       END gpa
  FROM exercise3.student
  LEFT JOIN exercise3.college 
    ON student.college_id = college.id
  LEFT JOIN exercise3.university 
    ON college.univ_code = university.univ_code
  LEFT JOIN exercise3.semester_result
    ON student.id = semester_result.stud_id 
 ORDER BY college.name, semester_result.semester
 LIMIT 10 OFFSET 10;

-- 8. employee vacancy position in all the departments from all the colleges 
SELECT designation.name designation
      ,designation.rank
      ,college.name college
      ,department.dept_name
      ,university.university_name 
  FROM exercise3.college_department
 CROSS JOIN exercise3.designation
 CROSS JOIN exercise3.employee
  LEFT JOIN exercise3.department 
    ON college_department.udept_code = department.dept_code 
  LEFT JOIN exercise3.college
    ON college_department.college_id = college.id
  LEFT JOIN exercise3.university 
    ON college.univ_code = university.univ_code
 WHERE employee.cdept_id = college_department.cdept_id 
   AND employee.desig_id = designation.id;
 
-- 9. 
--  9a. collected and uncollected semester fees amount per semester for each college under an university. Result should be filtered based on given year.
SELECT semester_fee.semester 
      ,SUM(IF(semester_fee.paid_status = 'paid', semester_fee.amount, 0)) Collected_amount 
      ,SUM(IF(semester_fee.paid_status = 'unpaid', semester_fee.amount, 0)) Uncollected_amount
      ,college.name college_name
      ,university.university_name
  FROM exercise3.semester_fee
  LEFT JOIN exercise3.student 
    ON semester_fee.stud_id = student.id
  LEFT JOIN exercise3.college 
    ON college.id = student.college_id 
  LEFT JOIN exercise3.university
    ON university.univ_code = college.univ_code
 WHERE semester_fee.paid_year IN ('2019', '2018','2020')
 GROUP BY college.name;
 
 -- 9b. Collected semester fees amount for each university for the given year
SELECT SUM(IF(semester_fee.paid_status = 'paid', semester_fee.amount, 0)) Collected_amount
      ,university.university_name
  FROM exercise3.semester_fee
  LEFT JOIN exercise3.student 
    ON semester_fee.stud_id = student.id
  LEFT JOIN exercise3.college 
    ON college.id = student.college_id 
  LEFT JOIN exercise3.university
    ON university.univ_code = college.univ_code
 WHERE semester_fee.paid_year IN ('2019', '2018','2020')
 GROUP BY university.university_name;


-- 10.  shows students details who scored above specified gpa

-- 10a students details who scored above 8 GPA in semester 4
SELECT student.roll_number
      ,student.name
      ,student.dob
      ,student.gender
      ,student.email
      ,student.phone
      ,student.address
      ,student.academic_year
      ,CASE WHEN grade='a+' THEN 10
            WHEN grade='a'  THEN 9
            WHEN grade='b+' THEN 8
            WHEN grade='b'  THEN 7
            WHEN grade='c+' THEN 6
            WHEN grade='c'  THEN 5
            WHEN grade='f'  THEN 4
            WHEN grade='u'  THEN 0
        END gpa
  FROM exercise3.student
 INNER JOIN exercise3.semester_result
    ON semester_result.stud_id = student.id
 WHERE semester_result.semester = 4
   AND grade IN ('a+', 'a');
        
-- 10b students details who scored above 5 GPA in semester 4
SELECT student.roll_number
      ,student.name
      ,student.dob
      ,student.gender
      ,student.email
      ,student.phone
      ,student.address
      ,student.academic_year 
      ,CASE WHEN grade='a+' THEN 10
            WHEN grade='a'  THEN 9
            WHEN grade='b+' THEN 8
            WHEN grade='b'  THEN 7
            WHEN grade='c+' THEN 6
            WHEN grade='c'  THEN 5
            WHEN grade='f'  THEN 4
            WHEN grade='u'  THEN 0
       END gpa
  FROM exercise3.student
 INNER JOIN exercise3.semester_result
    ON semester_result.stud_id = student.id
 WHERE semester_result.semester = 4
   AND semester_result.grade NOT IN ('c', 'f', 'u');