USE db_modul7;
DROP TABLE IF EXISTS tb_pesan;

CREATE TABLE tb_pesan(
    pesan_id INT(6) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    pengirim_id INT(5) NOT NULL,
    penerima_id INT(5) NOT NULL,
    judul_pesan VARCHAR(255) NOT NULL,
    text_pesan TEXT NOT NULL,
    waktu_pesan DATETIME NOT NULL
)