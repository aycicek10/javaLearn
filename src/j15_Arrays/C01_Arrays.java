package j15_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        /*
Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
Array olusturulurken 2 seyi declare etmeliyiz:
1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
array= tepsiye benzer..
Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */

        // array tanımlama

        int a;// declare edilen ama atanmayan primitive data
        int Arr[];// declare edilen ama atanmayan int type array
        // tanımlanan array atama yapılmadan kullanılamaz

        String isimArr[]={"muharrem","enise","cebrail", " nazım", " özge"};// hem tanımlama hem atama yapılan String array

        int sayıARR[]=new int[5];// java haep memoryde 5 default - 0 olan int array create edildi
                                 //[0,0,0,0,0]


        // ARRAY a ELEMAN EKLEME

        sayıARR[2]=34;
        sayıARR[0]=35;
        sayıARR[1]=34;
        sayıARR[3]=61;
sayıARR[0]=34;// 0 index array  elemanı update edildi

      // *** array elemanları unique olmak zorunda değildir tekrarlı array elemanı olabilir

        // array eleman sayısı boyut değeri***
        System.out.println("sayıARR.length = " + sayıARR.length);// length 5
        //Array son elemanı ***
        System.out.println("isimArr.length = " + isimArr[isimArr.length-1] );// son eleman özge
        isimArr[isimArr.length-1]="qa özge";//arraay son eleman update edildi

        // aaray de olmayan eleman ***

        //okkalı bir trick ->> sayıARR[11]=23;//cte vermez ama olmayan eleman rte verir - array run time da oluşur

        // Array elemanları print etme ***

        for (int i = 0; i <isimArr.length ; i++) {
            System.out.println(isimArr[i] + " ");

        }


        System.out.println("isimArr = " + isimArr);//isimArr = [Ljava.l ang.String;@614c5515 -> isimArr referans değeridir

        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr));//isim array stringe cevrildi.

        // task -> sayıArr elemanlarından değeri tek olanları print eden code create ediniz

        for (int i = 0; i <sayıARR.length ; i++) {
            if (sayıARR[i]%2==1){
                System.out.println(sayıARR[i] + " ");
            }
        }

// task  -> sayıArr cift index elemanları print eden code create ediniz

        for (int i = 0; i <sayıARR.length ; i+=2) {
            System.out.print(sayıARR[i] + " ");
        }

        // task  -> isimArr 5 harfli elemanlarından olusan arrayın elemanlarını print eden code create ediniz

        String yeniArr[]=new String[isimArr.length];//isimarr elemanı kadar bos yeni arr
int koltukSayısı=0;
        for (int i = 0; i <isimArr.length ; i++) {
            if (isimArr[i].length()==5){
              koltukSayısı++; // yeniArr[i] = isimArr[i];
            }
        }
       // System.out.println(Arrays.toString(yeniArr));
        System.out.println(koltukSayısı);
    }
}
