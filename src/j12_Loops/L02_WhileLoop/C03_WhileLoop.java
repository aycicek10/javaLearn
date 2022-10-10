package j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

        //task -> girilen tamsayıyı tam bölen sayısını printeden code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayı = sc.nextInt();
        int bolenSayı=1;
        int tamBolenAdedi=0;
        while(bolenSayı<=sayı){

            if (sayı%bolenSayı==0){
                tamBolenAdedi++;

            }
            bolenSayı++;

        }
        System.out.println("agam girdiğin " +sayı+"nın "+tamBolenAdedi+"kadar boleni var ");
    }
}
