package j03_ScannerClass_TypeCasting.HW;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("vize1");
        int vize1= sc.nextInt();

        System.out.println("vize2");
        int vize2=sc.nextInt();

        System.out.println("final1");
        int final1= sc.nextInt();

        System.out.println("geçme notu: " + (((vize1 + vize2) / 2) * 0.3) + (final1 * 0.7));





    }
}
