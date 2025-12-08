USE universitas_db;
DROP TABLE IF EXISTS tb_research_project;

CREATE TABLE tb_research_project(
    research_id VARCHAR(5) NOT NULL PRIMARY KEY,
    name_research VARCHAR(30) NOT NULL,
    area_research VARCHAR(30) NOT NULL,
    duration INT(3) NOT NULL
);