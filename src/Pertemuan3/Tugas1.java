package Pertemuan3;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

        Scanner Fariz = new Scanner(System.in);
        double cicilanBulanan;
        double harga_laptop, uang_muka,sisaHarga,perbulan,totCicilan;

        System.out.print("Masukan Harga Laptop = ");
        harga_laptop = Fariz.nextDouble();
        System.out.print("Masukan Uang Muka =");
        uang_muka = Fariz.nextDouble();
        System.out.print("Masukan Berapa Bulan Cicilan nya = ");
        perbulan =Fariz.nextDouble();
        
         sisaHarga = harga_laptop-uang_muka;
         cicilanBulanan = sisaHarga * 0.02;
         totCicilan = cicilanBulanan / perbulan+cicilanBulanan;

        System.out.println("Jumlah Cicilan Yang Harus Dibayar Adalah = " + totCicilan);

       Fariz.close();
    }
}
