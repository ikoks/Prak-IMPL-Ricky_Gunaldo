package Sesudah;

public class Lingkaran implements BidangDatar {
    private double jariJari;
    private final double PI = 3.14;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * PI * jariJari;
    }

    @Override
    public double hitungLuas() {
        return PI * jariJari * jariJari;
    }
}