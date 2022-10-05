package j09_SwitchStatement;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */

		Scanner sc=new Scanner(System.in);
		System.out.println("ay giriniz: ");
		String ay= sc.nextLine();

		switch (ay){
			case "ocak":
				System.out.println("31gün");
			case "mart":
				System.out.println("31gün");
				case "mayıs":
				System.out.println("31gün");
			case "temmuz":
				System.out.println("31gün");
			case "ağustos":
				System.out.println("31gün");
			case "ekim":
				System.out.println("31gün");
			case "aralık":
				System.out.println("31gün");
			break;

			case "nisan":
				System.out.println("30gün");
			case "haziran":
				System.out.println("30gün");
			case "eylül":
				System.out.println("30gün");
			case "kasım":
				System.out.println("30gün");
				break;

			case "subat":
				System.out.println("yılınızı giriniz");
				int yıl= sc.nextInt();
				if (yıl%4==0){
					System.out.println("girilen ay 29 gün içerir");

				}else System.out.println("girilen ay 28 gün içerir");
				break;

			default:
				System.out.println("yanluş giriş");

		}














	}

}
