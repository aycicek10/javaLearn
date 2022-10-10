package j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        // task -> girilen tam sayının rakamları toplamını print eden method create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayı = sc.nextInt();


        System.out.println(rakamTopla(sayı));


    }// *** main sonu ***

    private static int rakamTopla(int sayı) {
       int rakamToplamı=0;
        while(sayı>0){
           rakamToplamı+=sayı%10;// sayının birler bas rakamToplamına ekledik
            sayı/=10;// sayı bir basamak eksiltildi
       }


        return rakamToplamı;
    }
}
