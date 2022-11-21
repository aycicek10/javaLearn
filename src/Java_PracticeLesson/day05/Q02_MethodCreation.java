package Java_PracticeLesson.day05;

import java.util.Scanner;

public class Q02_MethodCreation {
    public static void main(String[] args) {

        /* Write a method named isEven that accepts an integer argument.
		 The method should return true if the argument is even, or false otherwise.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı girininiz:  ");
        int sayı = sc.nextInt();

        System.out.println("isEven(sayı) = " + isEven(sayı));
    }

    public static boolean isEven(int sayı) {
        if (sayı % 2 == 0) {

            return true;

        } else return false;
    }


}
