//60 + (10 mod 41)= 70
package Pertemuan12;
import java.util.Scanner;
public class ArrayNilai10 {
    public static void main(String[] args) {
      Scanner Fariz = new Scanner(System.in);
      
    int[] nilaiAkhir = new int[10];
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        nilaiAkhir[i] = input.nextInt();
    }
    for (int i = 0; i < nilaiAkhir.length; i++) {
    if (nilaiAkhir[i] > 70) {
        System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
    }
}
}   
}

