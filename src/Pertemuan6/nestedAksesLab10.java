package Pertemuan6;
import java.util.Scanner;
public class nestedAksesLab10 {
    public static void main(String[] args) {
        Scanner Fariz = new Scanner(System.in);
        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Mahasiswa Aktif ? (true/false) :");
        mahasiswaAktif = Fariz.nextBoolean();
        System.out.print("Sedang Di Sanksi ? (true/false) : ");
        sedangDisanksi = Fariz.nextBoolean();
        System.out.print("Punya Izin Dosen ? (true/false) ?");
        punyaIzinDosen = Fariz.nextBoolean();
        System.out.print("Asisten Lab ? (true/false) :");
        asistenLab = Fariz.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses Labotarium Diberikan");
            } else {
                System.out.println("Akses Ditolak : Membutuhkan Izin Dosen Atau Status Asisten  Lab");
            }
        }else {
            System.out.println("Akses Ditolak : Status Mahasiswa Tidak Memenuhi Syarat");
        }

    }
}
