//Percobaan 1 (uji wajibtambahan)
//bil[0], bil[1], bil[2], bil[3]
//10,18,-4,30
package Pertemuan12;

import java.util.Arrays;

public class ArrayBilangan10 {
    public static void main(String[] args) {
        int[] bil = new int[4];
        bil[0] = 10;
        bil[1] = 18;
        bil[2] = -4;
        bil[3] = 30;    

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }
        for (int nilai : bil) {
            System.out.println(nilai);
            }
        System.out.println(Arrays.toString(bil));
    }
}
