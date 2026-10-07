package Pertemuan2;

import java.util.Scanner;

/**
 * trhyju
 */
public class Tugas3_1_dinamis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gajiPokok, jumlahAnak, danaPensiunan,gajiAkhir, totalGaji, tunjanganAnak;

        
        System.out.print("Masukan Gaji Pokok = ");
        gajiPokok = sc.nextInt();
        System.out.print("Masukan Tunjangan Anak = ") ;
        tunjanganAnak = sc.nextInt();
        System.out.print("Masukan Jumlah Anak = ");
        jumlahAnak = sc.nextInt();
        System.out.print("Dana Pensiun (%) =");
        danaPensiunan = sc.nextInt();

         totalGaji = gajiPokok + (jumlahAnak * tunjanganAnak);
         danaPensiunan = totalGaji * danaPensiunan;
         gajiAkhir = totalGaji - danaPensiunan;
        
         System.out.println("Gaji Bersih =" + gajiAkhir);

         sc.close();

    }
}