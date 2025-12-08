USE universitas_db;
DROP TABLE IF EXISTS tb_faculty;

CREATE TABLE tb_faculty(
    faculty_id VARCHAR(10) NOT NULL PRIMARY KEY,
    department_id VARCHAR(5),
    name_faculty VARCHAR(30) NOT NULL,
    gender ENUM ('Male', 'Female') NOT NULL,
    salary INT(10) NOT NULL,
    date_of_birth DATE NOT NULL,
    grade CHAR(1) NOT NULL,
    designation VARCHAR(30) NOT NULL,
    CONSTRAINT fk_faculty_department FOREIGN KEY (department_id) REFERENCES tb_department(department_id) ON DELETE RESTRICT ON UPDATE RESTRICT
);