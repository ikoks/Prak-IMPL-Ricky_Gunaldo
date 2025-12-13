<?php

$pengirim_id=1;
$penerima_id=$_POST['penerima'];
$judul_pesan=$_POST['judul'];
$text_pesan=$_POST['textpesan'];
$waktu_pesan = date('Y-m-d H:i:s');

$conn = mysqli_connect("localhost","root","","db_modul7");

$sql = "insert into tb_pesan (pengirim_id, penerima_id, judul_pesan, text_pesan, waktu_pesan) values('$pengirim_id','$penerima_id','$judul_pesan','$text_pesan','$waktu_pesan')";

if(mysqli_query($conn,$sql)){
  echo "Pesan berhasil ditambahkan";
}else{
echo "Pesan gagal ditambahkan";
}
?>