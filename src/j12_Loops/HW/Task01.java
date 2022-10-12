package j12_Lopps.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */


        boolean flag = true;
        int count = 0;
        int toplam = 0;
        while (flag) {
            Scanner sc = new Scanner(System.in);
            System.out.println("sayı giriniz: ");
            int sayı = sc.nextInt();
            count++;
            toplam += sayı;
            if (toplam >= 333) {
                flag = false;
            }

            System.out.println("girdiğiniz sayı adedi: " + count + " \ngirdiğiniz sayıların toplamı: " + toplam);

        }
    }
}
