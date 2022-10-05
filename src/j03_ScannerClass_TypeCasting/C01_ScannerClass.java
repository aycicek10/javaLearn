package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {

        // 1.adım- scanner classtan obje create edilir

      //  Scanner scan= new Scanner(System.in); // scanner classından scan isminde değerini system içinden alan obj

        //  2.adım - kullanıcıda istenen veri için bildirimde bulunulur. sout("..");

      //  System.out.println("adınızı giriniz:");

        //3.adım -- kullancı girdiği veri data tipine göre bir variable a atanır

      //  String isim=scan.nextLine();//kullanıcıdan gelen string tipinde isim verisi scan obj ni nextLine methodu ile atandı

      //  System.out.println("isim = " + isim);

        Scanner sc=new Scanner(System.in);
      //  System.out.println("karenin kenarı giriniz");
     //   int kenar= sc.nextInt();

        /*
 Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
 Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
 1 seker = 1.7 gr
 Ornek : Input : cay sayisi : 10 seker sayisi :2
         Output : Yilda 12.41 kg seker kullaniyorsunuz
 */
       System.out.println("isim giriniz: ");
        //char ch=sc.nextLine().charAt(0); // kullanıcıdan gelen string ifadeden 0. index ilk karakterini alır

       // System.out.println("ch = " + ch);

        String isim=sc.nextLine(); // kullanıcının girdiği tüm satırı isim e atar ahmet ayçiçek alır
        String ad= sc.next(); // kullanıcının girdiği ilk ifadeyi ad a atar ahmet alır














    }
}
