package j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifelseStatment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("yasınızı giriniz");

        int yas = sc.nextInt();
//girilen yasın 18 den  büyüklüğünü kontrol eder

        if (yas > 18) {

            System.out.println("yasınız 18 den buyuk");
        } else {
            System.out.println("ehliyet alamazsınız");

        }


    }
}


