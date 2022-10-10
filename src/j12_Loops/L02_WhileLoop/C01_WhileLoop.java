package j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

        /*
        baslangıc ve bitis değerleri net (bilinen değerler) olan tekrarlarda for loop ama adım sayısı belli
        olmayıp bir şart ya da bir duruma baağlı olan tekrarlarda while loop kullanılır
         */
        //task01-> 11 den 20 ye kadar olan tam sayıları print eden code create ediniz


        for (int i = 11; i < 21; i++) {
            System.out.print(i + " ");
        }
        int basla = 11;
        while (basla < 21) {
            System.out.print(basla + " ");
            basla++;
        }
        // task2 -> 7 kere javacan print eden code create ediniz

        int t = 1;
        while (t < 8) {
            System.out.println(t + ". javacan" + " ");
            t++;
        }
//task 3 -> iki basamaklı tek sayıları print eden code create ediniz

        int b = 11;
        while (b < 100) {
            System.out.println(b + " ");
            b += 2;


        }

        // task04 -> girilen metni tersten print eden code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("metin giriniz : ");
        String str = sc.nextLine();
        int kelimeUzunluk = str.length();
        while (kelimeUzunluk >= 1) {
            System.out.println(str.charAt((kelimeUzunluk - 1)));

            kelimeUzunluk--;
        }
// task 05 -> girilen sayıya kadar tam sayı toplamını print eden kod create ediniz


        System.out.println("sayı giriniz : ");
        int sayı = sc.nextInt();
        int toplam = 0;
        while (sayı > 0) {

            toplam += sayı;
            sayı--;
            System.out.println("toplam : " + toplam);


        }
        // task 06  -> girilen sayının faktoriyelini  print eden kod create ediniz
        int faktoriyel = 1;

        while (sayı > 0) {

            faktoriyel *= sayı;
            sayı--;
            System.out.println("faktoriyel : " + faktoriyel);


        }
    }
}