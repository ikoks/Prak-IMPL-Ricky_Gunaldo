package Latihan_OCP;

public class MahasiswaCinema extends Cinema {
    public MahasiswaCinema(double price) {
        this.price = price;
    }

    @Override
    Double calculateAdminFee() {
        return price * 5 / 100;
    }
}