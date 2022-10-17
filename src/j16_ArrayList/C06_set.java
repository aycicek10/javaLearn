package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {
    public static void main(String[] args) {
        // set(); --- listin istenen indexe istenen elemana update eder
        ArrayList<String> listsehir = new ArrayList<>(List.of("münih", "losangeles", "londra", "stockholm"));
        System.out.println("listsehir.set(3, \"angara\") = " + listsehir.set(3, "angara"));// stockholm -- set edilen değer print edilir

        System.out.println("listsehir = " + listsehir);// list set edilmiş hali print edildi

       // System.out.println("listsehir.set(11,\"patagonya\") = " + listsehir.set(11, "patagonya"));// olmayan index set edilirse ret verir
        System.out.println("listsehir = " + listsehir);

        // listsehir.set(1,"bursa",2,"izmir"); -- list te coklu set metodu calısmaz cte hatası verir



    }
}
