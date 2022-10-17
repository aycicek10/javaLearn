package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C10_Sort_Reverse {
    public static void main(String[] args) {
        // Collections.sort(list); -- verilen listi naturael sıralama yapar
        // Collections.reverse(list); -- verilen listin ters sıralamasını retrun eder

        ArrayList<String> listsehir = new ArrayList<>(List.of("münih", "losangeles", "londra", "stockholm"));

        System.out.println("listsehir = " + listsehir);// sıralama öncesi --listsehir = [münih, losangeles, londra, stockholm]

        Collections.sort(listsehir);// sort(); method sout içinde calısmaz

        System.out.println("listsehir = " + listsehir);// sıralama sonrası-- listsehir = [londra, losangeles, münih, stockholm]



        Collections.reverse(listsehir);

        System.out.println("listsehir = " + listsehir);// tersten sıralama

        ArrayList<String> listülke = new ArrayList<>(List.of("almanya", "amerigonya", "ingiltere", "isvec"));

        System.out.println("listülke = " + listülke);

        Collections.reverse(listülke);

        System.out.println("listülke = " + listülke);

    }
}
