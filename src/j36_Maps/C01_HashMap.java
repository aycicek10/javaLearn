package j36_Maps;

import java.util.HashMap;

public class C01_HashMap {
    public static void main(String[] args) {
       /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir. Key değeri benzersiz(unique) olmalı
             dublicate kabul etnez
             Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
            null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
            HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri aralarina = sembolu konularak yazdirilir
            HashMap'ler tanımlanırken rastgele siralama yapar  HasMap map'ler arasinda en hizlisidir.
            HashMap'ler "thread safe" degildir.
 */


        HashMap<String,String> hm = new HashMap<>();

        // map.put() -- girilen key ve value datayı map' e eleman olarak ekler

        hm.put("amazon","296 euro");
        hm.put(null,"200 euro");//key null deger kabul eder
        hm.put(null,"222 euro");//tekrarlı key degerine value update edilir. Aynı key kullanılırsa uzerine atama yapılır
        hm.put("ebay",null);// value degeri null atanabilir
        hm.put("saturn","300 euro");
        hm.put("vatan","111 euro");
        hm.put("app store","333 euro");
        hm.put("app store","500 euro");// app store keydeki value 333 iken 500 olarak update edildi
        hm.put("mediamarkt","183 euro");

        System.out.println("hm = " + hm);


    }

}
