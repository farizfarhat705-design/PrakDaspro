package Pertemuan6;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
public class latihan2pertemuan6 {
    public static void main(String[] args) {
        Scanner Fariz = new Scanner(System.in);
        int bukuKamus,bukuNovel,bukuSelainKamusNovel;
        double diskon;
    
        System.out.print("Jumlah Buku Kamus Yang Di Beli = ");
        bukuKamus = Fariz.nextInt();
        System.out.print("Jumlah Buku Novel Yang Di Beli = ");
        bukuNovel = Fariz.nextInt();
        System.out.print("Jumlah buku selain kamus dan novel Yang Di Beli = ");
        bukuSelainKamusNovel = Fariz.nextInt();

        if (bukuKamus >= 0 && bukuNovel >= 0 && bukuSelainKamusNovel >= 0) {
    
    if (bukuKamus > 0) {
        int diskonKamus = 8;
        if (bukuKamus > 2) {
            diskonKamus += 2;
        }
        System.out.println("Diskon Kamus : " + diskonKamus + "%");
    }
    if (bukuNovel > 0) {
        int diskonNovel = 7;
        if (bukuNovel > 3) {
            diskonNovel += 3;
        } else {
            diskonNovel += 1;
        }
        System.out.println("Diskon Novel : " + diskonNovel + "%");
    }
    if (bukuSelainKamusNovel > 3) {
        System.out.println("Diskon Buku Lain : 5%");
    } else if (bukuSelainKamusNovel > 0) {
        System.out.println("Diskon Buku Lain : 0%");
    }

} else {
    System.out.println("Input tidak valid!");
}       
    }
}
