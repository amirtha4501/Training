-- insert values into employee
INSERT INTO exercise2.employee ( emp_id, first_name, surname, dob, date_of_joining, annual_salary, department_id)
VALUES (1, 'amirtha', 'easwaran', '2001-05-04', '2018-05-06', 70000, 3)
       , (2, 'samirtha', 'shankar', '2001-05-04', '2018-05-06', 70000, 1)
       , (3, 'arun', 'kumar', '2001-01-02', '2018-05-01', 79000, 2)
       , (4, 'akshaya', 'kailash', '2001-02-04', '2019-09-06', 80000, 4)
       , (5, 'sakthi', 'priya', '2002-05-03', '2018-07-02', 77000, 1);

-- insert values into department
INSERT INTO exercise2.department (id, department_name)
VALUES (1, 'accounts')
       , (2, 'management')
       , (3, 'marketing')
       , (4, 'production')
       , (5, 'maintenance');
       