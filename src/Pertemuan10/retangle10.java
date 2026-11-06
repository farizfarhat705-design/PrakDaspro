package Pertemuan10;
import java.util.Scanner;
public class retangle10 {
    public static void main(String[] args) {
        Scanner Fariz = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = Fariz.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = Fariz.nextInt();   

        for (int i = 1; i <= baris; i++) { // outer loop: baris
            for (int j = 1; j <= kolom; j++) { // inner loop: kolom
            System.out.print("#");
            }
             System.out.println(); // pindah baris
        }
        Fariz.close();


    }
}