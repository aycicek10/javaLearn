package j09_SwitchStatement;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı sayıyı kelime olarak print eden code create ediniz..


        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int sayi = scan.nextInt();


        switch (sayi) {
            case 0:
                if (sayi==0)
                System.out.println("sıfır");
                break;
            case 1:
                if (sayi==1)
                System.out.println("bir");
                break;
            case 2:
                if (sayi==2)
                System.out.println("iki");
                break;


        }
    }
}