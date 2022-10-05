package j11_MethodCreation.HW;

import java.util.Scanner;

public class Task03_1 {
    public static void main(String[] args) {
        //task-- girilen iki sayıyı seçilen dört işleme göre hesaplayan method create edidiniz.


        Scanner sc=new Scanner(System.in);
        System.out.println("1. sayıyı giriniz: ");
        int a= sc.nextInt();
        System.out.println("2.sayıyı giriniz: ");
        int b=sc.nextInt();
        System.out.println("işleminizi giriniz: ");
        char islem=sc.next().charAt(0);










islemMenu(islem, a , b);




    }//***** MAİN SONU *****
public static void islemMenu(char islem, int x,int y){
        switch (islem){
            case '+':
                topla(x,y);
                break;
            case '-':
                cıkar(x,y);
                break;
            case '*':
                carp(x,y);
                break;
            case '/':
                böl(x,y);
                break;
            default:
        }
}

public static void topla(int a, int b){
    System.out.println("a+b = " +(a+b));
}
    public static void cıkar(int a, int b){
        System.out.println("a-b = " +(a-b));
    }
    public static void carp(int a, int b){
        System.out.println("a*b = " +(a*b));
    }
    public static void böl(int a, int b){
        System.out.println("a/b = " +(a/b));
    }



}
