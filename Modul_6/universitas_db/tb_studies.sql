USE universitas_db;
DROP TABLE IF EXISTS tb_studies;

CREATE TABLE tb_studies(
    studies_id VARCHAR(5) NOT NULL PRIMARY KEY,
    student_id CHAR(10),
    course_id VARCHAR(5),
    semester VARCHAR(1) NOT NULL,
    CONSTRAINT fk_studies_student FOREIGN KEY (student_id) REFERENCES tb_student(student_id) ON DELETE RESTRICT ON UPDATE RESTRICT,
    CONSTRAINT fk_studies_course FOREIGN KEY (course_id) REFERENCES tb_course(course_id) ON DELETE RESTRICT ON UPDATE RESTRICT
);