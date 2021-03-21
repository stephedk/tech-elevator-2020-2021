DROP TABLE IF EXISTS employee CASCADE; 
DROP TABLE IF EXISTS department CASCADE; 
DROP TABLE IF EXISTS project CASCADE; 

CREATE TABLE employee
(
        employee_id SERIAL NOT NULL PRIMARY KEY
        , title VARCHAR(50) NOT NULL
        , last_name VARCHAR(50) NOT NULL
        , first_name VARCHAR(50) NOT NULL
        , gender VARCHAR(15) NOT NULL
        , date_of_birth DATE NOT NULL
        , date_of_hire DATE NOT NULL
        , dept_id INTEGER NOT NULL
); 
CREATE TABLE department
(
        dept_id SERIAL NOT NULL PRIMARY KEY
        , dept_name VARCHAR(100) NOT NULL
); 
CREATE TABLE project
(
        project_id SERIAL NOT NULL PRIMARY KEY
        , project_name VARCHAR(100) NOT NULL
        , project_start_date DATE NOT NULL
        , employee_id INTEGER NOT NULL
); 
ALTER TABLE employee
ADD CONSTRAINT fk_dept_employee
FOREIGN KEY (dept_id)
REFERENCES department(dept_id); 

ALTER TABLE project
ADD CONSTRAINT fk_project_employee
FOREIGN KEY (employee_id)
REFERENCES employee(employee_id); 


INSERT INTO department (dept_name)
VALUES ('Crushing'), ('Slanging'), ('Macking'), ('Stacking'); 

SELECT *
FROM employee; 


INSERT INTO employee (title, last_name, first_name, gender, date_of_birth, date_of_hire, dept_id)
VALUES ('RZA', 'Diggs', 'Robert', 'Male', '1969-07-05', '1984-01-01', 4); 

INSERT INTO employee (title, last_name, first_name, gender, date_of_birth, date_of_hire, dept_id)
VALUES ('GZA', 'Grice', 'Gary', 'Male', '1966-08-22', '1984-01-01', 1); 

INSERT INTO employee (title, last_name, first_name, gender, date_of_birth, date_of_hire, dept_id)
VALUES ('ODB', 'Jones', 'Russell', 'Male', '1968-11-13', '1995-03-28', 3); 

INSERT INTO employee (title, last_name, first_name, gender, date_of_birth, date_of_hire, dept_id)
VALUES ('Method Man', 'Smith', 'Clifford', 'Male', '1971-03-02', '1994-01-01', 3); 

INSERT INTO employee (title, last_name, first_name, gender, date_of_birth, date_of_hire, dept_id)
VALUES ('Raekwon', 'Woods', 'Corey', 'Male', '1970-01-012', '1992-01-01', 2); 

INSERT INTO employee (title, last_name, first_name, gender, date_of_birth, date_of_hire, dept_id)
VALUES ('Ghostface Killah', 'Coles', 'David', 'Male', '1970-05-09', '1995-01-01', 2); 

INSERT INTO employee (title, last_name, first_name, gender, date_of_birth, date_of_hire, dept_id)
VALUES ('Inspectah Deck', 'Hunter', 'Jason', 'Male', '1970-07-06', '1999-9-01', 4); 

INSERT INTO employee (title, last_name, first_name, gender, date_of_birth, date_of_hire, dept_id)
VALUES ('U-God', 'Hawkins', 'Lamont', 'Male', '1970-11-10', '1999-01-01', 1); 

INSERT INTO employee (title, last_name, first_name, gender, date_of_birth, date_of_hire, dept_id)
VALUES ('Masta Killa', 'Irief', 'Jamel', 'Male', '1969-08-18', '2004-06-01', 4); 



INSERT INTO project (project_name, project_start_date, employee_id)
VALUES ('Chess Boxing', '1984-05-19', 2); 

INSERT INTO project (project_name, project_start_date, employee_id)
VALUES ('Chess Boxing', '1984-05-19', 1); 

INSERT INTO project (project_name, project_start_date, employee_id)
VALUES ('Winter Warz', '1993-07-23', 6); 

INSERT INTO project (project_name, project_start_date, employee_id)
VALUES ('Winter Warz', '1993-07-23', 5); 

INSERT INTO project (project_name, project_start_date, employee_id)
VALUES ('Garment Renaissance', '1992-11-03', 1); 

INSERT INTO project (project_name, project_start_date, employee_id)
VALUES ('Big Baby Jesus', '2001-02-12', 3); 

SELECT *
FROM project; 