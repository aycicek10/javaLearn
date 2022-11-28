package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_match {
    public static void main(String[] args) {
        //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
        //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
        //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "melemen", "cacix", "kokerç", "yağlama", "güveç", "arabAşı", "tantuni"));
harfSayısı7denazKontrol(menu);
        System.out.println("  **************  ");
wBaslayanKontrol(menu);
        System.out.println("  **************  ");
xIleBiten(menu);


    }// main sonu
// Task : List elemanlarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.

public static void harfSayısı7denazKontrol( List<String> menu){

         boolean kontrol = menu.stream().allMatch(t->t.length()<=7);
        if (kontrol){
            System.out.println("agam menudekiler 7 ve daha az harften olusuyor");
        }else
            System.out.println("agam menudekiler 7 karakterden fazlar");

}
// Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.

    public static void wBaslayanKontrol(List<String> menu){
        System.out.println(menu.stream().noneMatch(t -> t.startsWith("w"))
                ? "agam w ile baslayan yemaag olur mu"
                : "agam wenenem ne wenem sey");

    }

    // Task : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.

    public static void xIleBiten(List<String> menu){
        System.out.println(menu.stream().anyMatch(t -> t.endsWith("x"))
                ? "agam senden bi cacix olmaz"
                : "agam senin yemah bu diyarda yoggg");

    }



}
