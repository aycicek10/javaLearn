package Java_PracticeLesson.day02;

import java.util.Scanner;

public class Q02_Modulus {

    /*
     *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */

    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayı=sc.nextInt();

        System.out.println(((sayı / 1000)/10)+((sayı / 1000)%10) + ((sayı%100)/10)+((sayı%100)%10));


    }
}
