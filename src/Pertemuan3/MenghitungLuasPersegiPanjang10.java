package Pertemuan3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang10 {
    public static void main(String[] args) {

        Scanner Fariz = new Scanner(System.in);

        int panjang,lebar;
        float luas;

        System.out.print("Masukan Lebar = ");
        lebar = Fariz.nextInt();
        System.out.print("Masukan Panjang = ");
        panjang = Fariz.nextInt();

        luas = panjang * lebar;

        System.out.println("Luas Lapangan Sepak Bola Polinema = " + luas);

        Fariz.close();

    }
    
}
