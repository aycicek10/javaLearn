package practice.day02;

import java.util.Scanner;

public class Q01_Modulus {
    // verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru yazdiriniz
    // Hint: use / and %
    //    input: 12345
    //    output: 1
    //            2
    //            3
    //            4
    //            5

    public static void main(String[] args) {
        int a=12345;

        System.out.println("birler: " +(a / 1) % 10);
        System.out.println("onlar: " +(a / 10) % 10);
        System.out.println("yüzler: " + (a / 100) % 10);
        System.out.println("binler: " +(a / 1000)%10);
        System.out.println("onbinler: " +(a / 10000)%10);

    }

}
