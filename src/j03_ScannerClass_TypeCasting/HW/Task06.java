package j03_ScannerClass_TypeCasting.HW;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
        
        Scanner sc=new Scanner(System.in);
        System.out.println("x");
        double x= sc.nextInt();
        System.out.println("y");
        double y= sc.nextInt();



        System.out.println("hipotenüs= " +Math.sqrt ((x*x) + (y*y)) );
        
        
        
        





    }
}
