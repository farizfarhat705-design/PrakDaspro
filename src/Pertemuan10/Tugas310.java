package Pertemuan10;

import java.util.Scanner;

public class Tugas310 {
    public static void main(String[] args) {
        Scanner Fariz = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = Fariz.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSeluruh = 0;
            int barangTerbanyak = -1;   
            int tokoTerbaik = 0;

            int nomorToko = 1;
            while (nomorToko <= jumlahToko) {
                System.out.println("Toko " + nomorToko);

                int jumlahPelanggan;
                do {
                    System.out.print("  Jumlah pelanggan: ");
                    jumlahPelanggan = Fariz.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;   // reset tiap toko
                for (int p = 1; p <= jumlahPelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("    Barang pelanggan " + p + ": ");
                        barang = Fariz.nextInt();
                        if (barang < 0) {
                            System.out.println("    Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }

                System.out.println("Toko " + nomorToko + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko);

                totalSeluruh += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {  
                    barangTerbanyak = totalBarangToko;
                    tokoTerbaik = nomorToko;
                }
                nomorToko++;
            }

            System.out.println("==============================");
            System.out.println("Total barang seluruh toko: " + totalSeluruh);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
        }
        Fariz.close();
    }
}