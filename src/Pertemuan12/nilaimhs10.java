package Pertemuan12;

import java.util.Scanner;

public class nilaimhs10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int BATAS_LULUS = 60;

        System.out.print("Masukkan banyak nilai mahasiswa: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        double rataRata = (double) total / n;
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < n; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }

        System.out.println("\n=== HASIL ===");
        System.out.printf("Rata-rata      : %.2f%n", rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);

        System.out.println("\nDaftar nilai dan status:");
        for (int i = 0; i < n; i++) {
            String status = (nilai[i] >= BATAS_LULUS) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa " + (i + 1) + " : " + nilai[i] + " - " + status);
        }
        sc.close();
    }
}
