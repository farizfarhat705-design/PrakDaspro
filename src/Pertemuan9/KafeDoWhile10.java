package Pertemuan9;
import java.util.Scanner;
public class KafeDoWhile10 {
    public static void main(String[] args) {
        Scanner Fariz = new Scanner(System.in);
        int hargaKopi = 10000, hargaTeh = 7000 , hargaRoti = 19000,kopi,teh,roti,totalHarga ;
        String namaPelanggan;
        
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = Fariz.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = Fariz.nextInt();
            System.out.print("Jumlah teh: ");
            teh = Fariz.nextInt();
            System.out.print("Jumlah roti: ");
            roti = Fariz.nextInt();
            totalHarga = (kopi* hargaKopi) + (teh * hargaTeh) + (roti* hargaRoti);
            System.out.println("Total yang harus dibayar: Rp" + totalHarga);
            Fariz.nextLine();
    
        } while (true);
    }
}
