package j09_SwitchStatement;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz

		Scanner sc=new Scanner(System.in);
		System.out.println("harf giriniz");

		String VIP=sc.nextLine();

		switch (VIP){
			case "V":
				System.out.println("VERY");
				break;
			case "I":
				System.out.println("IMPORTANT");
				break;
			case "P":
				System.out.println("PERSON");
				break;

			default:
				System.out.println("yanlış giriş");


		}



	}
}
