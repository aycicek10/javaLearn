package j09_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        /*
        Switch case deyimi işlev bakımından if deyimine çok benzemektedir.
        Çok sayıda if işlem blokları kullanfığımızda programın okunurluğu azalacak ve
        programı izlemek zorlasacaktır. Programınızın bir değeri birçok değerle
        karsılaştırmak gerektiğinden switch komutu kullanacağız. Switch seceneği ile
        değişkenin durumuna göre birçok durum içerisinden bir tanesi gerceklestirilir
        İstersek de if deyimi ile Switch case yi birlikte kullanabiliriz
        Switch in yaptıgı iş kısaca ifadenin değerini sırayla sabitlerle karsılararak ve her satır
        çok sayıda kosul içeren durumlarda switch kullanmak if e göre programınızın daha hızlı çalışma
        bunun haricinde iki  koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor
         */

        // trick*** Switch de long double float ve boolean kullanılamaz****

        // task - kullanıcının girdiği rakamı yazı ile print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("rakam giriniz: ");
        int rakam=sc.nextInt();

        switch (rakam){
            case 0:
                System.out.println("girilen rakam SIFIR");
                break;
            case 1:
                System.out.println( "girilen rakam BİR");
                break;
            case 2:
                System.out.println("girilen rakam İKİ");
                break;
            case 3:
                System.out.println("girilen rakam ÜÇ");
                break;
            case 4:
                System.out.println("girilen rakam DÖRT");
                break;
            case 5:
                System.out.println("girilen rakam beş");
                break;

            case 6:
                System.out.println("girilen rakam altı");
                break;

            case 7:
                System.out.println("girilen rakam yedi");
                break;
            case 8:
                System.out.println("girilen rakam sekiz");
                break;
            case 9:
                System.out.println("girilen rakam dokuz");
                break;







            default:
                System.out.println("yanlış giriş");
        }




























    }

}
