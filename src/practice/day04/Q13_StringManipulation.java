package practice.day04;

import java.util.Scanner;

public class Q13_StringManipulation {
    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("metin giriniz:");
        String str=sc.nextLine();

       if(str.length()==4){

           for (int i =str.length()-1; i >=0 ; i--) {
               System.out.print(str.charAt(i));
           }


       }else System.out.println("hatalı giriş");








    }

}