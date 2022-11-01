package practice.day05;

import java.util.Scanner;

public class Q03_MethodCreation {
    public static void main(String[] args) {
         /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */

        Scanner sc= new Scanner(System.in);
        System.out.println("cm giriniz: ");
        double cm = sc.nextDouble();

        System.out.println("metre(cm) = " + metre(cm));
        System.out.println("km(cm) = " + km(cm));
    }

    private static double km(double cm) {



        return cm/100000;
    }

    private static double metre(double cm) {



        return cm/100;
    }
}
