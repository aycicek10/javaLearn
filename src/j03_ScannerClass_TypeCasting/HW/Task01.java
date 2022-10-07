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
        System.out.println("mid-term grade:");
        int midtermgrade= sc.nextInt();

        
        Scanner input= new Scanner(System.in);
        System.out.println("final grade:");
        int finalgrade= sc.nextInt();


        Scanner scanner=new Scanner(System.in);
        System.out.println("project");
        int projectgrade= sc.nextInt();


        Scanner output=new Scanner(System.in);
        System.out.println("not ortalamanız:");
        double notortalaması= sc.nextDouble();
        System.out.println("not ortalaması = " + 78*0.4 + 66*0.5 + 90*0.2);


    }
}
