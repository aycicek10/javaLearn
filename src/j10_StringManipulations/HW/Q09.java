package j10_StringManipulations.HW;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */

Scanner sc=new Scanner(System.in);
        System.out.println("cümle giriniz: ");
        String cümle=sc.nextLine();
        System.out.println(cümle.substring(0, 4));


    }
}
