-- create database 
CREATE DATABASE exercise1;

-- create student table 
CREATE TABLE exercise1.student (
    PRIMARY KEY (roll_no)
    , roll_no     INT(8)
    , first_name  VARCHAR(25) NOT NULL
    , last_name   VARCHAR(25)
    , department  VARCHAR(25)
) ENGINE = InnoDB;
   
-- create course table
CREATE TABLE exercise1.courses (
    PRIMARY KEY (id)
    , id          INT(2)      NOT NULL
    , course_name VARCHAR(30) NOT NULL
    , min_score   INT(2)      NOT NULL
);

-- create staff table
CREATE TABLE exercise1.staff (
   PRIMARY KEY (staff_id)
   , staff_id     INT         NOT NULL
   , staff_name   VARCHAR(25) NOT NULL
   , department   VARCHAR(45)
   , age          INT
);


