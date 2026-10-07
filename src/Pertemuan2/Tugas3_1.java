package Pertemuan2;

/**
 * trhyju
 */
public class Tugas3_1 {

    public static void main(String[] args) {
        int gajiPokok = 5000000;
        int jumlahAnak = 4;
        int totalGajil = gajiPokok + (jumlahAnak * 100000);
        int danaPensiunan = totalGajil * 10/100;
        int gajiAkhir = totalGajil - danaPensiunan;
        System.out.println("total gaji = " + gajiAkhir);


    }
}