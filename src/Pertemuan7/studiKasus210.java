package Pertemuan7;
import java.util.Scanner;

public class studiKasus210 {
    public static void main(String[] args) {
        Scanner Fariz = new Scanner(System.in);
        String namaMahasiswa, kegiatan;
        int dokumen, juara, statusPKM;

        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = Fariz.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        kegiatan = Fariz.nextLine();

        if (kegiatan.equalsIgnoreCase("BELMAWA") || kegiatan.equalsIgnoreCase("BAKORMA")
                || kegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen : ");
            dokumen = Fariz.nextInt();
            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan juara) : ");
            juara = Fariz.nextInt();

            if (juara >= 1 && juara <= 3) {
                if (dokumen == 4) {
                    System.out.println("Status : Dana penghargaan DIBERIKAN");
                } else {
                    System.out.println("Status : Tidak diberikan, dokumen tidak lengkap (kurang "
                            + (4 - dokumen) + " dokumen)");
                }
            } else {
                System.out.println("Status : Tidak diberikan, bukan juara 1, 2, atau 3");
            }

                }
    }
}