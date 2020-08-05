CREATE DATABASE exercise3;

-- university
CREATE TABLE exercise3.university (
    PRIMARY KEY (univ_code)
    , `univ_code`       CHAR(4)
    , `university_name` VARCHAR(100) NOT NULL
);

-- designation
CREATE TABLE exercise3.designation (
    PRIMARY KEY (id)
    , `id`              INT
    , `name`            VARCHAR(30)  NOT NULL
    , `rank`            CHAR(1)      NOT NULL
);

-- college
CREATE TABLE exercise3.college (
    PRIMARY KEY (id)
    , `id`              INT        
    , `code`            CHAR(4)      NOT NULL
    , `name`            VARCHAR(100) NOT NULL
    , `univ_code`       CHAR(4)
    , FOREIGN KEY (univ_code)
          REFERENCES exercise3.university(univ_code)
          ON DELETE CASCADE
    , `city`            VARCHAR(50)  NOT NULL
    , `state`           VARCHAR(50)  NOT NULL
    , `year_opened`     YEAR(4)      NOT NULL
);

-- department
CREATE TABLE exercise3.department (
    PRIMARY KEY (dept_code)
    , `dept_code`       CHAR(4)
    , `dept_name`       VARCHAR(50)  NOT NULL
    , `univ_code`       CHAR(4)
    , FOREIGN KEY (univ_code)
          REFERENCES exercise3.university(univ_code)
          ON DELETE CASCADE
);

-- employee
CREATE TABLE exercise3.employee (
    PRIMARY KEY (id)
    , `id`              INT
    , `name`            VARCHAR(100) NOT NULL
    , `dob`             DATE         NOT NULL
    , `email`           VARCHAR(50)  NOT NULL
    , `phone`           BIGINT       NOT NULL
    , `college_id`      INT
    , FOREIGN KEY (college_id)
          REFERENCES exercise3.college(id)
          ON DELETE CASCADE
    , `cdept_id`        INT
    , FOREIGN KEY (cdept_id)
          REFERENCES exercise3.college_department(cdept_id)
          ON DELETE CASCADE
    , `desig_id`        INT
    , FOREIGN KEY (desig_id)
          REFERENCES exercise3.designation(id)
          ON DELETE CASCADE
);

-- college_department
CREATE TABLE exercise3.college_department (
    PRIMARY KEY (cdept_id)
    , `cdept_id`        INT
    , `udept_code`      CHAR(4)
    , FOREIGN KEY (udept_code)
          REFERENCES exercise3.department(dept_code)
          ON DELETE CASCADE
    , `college_id`      INT
    , FOREIGN KEY (college_id)
          REFERENCES exercise3.college(id)
          ON DELETE CASCADE
);

-- professor_syllabus
CREATE TABLE exercise3.professor_syllabus (
    `emp_id`            INT
    , FOREIGN KEY (emp_id)
          REFERENCES exercise3.employee(id)
          ON DELETE CASCADE
    , `syllabus_id`     INT
    , FOREIGN KEY (syllabus_id)
          REFERENCES exercise3.syllabus(id)
          ON DELETE CASCADE
    , `semester`        TINYINT      NOT NULL
);

-- syllabus
CREATE TABLE exercise3.syllabus (
    PRIMARY KEY (id)
    , `id`              INT
    , `cdept_id`        INT
    , FOREIGN KEY (cdept_id)
          REFERENCES exercise3.college_department(cdept_id)
          ON DELETE CASCADE
    , `syllabus_code`   CHAR(4)      NOT NULL
    , `syllabus_name`   VARCHAR(100) NOT NULL
);

-- student
CREATE TABLE exercise3.student (
    PRIMARY KEY (id)
    , `id`              INT
    , `roll_number`     CHAR(8)      NOT NULL
    , `name`            VARCHAR(100) NOT NULL
    , `dob`             DATE         NOT NULL
    , `gender`          CHAR(1)      NOT NULL
    , `email`           VARCHAR(50)  NOT NULL
    , `phone`           BIGINT       NOT NULL
    , `address`         VARCHAR(200) NOT NULL
    , `academic_year`   YEAR(4)
    , `cdept_id`        INT
    , FOREIGN KEY (cdept_id)
          REFERENCES exercise3.college_department(cdept_id)
          ON DELETE CASCADE
    , `college_id`      INT
    , FOREIGN KEY (college_id)
          REFERENCES exercise3.college(id)
          ON DELETE CASCADE
);

-- semester_fee
CREATE TABLE exercise3.semester_fee (
    `cdept_id`        INT
    , FOREIGN KEY (cdept_id)
          REFERENCES exercise3.college_department(cdept_id)
          ON DELETE CASCADE
    , `stud_id`      INT
    , FOREIGN KEY (stud_id)
          REFERENCES exercise3.student(id)
          ON DELETE CASCADE
    , `semester`        TINYINT      NOT NULL
    , `amount`          DOUBLE(18,2) NULL
    , `paid_year`       YEAR(4)      NULL
    , `paid_status`     VARCHAR(10)  NOT NULL
);
ALTER TABLE exercise3.semester_fee 
ALTER COLUMN paid_status SET DEFAULT 'unpaid';

-- semester_result
CREATE TABLE exercise3.semester_result (
    `stud_id`           INT
    , FOREIGN KEY (stud_id)
          REFERENCES exercise3.student(id)
          ON DELETE CASCADE
    , `syllabus_id`     INT
    , FOREIGN KEY (syllabus_id)
          REFERENCES exercise3.syllabus(id)
          ON DELETE CASCADE
    , `semester`        TINYINT      NOT NULL
    , `grade`           VARCHAR(2)   NOT NULL
    , `credits`         FLOAT        NOT NULL
    , `result_date`     DATE         NOT NULL
);