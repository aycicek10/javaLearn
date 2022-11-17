package okulYönetimi_Project;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class İslemler {

   static List<Kisi> ogrncListesi = new ArrayList<>();
   static ArrayList<Kisi> ogrtListesi = new ArrayList<>();
   static Scanner sc = new Scanner(System.in);
   static String kisiTuru;




public static void girisPaneli(){
   System.out.println("\nOGRENCI VE OGRETMEN YONETIM PANELI");
   System.out.println("1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\n0- CIKIS");
   System.out.print("Lutfen yapmak istediginiz islemi giriniz : ");
   int secim=sc.nextInt();

   switch (secim) {
      case 1:
         kisiTuru="OGRENCI";
         islemMenusu();
         break;
      case 2:
         kisiTuru="OGRETMEN";
         islemMenusu();
         break;
      case 0:
         cıkıs();
         break;
      default:
         System.out.println("hatalı giriş lütfen tekrar deneyiniz");
         girisPaneli();
         break;
   }
}

   private static void cıkıs() {
      System.out.println("Tesekkürler cıkıs yapıldı ");
   }

   private static void islemMenusu() {
    System.out.println("*** "+kisiTuru+" ISLEMLER ***\n1-EKLEME\n 2-ARAMA\n 3-LISTELEME\n 4-SILME\n 5-ANA MENU");
    System.out.print("islem tercihinizi giriniz : ");
      int secilenIslem = sc.nextInt();

      switch (secilenIslem) {
         case 1:
            ekle();
            islemMenusu();
            break;
         case 2:
            arama();
            islemMenusu();
            break;
         case 3:
            liste();
            islemMenusu();
            break;
         case 4:
            sil();
            islemMenusu();
            break;
         case 5:
            girisPaneli();
            break;
         default:
            System.out.println("hatalı giriş ");
            islemMenusu();

      }

   }

   private static void ekle() {
      System.out.println();
      System.out.println(kisiTuru);
      System.out.print("ad soyad giriniz : ");
      sc.nextLine();//dummy hayalet komut
      String adSoyad = sc.nextLine();
      System.out.print("kimlik No giriniz : ");
      String kimlikNo = sc.next();
      System.out.print("yas giriniz : ");
      int yas = sc.nextInt();

      if (kisiTuru.equalsIgnoreCase("ögrenci")){

      }

   }

   private static void arama() {
   }

   private static void liste() {
   }

   private static void sil() {
   }


}
