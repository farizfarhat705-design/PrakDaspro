package Pertemuan5;
import java.util.Scanner;
public class TugasParkir10 {
    public static void main(String[] args) {
        Scanner Fariz = new Scanner(System.in);
        int lamaParkir,tarif;

        System.out.print("Berapa Lama Parkir =");
        lamaParkir = Fariz.nextInt();

        if (lamaParkir <= 2 ) {
            tarif = 2000;
        }else {
            tarif = 2000 + ((lamaParkir-2)*1000);
        }

        System.out.println("Lama Parkir = " + lamaParkir + "jam");
        System.out.println("Total Tarif ="+ "Rp" + tarif);

    }
    
}
