package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C02_nCopy {
    public static void main(String[] args) {

        ArrayList<String> listülke = new ArrayList<>(List.of("almanya", "amerigonya", "ingiltere", "isvec"));
        ArrayList<String> listsehir = new ArrayList<>(List.of("münih", "losangeles", "londra", "stockholm"));

        // nCopies(int, obj) --- int elemanlı bir obj den olusan list ataması yapıyor

        ArrayList<String> yeniList = new ArrayList<>(Collections.nCopies(7,"javacan"));
        System.out.println("yeniList = " + yeniList);

        // addAll(); -- bir list te diğer listi oldugu gibi ekler
        listülke.addAll(listsehir);// ülke list sonuna sehir list tamamen eklendi
        System.out.println("listülke = " + listülke);//listülke = [almanya, amerigonya, ingiltere, isvec, münih, losangeles, londra, stockholm]

listsehir.addAll(3,listülke);// 3. indexten itibaren ülke listi sehir liste tamamen eklendi
        System.out.println("listsehir = " + listsehir);


        //task --- 1den 10a kadar sayıları bir liste atayıp print eden code create ediniz

        ArrayList<Integer> listsayı = new ArrayList<>();// bos integer list

        for (int i = 1; i <=10 ; i++) {
            listsayı.add(i);


        } System.out.println("listsayı = " + listsayı);

















    }
}
