package Java_PracticeLesson.day03;

import java.util.Scanner;

public class Q06_SwitchCase {
    /*
          * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
          * ornek
          *  Kullanici  : A , B , C harflerinden birini secsin
              A'yi secmis ise, ==> Java is easy
              B'yi secmis ise, ==> Java is fun
              C'yi secmis ise, ==> I need to study :)
          */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("harf seçiniz");
        char harf = sc.next().toUpperCase().charAt(0);

        switch (harf) {
            case 'A':
                System.out.println("java is easy");
                break;
            case 'B':
                System.out.println("java is fun");
                break;
            case 'C':
                System.out.println("i need to study");
                break;
            default:
                System.out.println("wrong entry");


        }

    }
}
