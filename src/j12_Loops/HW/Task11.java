package j12_Loops.HW;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
     Scanner sc = new Scanner(System.in);


           int toplam=0;
            int girilensayı=1;
            int tekrar=0;
        while (girilensayı!=0){
            System.out.println("sayı giriniz: ");
            girilensayı= sc.nextInt();

                toplam+=girilensayı;
                tekrar++;

            }

            System.out.println("0 (sıfır) girilene kadar girilen tum sayıların adedi : "+tekrar+"\nToplam : "+toplam);

        }



    }

