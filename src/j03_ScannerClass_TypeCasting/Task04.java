package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("ad soyad giriniz: " );
        String adsoyad= sc.nextLine();
        System.out.println("yas giriniz: " );
        int yas= sc.nextInt();

        System.out.println("boy giriniz: ");
        double boy= sc.nextDouble();
        System.out.println("salona devam süresi: ");
        int süre= sc.nextInt();

        System.out.println("ücret = " + süre*20);
    }
}
