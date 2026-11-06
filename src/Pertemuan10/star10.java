package Pertemuan10;
import java.util.Scanner;
public class star10 {
    public static void main(String[] args) {
        Scanner Fariz = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = Fariz.nextInt();

           for (int i = 1; i <= n; i += 2) {
             System.out.print(i + " ");
        }
        System.out.println();
        Fariz.close();
    }
}
