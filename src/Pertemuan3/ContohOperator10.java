package Pertemuan3;

public class ContohOperator10 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x++ = " + x++);// 10
        System.out.println("Setelah Evaluasi, x = " + x);//11

         x = 10;
        System.out.println("++x = " + ++x);//11
        System.out.println("Setelah Evaluasi, x =" + x);//11

        int y = 12;
        System.out.println(x > y || y == x && y <= x);  

        int z = x ^ y ;
        System.out.println("Hasil x ^ y Adalah = " + z);

        z %= 2 ;
        System.out.println("Hasil Akhir " + z);
    }
}
