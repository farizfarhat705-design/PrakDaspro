package Pertemuan3;

import java.util.Scanner;

public class GajiKaryawan10 {
    public static void main(String[] args) {

        try (Scanner Fariz = new Scanner(System.in);){

        double tunjangan_transportasi = 600000 , tunjangan_makan = 400000 , bonus_kinerja , totalGaji,gajiPokok;

        System.out.print("Masukan Gaji Pokok = ");
        gajiPokok = Fariz.nextDouble();

        bonus_kinerja = 0.05 *gajiPokok;
        totalGaji=gajiPokok+tunjangan_transportasi+tunjangan_makan+bonus_kinerja-(0.10 * gajiPokok);

        System.out.println("Bonus Bulanan Anda Adalah Rp. " + bonus_kinerja);
        System.out.println("Gaji Yang Diterima Adalah Rp." + totalGaji);

        }
        
    }
}
