-- 1. Create tables to hold employee(emp_id, first_name, surname, dob, date_of_joining, annual_salary), possible depts: ITDesk, Finance, Engineering, HR, Recruitment, Facility

--     employee number must be the primary key in employee table
--     department number must be the primary key in department table
--     department number is the foreign key in the employee table


CREATE TABLE `db`.`employee` (
  `emp_id` INT NOT NULL,
  `first_name` VARCHAR(25) NULL,
  `surname` VARCHAR(25) NULL,
  `dob` DATE NULL,
  `date_of_joining` DATE NULL,
  `annual_salary` INT NULL,
  `department_id` INT NULL,
  PRIMARY KEY (`emp_id`),
  INDEX `department_id_idx` (`department_id` ASC) VISIBLE,
  CONSTRAINT `department_id`
    FOREIGN KEY (`department_id`)
    REFERENCES `db`.`department` (`department_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
