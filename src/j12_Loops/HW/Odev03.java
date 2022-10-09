package j12_Loops.HW;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayı = sc.nextInt();


        getAsalMı(sayı);


    }

    private static void getAsalMı(int sayı) {


        for (int i = 2; i < sayı; i++) {
            if (sayı % i == 0) {

                System.out.println(true);

            } else System.out.println(false);

        }


    }
}





