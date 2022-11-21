package Java_PracticeLesson.day04;

import java.util.Scanner;

public class Q11_StringManipulation {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("ad giriniz: ");
        String ad=sc.nextLine();
        System.out.println("soyad giriniz: ");
        String soyad=sc.nextLine();

        if (ad.length()>soyad.length()){
            System.out.println("adınız daha uzun ");
        }else System.out.println("soyadınız daha uzun");

    }
}