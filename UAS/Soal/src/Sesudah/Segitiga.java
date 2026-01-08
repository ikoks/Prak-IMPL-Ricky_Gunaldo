package Sesudah;

public class Segitiga implements BidangDatar {
    private double alas;
    private double tinggi;
    private double sisiMiring;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
    }

    public double getAlas() { return alas; }
    public void setAlas(double alas) { this.alas = alas; }

    public double getTinggi() { return tinggi; }
    public void setTinggi(double tinggi) { this.tinggi = tinggi; }

    public double getSisiMiring() { return sisiMiring; }

    @Override
    public double hitungKeliling() {
        return alas + tinggi + sisiMiring;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}