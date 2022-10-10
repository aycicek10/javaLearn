package j12_Loops.HW;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayı = sc.nextInt();
        for (int i = 0; i <sayı ; i++) {
            
            if (i%2==1){
                System.out.println("i = " + i);
            }
            
        }

    }
}
