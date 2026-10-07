package Pertemuan6;
import java.util.Scanner;
public class nestedUjianSripsi10 {
    public static void main(String[] args) {
        Scanner Fariz = new Scanner(System.in);
        String pesan;
        System.out.print("Apakah Mahasiswa Suda Bebas Kompen ? (Ya/Tidak): ");
        String bebasKompen = Fariz.nextLine().trim();

        System.out.print("Masukan Jumlah Log Bimbingan Pembimbing 1:");
        int bimbinganP1 = Fariz.nextInt();
        System.out.print("Masukan Jumlah Log Bimbingan Pembimbing 2:");
        int bimbinganP2 = Fariz.nextInt();
        
        if (bebasKompen.equalsIgnoreCase("Ya")){
            if (bimbinganP1 >= 6 && bimbinganP2 >=4) {
                pesan = "Semua Syarat Terpenuhi. Mahasiswa Boleh Mendaftar Ujian Skripsi";
            } else if (bimbinganP1 < 6 && bimbinganP2 < 4) {
                pesan = "Gagal! Log Bimbingan P1 Kurang Dari 6ya Kali Dan p2 Kurang Dari 4 Kali";
            } else if (bimbinganP1 < 6 ){
                pesan ="Gagal! Log Bimbingan P1 Belum Mencapai 6 Kali ";
            }else {
                pesan = "Gagal! Log Bimbingan P2 Belum Mencapai 4 Kali";
            }
        }else {
            pesan = "Gagal! Mahasiswa Masih Memiliki Tanggungan Kompen";
        }
        System.out.println(pesan);

    }
}
