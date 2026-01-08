package Sesudah;

import java.util.Scanner;

public class BidangDatarApps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Bidang Datar");
        System.out.println("1. Lingkaran");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Segitiga Siku");

        System.out.print("Pilih: ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            System.out.println("Masukan Jari-jari Lingkaran");
            double jariJari = scanner.nextDouble();

            Lingkaran lingkaran = new Lingkaran(jariJari);

            System.out.println("Pilih Hitung Keliling atau Luas");
            System.out.println("1. Keliling");
            System.out.println("2. Luas");
            System.out.print("Pilih: ");
            int menuHitung = scanner.nextInt();

            if (menuHitung == 1) {
                System.out.println("Keliling Lingkaran adalah " + lingkaran.hitungKeliling());
            } else if (menuHitung == 2) {
                System.out.println("Luas Lingkaran adalah " + lingkaran.hitungLuas());
            }

        } else if (pilihan == 2) {
            System.out.println("Masukan Sisi Persegi");
            double sisi = scanner.nextDouble();

            Persegi persegi = new Persegi(sisi);

            System.out.println("Pilih Hitung Keliling atau Luas");
            System.out.println("1. Keliling");
            System.out.println("2. Luas");
            System.out.print("Pilih: ");
            int menuHitung = scanner.nextInt();

            if (menuHitung == 1) {
                System.out.println("Keliling Persegi adalah " + persegi.hitungKeliling());
            } else if (menuHitung == 2) {
                System.out.println("Luas Persegi adalah " + persegi.hitungLuas());
            }

        } else if (pilihan == 3) {
            System.out.println("Masukan Panjang");
            double panjang = scanner.nextDouble();
            System.out.println("Masukan Lebar");
            double lebar = scanner.nextDouble();

            PersegiPanjang pp = new PersegiPanjang(panjang, lebar);

            System.out.println("Pilih Hitung Keliling atau Luas");
            System.out.println("1. Keliling");
            System.out.println("2. Luas");
            System.out.print("Pilih: ");
            int menuHitung = scanner.nextInt();

            if (menuHitung == 1) {
                System.out.println("Keliling Persegi Panjang adalah " + pp.hitungKeliling());
            } else if (menuHitung == 2) {
                System.out.println("Luas Persegi Panjang adalah " + pp.hitungLuas());
            }
        } else if (pilihan == 4) {
            System.out.println("Masukan Alas Segitiga");
            double alas = scanner.nextDouble();
            System.out.println("Masukan Tinggi Segitiga");
            double tinggi = scanner.nextDouble();

            Segitiga segitiga = new Segitiga(alas, tinggi);

            System.out.println("Pilih Hitung Keliling atau Luas");
            System.out.println("1. Keliling");
            System.out.println("2. Luas");
            System.out.print("Pilih: ");
            int menuHitung = scanner.nextInt();

            if (menuHitung == 1) {
                System.out.println("Keliling Segitiga adalah " + segitiga.hitungKeliling());
            } else if (menuHitung == 2) {
                System.out.println("Luas Segitiga adalah " + segitiga.hitungLuas());
            }
        } else {
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}