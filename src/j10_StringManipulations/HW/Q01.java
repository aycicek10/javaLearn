package j10_StringManipulations.HW;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("cümle giriniz");
        String cümle=sc.nextLine();

        System.out.println(cümle.contains(" "));


    }
}

