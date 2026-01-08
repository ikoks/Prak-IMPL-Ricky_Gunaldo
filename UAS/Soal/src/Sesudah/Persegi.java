package Sesudah;

public class Persegi implements BidangDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}