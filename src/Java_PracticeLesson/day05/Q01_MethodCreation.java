package Java_PracticeLesson.day05;

import java.util.Scanner;

public class Q01_MethodCreation {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz : ");
        String str = scan.nextLine().toLowerCase();


        System.out.println(xyzVarMı(str));


    }

    private static boolean xyzVarMı(String str) {
        if (str.contains("xyz")) {

            return true;
        } else
            return false;


    }
}
