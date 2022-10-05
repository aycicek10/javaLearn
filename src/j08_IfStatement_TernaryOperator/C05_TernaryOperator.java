package j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {

       /*task- girilen bir tamsayı çiftse yarısını değilse
        girilen sayı tek oldugu için yarısı tamsayı değildir. print eden code create edin

        */

        Scanner sc=new Scanner(System.in);
        System.out.println("tamsayı giriniz");
        int sayı= sc.nextInt();

        System.out.println((sayı % 2 == 0 ? sayı / 2 : "tek değil"));


        /* trick
        ternary iki durum için farkılı data type çıktısı veriyorsa variable atama
        yapmaz ya da ternary çıktısı aynı data type serializable edilmel
         */


























    }
}
