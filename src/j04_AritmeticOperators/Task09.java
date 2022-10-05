package j04_AritmeticOperators;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("inek adedi: ");
        int i= sc.nextInt();
        System.out.println("tavuk adedi");
        int t= sc.nextInt();
        System.out.println("koyun adedi");
        int k=sc.nextInt();


        System.out.println("toplam ayak= " + ((i*4)+(t*2)+(k*4)));


    }

}




