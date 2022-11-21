package Java_PracticeLesson.day04;

import java.util.Scanner;

public class Q12_StringManipulation {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("metin giriniz:");
        String str=sc.nextLine();

        if (str.contains(" ")){
            System.out.println("boslık var");
        }


        if (str.equals("")){

            System.out.println("str boş");
        }else System.out.println("str bos değil");


    }






}