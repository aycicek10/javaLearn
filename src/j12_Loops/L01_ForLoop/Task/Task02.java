package j12_Loops.L01_ForLoop.Task;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

 /*
        girilen ifadenin polindrome olmasını kontrol eden method create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler


  */

Scanner sc=new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str=sc.nextLine();

        polindrome(str);


    }// main sonu

    private static void polindrome(String str) {
        String tersStr="";// bos bir string kutu
        for (int i = str.length()-1; i >=0 ; i--){
            tersStr+=str.charAt(i);// str nin i. karekterini tersstr ye ekler concat eder

        }
        System.out.println("girilen ifadenin tersi: " + tersStr);
        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("girilen ifade POLİNDROME");
        }else System.out.println("girilen ifade pol değil");


    }
}
