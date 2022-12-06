package j12_Loops.HW;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner sc = new Scanner(System.in);
        int x = 0;

        String metin;
        do {

            System.out.println("metin giriniz");
            metin = sc.nextLine();

            if (metin.charAt(0) == 'x') {
                System.out.println("javatar");
            } else System.out.println("javacan");

            x++;


        } while (!metin.equalsIgnoreCase("x"));

    }
}
