package j12_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        // task-> girilen sayı 17den küçük ise kazandınız büyük ise kaybettiniz print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayı=0;
        do {
sayı= sc.nextInt();

            System.out.println(sayı+" icin kazandınız");
            sayı++;

        }while (sayı>17);
        System.out.println(sayı+ " icin kaybettiniz");

    }
}
