package Pertemuan10;
import java.util.Scanner;
public class Tugas110 {
    public static void main(String[] args) {
        Scanner Fariz = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = Fariz.nextInt();

        if (n < 1) {
            System.out.println("n minimal 1.");
        } else {
            int total = 0;
            for (int i = 1; i <= n; i++) {        
                for (int j = 1; j <= i; j++) {    
                    System.out.print(j + " ");
                    total++;
                }
                System.out.println();
            }
            System.out.println("Total angka tercetak: " + total);
        }
        Fariz.close();
    }
}