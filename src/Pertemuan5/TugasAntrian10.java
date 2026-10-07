package Pertemuan5;
import java.util.Scanner;
public class TugasAntrian10 {
    public static void main(String[] args) {
        Scanner Fariz = new Scanner(System.in);
        int kode;
        System.out.print("Masukan Kode Layanan =");
        kode = Fariz.nextInt();
        switch (kode) {
            case 1:
                System.out.print("Legalisir Ijazah -Loket A ");
                break;
            case 2:
                System.out.print("Surat Keterangan Aktif Kuliah -Loket B");
                break;
            case 3 :
                System.out.println("Pembayaran ukt -Loket C");
                break;
            case 4 : 
                System.out.println("Pengajuan Cuti Akademik -Loket D3");
                break;
            default:
                System.out.println("Kode Layanan Tidak Dikenal");
                break;
        }

    }
    
}
