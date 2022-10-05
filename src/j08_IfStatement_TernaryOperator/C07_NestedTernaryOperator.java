package j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {

        /* task
        girilen bir pozitif tamsayı 4 basamaklı ise "4 basamaklı" print eden
        4 basamaklı değilse çift olup olmadığını kontrol edip. çift ise "4 basamaklı olmayan çift sayı"
        çift değilse "4 basamaklı olmayan tek sayı yazdırın"
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("tamsayı giriniz");
        int sayı=sc.nextInt();


        System.out.println(sayı>999 && sayı<10000 ? "4 basamaklı" : (sayı % 2 == 0 ? "4 bas olmayan çift sayı" : "4 bas olmayan tek "));


    }
}
