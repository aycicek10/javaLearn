package j04_AritmeticOperators;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("üç basamaklı sayı giriniz");
        int sayı= sc.nextInt();

        System.out.println("yüzler basamağı: " + (sayı/100) + "onlar basamağı: " + ((sayı%100)/10) + "birler basamağı: " + (sayı%10));



    }
}
