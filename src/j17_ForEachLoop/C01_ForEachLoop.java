package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {

       /*
       for each loop for loopun gelişmiş halidir
       1 - clean code - yazım kolaylığı
       2- code okuma kolaylığı
       3- hata yapma riskini azaltır
        */

        List<Integer>sayıList=new ArrayList<>(List.of(16,5,2,33,22,27,41,24));

        // task -- list elemanlarını ayrı satırlarda print edeiniz

        for (int i = 0; i <sayıList.size() ; i++) {
            System.out.println("sayıList.get(i)+\" \" = " + sayıList.get(i) + " ");
        }


      for (Integer a:sayıList){
          System.out.println("a = " + a);
      }

      // task -- list elemanların ilk üc eleman haric tek olanları print ediniz
        System.out.println("**** task 2 *****");
        for (Integer a: sayıList.subList(3,sayıList.size())){

            if (a%2==1){
                System.out.println("a = " + a);
            }
        }

        System.out.println(" **** task 3 ****");
        // task -- list elemanlarının 2 ile 5 index arrasındaki elemanların toplamını print eden code create ediniz
        int toplam=0;
        for (Integer a: sayıList.subList(2,6)) {
            toplam += a;

        }
        System.out.println("toplam = " + toplam);


    }
}
