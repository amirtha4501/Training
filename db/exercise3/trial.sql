select * from exercise3.university;
select * from exercise3.designation;
select * from exercise3.college;
select * from exercise3.department;
select * from exercise3.employee;
select * from exercise3.college_department;
select * from exercise3.syllabus;
select * from exercise3.professor_syllabus;
select * from exercise3.student;
select * from exercise3.semester_result;
select * from exercise3.semester_fee;

INSERT INTO `exercise3`.`professor_syllabus` (`emp_id`, `syllabus_id`, `semester`) VALUES ('3', '4', '2');
INSERT INTO `exercise3`.`semester_result` (`stud_id`, `syllabus_id`, `semester`, `grade`, `credits`, `result_date`) VALUES ('5', '4', '4', 'a', 9, '2018-06-09');
INSERT INTO `exercise3`.`semester_fee` (`cdept_id`, `stud_id`, `semester`, `amount`, `paid_year`) VALUES ('4', '2', '1', 20000.00, '2019');




