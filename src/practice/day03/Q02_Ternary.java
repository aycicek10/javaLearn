package practice.day03;

import java.util.Scanner;

public class Q02_Ternary {
    public static void main(String[] args) {
        int fiyat = 25;
        String reult = ((fiyat < 10 ? "ucuz" : fiyat <20 ? "normal" : "pahalı"));
        System.out.println("reult = " + reult);

//? ise demek :değilse
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */

    }
}
