USE universitas_db;
DROP TABLE IF EXISTS tb_address;

CREATE TABLE tb_address(
    address_id INT(5) NOT NULL PRIMARY KEY,
    house_number INT(3) NOT NULL,
    street_number INT(3) NOT NULL,
    town VARCHAR(30) NOT NULL,
    city VARCHAR(30) NOT NULL
);