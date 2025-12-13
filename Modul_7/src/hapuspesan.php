<?php 
$conn = mysqli_connect("localhost","root","","db_modul7");

if(isset($_GET['id'])){
    $idPesan = $_GET['id'];
    $sql = "DELETE FROM tb_pesan WHERE pesan_id = $idPesan";
    if(mysqli_query($conn, $sql)){
        echo "Pesan ID $idPesan berhasil dihapus";
    } else {
        echo "Pesan gagal dihapus";
    }
} else {
    echo "ID Pesan tidak ditemukan.";
}
?>