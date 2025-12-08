USE universitas_db;
DROP TABLE IF EXISTS tb_teaches;

CREATE TABLE tb_teaches(
    teaches_id VARCHAR(5) NOT NULL PRIMARY KEY,
    faculty_id VARCHAR(10),
    course_id VARCHAR(5),
    CONSTRAINT fk_teaches_faculty FOREIGN KEY (faculty_id) REFERENCES tb_faculty(faculty_id) ON DELETE RESTRICT ON UPDATE RESTRICT,
    CONSTRAINT fk_teaches_course FOREIGN KEY (course_id) REFERENCES tb_course(course_id) ON DELETE RESTRICT ON UPDATE RESTRICT
);