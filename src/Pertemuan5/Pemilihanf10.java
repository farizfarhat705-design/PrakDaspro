package Pertemuan5;
import java.util.Scanner;
public class Pemilihanf10 {
    public static void main(String[] args) {
        
        Scanner Fariz = new Scanner(System.in);
        
        System.out.println("--- Cetak KRS Siakad ---");
        System.out.print("Apakah UKT Sudah Lunas ? (true/false); ");
        boolean uktLunas = Fariz.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT Terverivikasi ");
            System.out.println("Silahkan Cetak KRS dan Minta Tanda Tangan DPA "); 
        } else {
            System.out.println("Registrasi Di Tolak.Silakan Lunasi UKT Terlebih Dahulu");
        }

    }
}
