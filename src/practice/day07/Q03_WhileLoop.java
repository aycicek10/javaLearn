package practice.day07;

import java.util.Scanner;

public class Q03_WhileLoop {
    /*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayı = sc.nextInt();
        int count=0;
        while (sayı>0){
            if (sayı%2!=0){
                System.out.println(sayı+" ");
                count++;

            }

            sayı--;

        }System.out.println("girilen sayı = " + count);






    }
}
