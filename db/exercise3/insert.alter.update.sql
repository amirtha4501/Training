-- 6. create new entries in SEMESTER_FEE table

INSERT INTO exercise3.semester_fee (cdept_id, stud_id, semester, paid_status)
VALUES (2, 1, 4, 'paid');

INSERT INTO exercise3.semester_fee (cdept_id, stud_id, semester, paid_year)
VALUES (5, 3, 3, 2019);

 ALTER TABLE exercise3.semester_fee
 ALTER COLUMN amount 
   SET DEFAULT 80000;

 ALTER TABLE exercise3.semester_fee
 ALTER COLUMN paid_status 
   SET DEFAULT 'unpaid';

 ALTER TABLE exercise3.semester_fee
MODIFY cdept_id INT NOT NULL;

 ALTER TABLE exercise3.semester_fee
MODIFY stud_id INT NOT NULL;

-- 7. update PAID_STATUS and PAID_YEAR in SEMESTER_FEE table

UPDATE exercise3.semester_fee sf
  LEFT JOIN exercise3.student s
    ON sf.stud_id = s.id
   SET sf.paid_year = YEAR(NOW()), 
       sf.paid_status = 'paid'
 WHERE s.roll_number = '18cs1111';

UPDATE exercise3.semester_fee sf
  LEFT JOIN exercise3.student s
    ON sf.stud_id = s.id
   SET sf.paid_year = YEAR(NOW()), 
       sf.paid_status = 'paid'
 WHERE s.roll_number IN ('18cs1114', '18cs1115', '18cs1118');