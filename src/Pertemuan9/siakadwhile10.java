package Pertemuan9;
import java.util.Scanner;
public class siakadwhile10 {
    public static void main(String[] args) {
        Scanner Fariz = new Scanner(System.in);

        int jml, nilai, i = 0;

        System.out.print("Masukan Jumlah Mahasiswa");
        jml = Fariz.nextInt();
        

        while (i < jml) {
            System.out.print("Masukan Nilai Mahasiswa ke- " + (i + 1 ) + ":");
            nilai = Fariz.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.print("Nilai Tidak Valid. Masukan Lagi Nilai Yang Valid");
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + "adalah A");
                System.out.println("Bagus Pertahankan Nilainya");
            }else if (nilai > 73 && nilai <= 80){
                System.out.println("Nilai Mahasiswa ke-" + (i+1)+"adalah B+");
            }else if (nilai > 65 && nilai <= 73){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "adalah B");
            }else if  (nilai > 60 && nilai <= 65){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah c+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + "adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + "adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }
            i++;
        }

    }
}
