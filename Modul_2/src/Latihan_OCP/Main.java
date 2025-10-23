package Latihan_OCP;

public class Main {
    public static void main(String[] args) {
        StandardCinema standard = new StandardCinema(100.0);
        Double adminfee = standard.calculateAdminFee();
        System.out.println(adminfee);
    }
}
