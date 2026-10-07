package Pertemuan5;
import java.util.Scanner;
public class Tugas2Pemilihan10 {
    public static void main(String[] args) {
        Scanner Fariz = new Scanner(System.in);
        int jumlahSks;
        
        System.out.print("Masukan Jumlah SKS Yang Inging Diambil = ");
        jumlahSks = Fariz.nextInt();
        

        if (jumlahSks > 24) {
            System.out.println("Melebihi Batas");
        }else {
            System.out.println("KRS Valid");
        }

    }
}
