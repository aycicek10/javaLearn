package j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {

        //task- girilen bir pozitif tamsayının 2 veya daha fazla basamaklı olmasını kontrol edin

        Scanner sc=new Scanner(System.in);
        System.out.println("tamsayı giriniz");
        int sayı=sc.nextInt();

      //****  System.out.println((sayı > 9 ? "sayı iki veya daha fazla" : "tek bas"));

        String sonuc=sayı > 9 ? "sayı iki veya daha fazla" : "tek bas";
        System.out.println(sonuc);


    }
}
