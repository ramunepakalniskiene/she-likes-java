DROP TABLE IF EXISTS STUDENT;
CREATE TABLE STUDENT
(
    ID      INT PRIMARY KEY AUTOINCREMENT,
    NAME    VARCHAR(255) NOT NULL,
    SURNAME VARCHAR(255) NOT NULL,
    AGE     INT          NOT NULL DEFAULT 0,
    SEX     VARCHAR(255)
);
INSERT INTO STUDENT (NAME, SURNAME, SEX)
VALUES ('Olek', 'S.', 'MALE');
INSERT INTO STUDENT (NAME, SURNAME, AGE, SEX)
VALUES ('Marek', 'W.', 25, 'MALE');
INSERT INTO STUDENT (NAME, SURNAME, AGE, SEX)
VALUES ('Alina', 'G.', 18, 'FEMALE');
INSERT INTO STUDENT (NAME, SURNAME, AGE, SEX)
VALUES ('Anna', 'F.', 35, 'FEMALE');
INSERT INTO STUDENT (NAME, SURNAME, AGE, SEX)
VALUES ('EWELINA', 'A.', 40, 'FEMALE');

SELECT ID, NAME, SURNAME, SEX
FROM STUDENT;

ALTER TABLE STUDENT
    ADD COLUMN GRADE INT;

SELECT *
FROM STUDENT;

ALTER TABLE STUDENT DROP COLUMN GRADE;

SELECT *
FROM STUDENT;

ALTER TABLE STUDENT
    ADD COLUMN GRADE INT NOT NULL USING 5;

UPDATE STUDENT
SET AGE= 38
WHERE ID = 1;

----------------------------------------------------------2023-05-31------------------------------------------

SELECT*
FROM STUDENT;

SELECT MAX(ID) as max_id, MAX(age) as max_age, MAX(GRADE) as max_grade
from STUDENT;

ALTER TABLE STUDENT
    ALTER COLUMN ID SET GENERATED ALWAYS START WITH (SELECT MAX(ID)+1 FROM STUDENT);

INSERT INTO STUDENT (NAME, SURNAME, AGE, SEX, GRADE)
values ('Olga', 'Bross', 32, 'woman', 10);

CREATE TABLE PUPIL
(
    ID            INTEGER PRIMARY KEY AUTOINCREMENT,
    NAME          VARCHAR(255) NOT NULL,
    SURNAME       VARCHAR(255) NOT NULL,
    CURRENT_CLASS VARCHAR(255) NOT NULL
);
--------------------------------------------------------2023-06-02-----------------
INSERT INTO STUDENT (NAME, SURNAME, AGE, SEX, GRADE)
VALUES (?, ?, ?, ?);

DROP TABLE IF EXISTS PUPIL;

INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS)
VALUES ('Aaron', 'Jones', '7B');
INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS)
VALUES ('Tom', 'Rogers', '5A');
INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS)
VALUES ('Melisa', 'Core', '6A');
INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS)
VALUES ('James', 'Collin', '5A');
INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS)
VALUES ('Ryan', 'Bills', '7B');
INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS)
VALUES ('Amanda', 'Fridge', '6A');