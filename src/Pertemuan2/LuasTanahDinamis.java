package Pertemuan2;

import java.util.Scanner;

public class LuasTanahDinamis {


public static void main(String[] args) {

    Scanner Fariz = new Scanner(System.in);

    int lebarTanah,luasTaman,sisi,panjangTanah,luasTanah;
    double luasKolam,diameter,luasYangTidakDigunakan,luasYangDigunakan;

    System.out.print("Panjang Tanah Yang Dimiliki = ");
    panjangTanah = Fariz.nextInt();
    System.out.print("Lebar Tanah Yang Dimiliki =");
    lebarTanah = Fariz.nextInt();
    System.out.print("Diameter Tanah Yang Digunakan =");
    diameter = Fariz.nextInt();
    System.out.print("Panjang Tanah yang Digunakan = ");
    sisi = Fariz.nextInt();

    // total luas tanah persegi pangjang 
     luasTanah = panjangTanah * lebarTanah ;
    // luas kolam (lingkaran)
     luasKolam = diameter ;
     luasKolam = 3.14 * diameter * diameter/4;
    //luas taman (persegi)
     luasTaman = sisi * sisi;
    //luas total tanah yang di gunakan
     luasYangDigunakan = luasKolam + luasTaman;
    //luas tanah yang tidak di gunakan 
     luasYangTidakDigunakan = luasTanah - luasYangDigunakan;

    System.out.println(" Luas Tanah yang Tidak Digunakan =  " + luasYangTidakDigunakan  +  "meter" );

    Fariz.close();


    }
}