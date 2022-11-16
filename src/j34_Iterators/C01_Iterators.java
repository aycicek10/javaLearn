package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterators {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("nur","gamze","erol","bekir"));

        System.out.println("l1 list ilk hali : " + l1);

        // l1 elemanlarını for loop kullanarak print ediniz

        for (int i = 0; i <l1.size() ; i++) {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println(" *** ");

        // for each ile print ediniz

        for (String a:l1){
            System.out.print(a+" ");
        }

        // her bir elemanı :) for loop

        for (int i = 0; i <l1.size() ; i++) {
            l1.set(i, l1.get(i)+":)");
            System.out.print(l1.get(i));
        }

        /*
        index desteklemeyn yapılarda tekrarlayan  aksiyon için for-each lopp update yapamaybilir yukarıdaki task'de oldugu gibi
        Bu durumda java ıterator intarface'den tanımlanacak variable ile takrarlayan aksiyonlar index olmadan yapılır.
         */

        System.out.println();
        System.out.println("   *** Iterators ***   ");

        Iterator<String > it1=l1.iterator();//Iterator intface'den it1 variable tanımlandı .Atama olarak l1 elemanları atandı
        while(it1.hasNext()){
            //hasNext()->it1 elamanları için pointer old yerde elekman varsa true yoksa false verir ve pointer bir sonrakı elelman önüne koyulur
            // next()-> list'in pointer önündeki  elemnını return eder
            System.out.print(it1.next()+" ");//Nur :-)  Gamze :-)  Erol :-)  Bekir :-)


    }
}
