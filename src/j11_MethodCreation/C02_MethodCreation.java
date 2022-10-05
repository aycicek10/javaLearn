package j11_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //task-- girilen 3 notun ortalamasını hesaplayan method create ediniz

        Scanner sc=new Scanner(System.in);

        System.out.println("1. notunuzu giriniz: ");
        double n1=sc.nextInt();
        System.out.println("2. notunuzu giriniz: ");
        double n2=sc.nextInt();
        System.out.println("3. notunuzu giriniz: ");
        double n3=sc.nextInt();

        double ortalamaHesapla=ortalamaHesapla(n1,n2,n3);


        System.out.println(ortalamaHesapla);

    }//**** main sonu *****


    public static double ortalamaHesapla(double a, double b, double c) {
        return ((a+b+c)/3);
    }


}
