package j03_ScannerClass_TypeCasting.HW;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */

        Scanner sc=new Scanner(System.in);
        System.out.println("vize giriniz");
        int vize = sc.nextInt();

        System.out.println("final giriniz");
        int finaln = sc.nextInt();

        System.out.println("proje giriniz");
        int proje = sc.nextInt();

       double notOrt= ((vize*0.3)+(finaln*0.5)+(proje*0.2));

        System.out.println("notOrt = " + notOrt);

    }
}
