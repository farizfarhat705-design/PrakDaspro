package Pertemuan2;

public class LuasTanah {


public static void main(String[] args) {

    int lebarTanah = 30 ;
    int panjangTanah = 100 ; 
    int diameter = 5 ; 
    int sisi = 2 ;
    double jari_jari = diameter/2;

    // total luas tanah persegi pangjang 
    int luasTanah = panjangTanah * lebarTanah ;
    // luas kolam (lingkaran)
    jari_jari = diameter/2 ;
    double luasKolam = 3.14 * jari_jari * jari_jari;
    //luas taman (persegi)
    int luasTaman = sisi * sisi;
    //luas total tanah yang di gunakan
    double luasYangDigunakan = luasKolam + luasTaman;
    //luas tanah yang tidak di gunakan 
    double luasYangTidakDigunakan = luasTanah - luasYangDigunakan;

    System.out.println(" Luas Tanah yang Tidak Digunakan =  " + luasYangTidakDigunakan  +  "meter" );


    }
}