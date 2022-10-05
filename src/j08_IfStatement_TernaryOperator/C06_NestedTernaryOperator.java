package j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {

      /* TASKK
       kullanıcıdan bir sayı alınız
       sayı 0dan büyük esit ise 10dan küçük olup olamıdgını kontrol ediniz
       10dan kucuk ise ekrana "rakam" yazdırınız değilse "pozitif sayı yazdırınız"
       Sayı 0 dan kücük ise ekrana "negatif sayı" yazdırın
       */


        Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı=sc.nextInt();

        System.out.println((sayı >= 0 ? (sayı < 10 ? "rakam" : "pozitif sayı") : "negatif sayı"));



    }
}
