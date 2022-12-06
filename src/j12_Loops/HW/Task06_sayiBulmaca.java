package j12_Loops.HW;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        int deger = (int) (Math.random() * 25);

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.println("deger = " + deger);


        int tahmin;
        do {
            System.out.println("sayıyı  tahmin ediniz: ");
            tahmin = scanner.nextInt();
            if (tahmin > deger) {
                System.out.println("asağı gidiniz ");
            } else if (tahmin < deger) {
                System.out.println("yukarı gidiniz");
            } else
                System.out.println("tebrikler bildiniz ***");
            count++;



        } while (tahmin != deger);
        System.out.println("count = " + count);
















    }

}
