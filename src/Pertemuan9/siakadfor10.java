package Pertemuan9;
import java.util.Scanner;
public class siakadfor10 {
    public static void main(String[] args) {
        Scanner Fariz = new Scanner(System.in);
        
        double nilai,tertinggi = 0 , terendah = 100;
        int lulus = 0 , tidakLulus = 0;

        for (int i = 1; i <= 8 ; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke -" + i + ":");
            nilai = Fariz.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >=65) {
                lulus++;
            }
            else {
                tidakLulus++;
            }
            
        }
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);
        System.out.println("Junmlah Mahasiswa Lulus : " + lulus);
        System.out.println("jumlah Mahasiswa Tidak Lulus : " + tidakLulus);
    }
}