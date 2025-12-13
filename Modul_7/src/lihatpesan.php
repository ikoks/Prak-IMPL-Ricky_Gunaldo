<!DOCTYPE html>
<html>
<head>
<title>Lihat Pesan</title>
</head>
<body>
    <table border="1" cellpadding="5" cellspacing="0">
    <tr>
      <thead>
        <th>Pengirim ID</th>
        <th>Penerima ID</th>
        <th>Judul Pesan</th>
        <th>Isi Pesan</th>
        <th>Tanggal Pesan</th>
        <th>Delete</th>
      </thead>
      <tbody>
        <?php
          $conn = mysqli_connect("localhost","root","","db_modul7");
          $sql = "select * from tb_pesan";
          $res = mysqli_query($conn,$sql);
          if (mysqli_num_rows($res) > 0){
            while($row = mysqli_fetch_assoc($res)){
               echo"<tr>
                      <td>".$row['pengirim_id']."</td>
                      <td>".$row['penerima_id']."</td>
                      <td>".$row['judul_pesan']."</td>
                      <td>".$row['text_pesan']."</td>
                      <td>".$row['waktu_pesan']."</td>
                      <td><Button><a href='hapuspesan.php?id=".$row['pesan_id']."'>Hapus Pesan</a></td>
                    </tr>";
            }
          }else {
              echo "<tr><td colspan='7'>Tidak ada pesan.</td></tr>";
          }
        ?>
      </tbody>
    </tr>
    </table>
</body>
</html>