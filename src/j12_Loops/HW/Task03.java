package j12_Loops.HW;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
int sayı=13;

		for (int i = sayı; i ==13 ; i++) {
			for (int j = 1; j <11; j++) {
				System.out.println(i+ "x" +j+ "="+(i*j));


			}System.out.println();
		}
	}

}
