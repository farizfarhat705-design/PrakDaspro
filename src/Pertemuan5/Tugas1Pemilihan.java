package Pertemuan5;

import java.util.Scanner;

public class Tugas1Pemilihan {
    public static void main(String[] args) {
       Scanner Fariz = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD");
        System.out.println("Apakah UKT Sudah Lunas ? (true/false):");
        boolean uktLunas = Fariz.nextBoolean();
        
        String pesan;
        pesan = uktLunas ? "Pembayaran UKT Terverivikasi \nSilahkan Cetak KRS dan Minta Tanda Tangan DPA" : "Registrasi Ditolak. SIlakan Lunasi UKT Terlebih Dahulu";
        System.out.println(pesan);
    }
}
