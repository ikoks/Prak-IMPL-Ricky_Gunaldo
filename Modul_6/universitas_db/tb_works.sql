USE universitas_db;
DROP TABLE IF EXISTS tb_works;

CREATE TABLE tb_works(
    works_id VARCHAR(5) NOT NULL PRIMARY KEY,
    faculty_id VARCHAR(10),
    research_id VARCHAR(5),
    CONSTRAINT fk_works_faculty FOREIGN KEY (faculty_id) REFERENCES tb_faculty(faculty_id) ON DELETE RESTRICT ON UPDATE RESTRICT,
    CONSTRAINT fk_works_research_id FOREIGN KEY (research_id) REFERENCES tb_research_project(research_id) ON DELETE RESTRICT ON UPDATE RESTRICT
);