package j12_Lopps.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("sayı1 giriniz: \nsayı2 giriniz: ");
        int sayı1 = sc.nextInt();
        int sayı2 = sc.nextInt();
        int toplam = 0;
        for (int i = sayı1; i <=sayı2 ; i++) {

            toplam+=i;
            }

        System.out.println("toplam = " + toplam);

    }

    }
