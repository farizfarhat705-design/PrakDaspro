package Pertemuan6;
import java.util.Scanner;
public class tugas2SeleksiAsisten10 {
    public static void main(String[] args) {
        Scanner Fariz = new Scanner(System.in);
        boolean mahasiswaAktif;
        boolean tidakDiSanksi;
        int nilaiDaspro;
        boolean punyaSertifikat;
        int nilaiWawancara;
        int minDaspro = 75 + (10 % 11);
        int minWawancara = 70 + (10 % 11);

        System.out.print("Apakah Mahasiswa Berstatus Aktif ? (true/false) :");
        mahasiswaAktif = Fariz.nextBoolean();
        System.out.print("Apakah Mahasiswa Tidak Sedang Mendapatkan Sanksi Akademik ? (true/false) :");
        tidakDiSanksi = Fariz.nextBoolean();
        System.out.print("Apakah Mempunyai Sertifikat ?");
        punyaSertifikat = Fariz.nextBoolean();
        System.out.print("Nilai DasPro :");
        nilaiDaspro = Fariz.nextInt();
        System.out.print("Nilai Wawancara :");
        nilaiWawancara = Fariz.nextInt();

        if (nilaiDaspro >85 || punyaSertifikat) {
            System.out.println("Syarat Terpenuhi");
        }else {
            System.out.println("Syarat Tidak Terpenuhi. Karena Nilai Daspro Dibawah 85 Atau Tidak Mempunyai Sertifikat ");
        }
        if (mahasiswaAktif && tidakDiSanksi && nilaiDaspro > 85 || punyaSertifikat) {
            System.out.println("Mahasiswa Akan Dipanggil Untuk Mengikuti Wawancara");   
        }else {
            System.out.println("Mahasiswa Tidak Di Panggil Untuk Wawancara. Karena Tidak Memenuhi Syarat");
        }
        if (nilaiWawancara > 70 + (10 % 11)) {
            System.out.println("Mahasiswa Diterimna Sebagai Asisten ");
        }else {
            System.out.println("Mahasiswa Tidak Diterima Menjadi Asisten. Karena Nilai Wawancara DI bawah 85");
        }
    }
}
