CREATE DATABASE exercise2;

-- 1. create employee table
CREATE TABLE exercise2.employee (
    PRIMARY KEY (emp_id)
   ,emp_id          INT         NOT NULL
   ,first_name      VARCHAR(25) NOT NULL
   ,surname         VARCHAR(25)
   ,dob             DATE
   ,date_of_joining DATE
   ,annual_salary   INT
   ,department_id   INT
   ,FOREIGN KEY (department_id)
        REFERENCES exercise2.department(id)
        ON DELETE CASCADE
);

-- 1. create department table
CREATE TABLE exercise2.department (
    PRIMARY KEY (id)
   ,id              INT
   ,department_name VARCHAR(30)
);
