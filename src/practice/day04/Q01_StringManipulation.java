package practice.day04;

import java.util.Scanner;

public class Q01_StringManipulation {

    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("isim giriniz: \nsoyisim giriniz: ");
        String isim= sc.nextLine();
        String soyisim= sc.nextLine();

        System.out.println(isim.concat(" "+ soyisim).toUpperCase());
    }


}
