package j12_Loops.HW;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz
        Scanner sc = new Scanner(System.in);


        boolean flag=true;

        while (flag) {
            System.out.println("5 adet sayı giriniz");
            int sayı = sc.nextInt();

            System.out.println(sayı + " en büyük");

            sayı++;


            }


        }
    }








