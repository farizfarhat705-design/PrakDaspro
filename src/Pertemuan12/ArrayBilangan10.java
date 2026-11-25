//Percobaan 1 (uji wajibtambahan)
//bil[0], bil[1], bil[2], bil[3]
//10,18,-4,30
package Pertemuan12;

import java.util.Arrays;

public class ArrayBilangan10 {
    public static void main(String[] args) {
        int[] bil = {10, 18, -4, 30};

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));
        }
        for (int nilai : bil) {
            System.out.println(nilai);
            }
        System.out.println(Arrays.toString(bil));
    }
}
