<!DOCTYPE html>
<html>
<head>
<title>Tambah Pesan</title>
</head>
<body>
    <form action="simpanPesan.php" method="post">
        <!-- diasumsikan idPengirim = id user login, didapatkan dari session dan
        idpesan auto_increment dan tanggal adalah tanggal saat ini sehingga tidak
        perlu input -->
        <label>ID Penerima: </label><br>
        <input type="text" name="penerima" required><br><br>
        
        <label>Judul Pesan: </label><br>
        <input type="text" name="judul" required><br><br>
        
        <label>Isi Pesan: </label><br>
        <textarea name="textpesan" rows="4" cols="50" required></textarea><br><br>
        
        <input type="submit" name="submit" value="Simpan">
    </form>
</body>
</html>