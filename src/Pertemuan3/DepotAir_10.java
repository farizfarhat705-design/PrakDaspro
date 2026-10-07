package Pertemuan3;

import java.util.Scanner;

public class DepotAir_10 {
    public static void main(String[] args) {

        Scanner Fariz = new Scanner(System.in);
        
        int jumlahGalonTerjual,pembelianGalon;
        int sisaAir,sisaGalon;
        int pendapatan,literAir,galon = 19;
        double rataRataPerJam,hargaGalon,galon_penuh;

        System.out.print("Masukan Jumlah Galon");
        jumlahGalon = Fariz.nextInt();
        System.out.print("Total Galon Yang Terisi penuh = ");
        galon_penuh = Fariz.nextInt();
        System.out.print("Berapa Liter Air Yng Terjual =");
        literAir = Fariz.nextInt();

        sisaAir = jumlahGalonTerjual - sisaGalon;
        pendapatan = pembelianGalon * 19.500;


         

        System.out.println("Pendapatan = " + pendapatan);
        System.out.println("Sisa Air = "+ sisaAir);
        

    }
    
}
