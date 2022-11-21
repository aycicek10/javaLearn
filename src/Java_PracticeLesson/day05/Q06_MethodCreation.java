package Java_PracticeLesson.day05;

import java.util.Scanner;

public class Q06_MethodCreation {
   /*
     Kullanıcıdan isim ve soyismini alın.
     Kullanıcının isim ve soyisminin ilk harflerini büyük
     diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.
     */



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("isim soyisim giriniz : ");
String isim= sc.nextLine();


        harfBuyuk(isim);
    }

    private static void harfBuyuk(String isim) {


    }
}
