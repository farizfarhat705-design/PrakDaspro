package Pertemuan10;
import java.util.Scanner; 
public class Triangle10 {
    public static void main(String[] args) {
        Scanner Fariz = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = Fariz.nextInt();

        int i = n;
        while (i > 0) {
            System.out.print("[i=" + i + "] ");
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
             System.out.println();
            i--;
        }
        Fariz.close();

    }
 }

