USE universitas_db;
DROP TABLE IF EXISTS tb_department;

CREATE TABLE tb_department(
    department_id VARCHAR(5) NOT NULL PRIMARY KEY,
    name_department VARCHAR(50) NOT NULL
);