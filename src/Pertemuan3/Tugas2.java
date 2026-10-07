package Pertemuan3;

import java.util.Scanner;

        public class Tugas2 {
            public static void main(String[] args) {
                
                try (Scanner Fariz = new Scanner(System.in);){

                double lembar;
                double biayaCetak = 500;
                double biayaPenjilidan = 5000;
                double totBiaya;
                

                System.out.print("Masukan Berapa Lembar Yang Di cetak = ");
                lembar = Fariz.nextDouble();

                totBiaya = (lembar * biayaCetak)+biayaPenjilidan;

                System.out.println("Total Biaya Yang Harus DiBayar Adalah = " + totBiaya);

                }
            }
    
}
