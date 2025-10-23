package Latihan_OCP;

public class Main {
    public static void main(String[] args) {
        MahasiswaCinema mhs = new MahasiswaCinema(100.0);
        Double adminfee = mhs.calculateAdminFee();
        System.out.println(adminfee);
    }
}
