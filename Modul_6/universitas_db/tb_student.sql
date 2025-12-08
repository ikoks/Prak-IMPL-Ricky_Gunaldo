USE universitas_db;
DROP TABLE IF EXISTS tb_student;

CREATE TABLE tb_student(
    student_id CHAR(10) NOT NULL PRIMARY KEY,
    department_id VARCHAR(5),
    address_id INT(5),
    name_student VARCHAR(50) NOT NULL,
    phone_number VARCHAR(17) NOT NULL,
    date_of_birth DATE NOT NULL,
    gender ENUM('Male', 'Female') NOT NULL,
    CONSTRAINT fk_student_department FOREIGN KEY (department_id) REFERENCES tb_department(department_id) ON DELETE RESTRICT ON UPDATE RESTRICT,
    CONSTRAINT fk_student_address FOREIGN KEY (address_id) REFERENCES tb_address(address_id) ON DELETE RESTRICT ON UPDATE RESTRICT
);