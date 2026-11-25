package Pertemuan11;
import java.util.Scanner;
public class nilaimhs10 {
    public static void main(String[] args) {
       Scanner Fariz = new Scanner(System.in);

        double nilai,rataNilaiTGS;
        int nilaiTGS;
       System.out.print("Nama Mahasiswa :");
       double namaMhs = Fariz.nextInt();
       System.out.print("Nilai Kuis :");
       double nilaikuis = Fariz.nextInt();
       System.out.print("Nilai UTS : ");
       int nilaiUTS = Fariz.nextInt();
       System.out.print("Nilai UAS : ");
       double nilaiUAS = Fariz.nextInt();
       System.out.print("NIlai Tugas 1 :");
       double nilaiTGS1 = Fariz.nextInt();
       System.out.print("Nilai Tugas2 : ");
       double nilaiTGS2 = Fariz.nextInt();

       do {
        
        if (nilaiTGS < 0)
            System.out.println("Nilai Tidak Valid Ulangi ");

        nilai = 0.35* nilaikuis + 0.15 *nilaiUTS + 0.30 *nilaiUAS + 0.20 *(nilaiTGS1 + nilaiTGS2 / 2);
        if (nilai > 50 ) {
            System.out.println("Lulus");  
        }else 
        System.out.println("Tidak Lulus");


       } while ();
       rataNilaiTGS = (nilaiTGS1 + nilaiTGS2) / 2;
       System.out.println("NIlai Rata Rata NIlai Tugas : ");
       Fariz.close();

    }
}
