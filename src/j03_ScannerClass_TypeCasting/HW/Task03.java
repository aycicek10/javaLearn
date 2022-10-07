package j03_ScannerClass_TypeCasting.HW;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("günlük uyku saati:");
        int uykusaati= sc.nextInt();

        System.out.println("uykusaati = " + (uykusaati*30) / 24);
        System.out.println("uykusaati = " + (uykusaati*365) / 24);
        System.out.println("uykusaati = " + (uykusaati*365*40) / 24);

    }
}
