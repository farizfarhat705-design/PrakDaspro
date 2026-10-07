package Pertemuan6;
import java.util.Scanner;
public class operatorLogikaWifi10 {
    public static void main(String[] args) {
        Scanner Fariz = new Scanner(System.in);
        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;
        
        System.out.print("Apakah Pengguna Mahasiswa? (true/false):");
        mahasiswa = Fariz.nextBoolean();
        System.out.print("Apakah Pengguna Dosen ? (true/false) : ");
        dosen = Fariz.nextBoolean();
        System.out.print("Apakah Akun Sedang Di Blokir ? (true/false) :");
        akunDiblokir = Fariz.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses Wifi Diberikan");
        }else {
            System.out.println("Akses Wifi Di Tolak");
        }
    }
}
