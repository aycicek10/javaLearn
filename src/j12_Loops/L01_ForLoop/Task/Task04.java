package j12_Loops.L01_ForLoop.Task;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
        girilen iki sayı arasındaki cift sayıları print eden code create ediniz
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("sayı1 giriniz: \nsayı2 giriniz: ");
        int sayı1=sc.nextInt();
        int sayı2=sc.nextInt();
        if (sayı1<sayı2){

        for (int i = sayı1; i <=sayı2 ; i++) {
            if(i%2==0){
                System.out.println(i+" ");
            }

        }

    }else System.out.println("hatalı giriş");


    }// *** main sonu ***



}
