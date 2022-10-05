package j09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

        //task// girilen haftanın gününü hafta içi veya hafta sonu oldugunu print eden code yazınız.


        Scanner sc=new Scanner(System.in);
        System.out.println("gün giriniz");
        String gün= sc.next().toLowerCase();

        switch (gün){
            case "ptesi":
            case "salı":
            case "crsmba":
            case "prsmbe":
            case "cuma":
                System.out.println("hafta içi");
                break;
            case "ctesi":
            case "pazar":
                System.out.println("hafta sonu");
                break;

            default:
                System.out.println("yanlış giriş");



        }





































    }
}
