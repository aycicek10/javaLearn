package j04_AritmeticOperators;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("saniye giriniz");
        int s= sc.nextInt();
        System.out.println("dakika giriniz");
        int dk= sc.nextInt();
        System.out.println("saat giriniz");
        int saat= sc.nextInt();


        System.out.println("s= + (saat/3600) , (dk/60) ");







    }
}
