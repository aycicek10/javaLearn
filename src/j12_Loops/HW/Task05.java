package j12_Loops.HW;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("isim giriniz: ");
		String isim=sc.nextLine();
		System.out.println("soyisim giriniz: ");
		String soyisim=sc.nextLine();
String birleşik=(isim+soyisim).replaceAll("\\s" ,"");

		int i=0;
		while (i<birleşik.length()){
			System.out.print(birleşik.charAt(i)+" ");
			i++;
		}

			}

		}





