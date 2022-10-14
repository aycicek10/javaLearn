package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        // indexOf(); --- list içinde istenen elemanın index değerini retun eder

        ArrayList<String> listülke = new ArrayList<>(List.of("almanya", "amerigonya", "ingiltere", "isvec"));
        ArrayList<String> listsehir = new ArrayList<>(List.of("münih", "losangeles", "londra", "stockholm"));

        System.out.println("listsehir.indexOf(\"londra\") = " + listsehir.indexOf("londra"));
        System.out.println("listsehir.indexOf(\"londra\") = " + listsehir.indexOf("angara"));// liste olmayan eleman indexi -1 return eder

        listülke.add("amerigonya");
        System.out.println("listülke = " + listülke);
        System.out.println("listülke.indexOf(\"amerigonya\") = " + listülke.indexOf("amerigonya"));// tekrarlı elemanlarda soldan(bastan) ilk bulunan eleman indexi return eder

        System.out.println("listülke.lastIndexOf(\"amerigonya\") = " + listülke.lastIndexOf("amerigonya"));//sağdan(sonda) ilk bulunan elemanı indexi return eder


    }
}
