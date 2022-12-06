package j12_Loops.L01_ForLoop.Task;

import java.util.Scanner;


public class Task03_Factoriyel {
    public static void main(String[] args) {
        // task-- girilen sayının factoriyelini hesaplayan eden method create ediniz


        Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayı=sc.nextInt();

        fac(sayı);// int parametreli method call


    }// main sonu ***

    private static void fac(int sayı) {

        int fact=1;

        for (int i = 1; i <=sayı; i++) {
            fact*=i;

        }

        System.out.println("faktoriyel: "+ fact);
    }
}
