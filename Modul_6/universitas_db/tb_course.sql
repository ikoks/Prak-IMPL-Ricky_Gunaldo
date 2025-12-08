USE universitas_db;
DROP TABLE IF EXISTS tb_course;

CREATE TABLE tb_course(
    course_id VARCHAR(5) NOT NULL PRIMARY KEY,
    department_id VARCHAR(5),
    name_course VARCHAR(30) NOT NULL,
    code_course CHAR(7) NOT NULL,
    CONSTRAINT fk_course_department FOREIGN KEY (department_id) REFERENCES tb_department(department_id) ON DELETE RESTRICT ON UPDATE RESTRICT
);