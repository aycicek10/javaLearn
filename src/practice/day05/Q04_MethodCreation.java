package practice.day05;

import java.util.Scanner;

public class Q04_MethodCreation {
     /*
    Kullanicidan bir tam sayi alin.
    Bu sayinin negatif veya pozitif oldugunu,
    tek mi cift mi oldugunu ve
    uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
    100'den kucukse sadece birler basamagini yazdirin.

    */

     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("sayı giriniz: ");
          int sayı= sc.nextInt();

          System.out.println("pozitiffMi(sayı) = " + pozitiffMi(sayı));
          System.out.println("Q02_MethodCreation.isEven(sayı) = " + Q02_MethodCreation.isEven(sayı));
          System.out.println("rakamlarıToplamı(sayı) = " + rakamlarıToplamı(sayı));
          birlerBas(sayı);




     }

     private static void birlerBas(int sayı) {
          if (sayı<100){
               System.out.println(sayı%10);
          }
     }

     private static int rakamlarıToplamı(int sayı) {
          int birler = sayı%10, onlar =(sayı/10) %10, yuzler = sayı/100;
          int toplam =0;
          toplam = birler + onlar+ yuzler;
          return toplam;
     }

     private static boolean pozitiffMi(int sayı) {

          return sayı>0 ? true : false;
     }
}
