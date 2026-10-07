package Pertemuan3;

import java.util.Scanner;

public class MenghitungTotalBayar10 {

    public static void main(String[] args) {

       Scanner Fariz = new Scanner(System.in);

       
       double diskon = 0.15 , jml_bayar,harga,potongan;
        
       System.out.print("Masukan Harga Baju = ");
       harga = Fariz.nextDouble();

       potongan=diskon*harga;
       jml_bayar = harga - potongan;

       System.out.println("Jumlah Yang Harus Di Bayar Adalah Rp. " + jml_bayar);

       Fariz.close();
    }
    
}
