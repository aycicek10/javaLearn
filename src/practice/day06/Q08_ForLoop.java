package practice.day06;

import java.util.Scanner;

public class Q08_ForLoop {
    // Kullanicidan iki sayi isteyin.
    // Girilen sayilar ve aralarindaki tum
    // tamsayilari toplayip, sonucu yazdiran bir program yaziniz
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sayı1 giriniz: \nsayı2 giriniz: ");
        int sayı1 = sc.nextInt();
        int sayı2 = sc.nextInt();
int toplam=0;
if(sayı1<sayı2) {
    for (int i = sayı1; i <= sayı2; i++) {

        toplam += i;
    } System.out.println("toplam1 = " + toplam);

} else if (sayı1>sayı2) {
    for (int i = sayı2; i <= sayı1; i++) {

        toplam += i;
    } System.out.println("toplam2 = " + toplam);


}


    }
}
