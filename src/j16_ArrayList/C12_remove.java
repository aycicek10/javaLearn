package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {
        //remove() -- listten istenen eleman siler

        ArrayList<String> listsehir = new ArrayList<>(List.of("münih", "losangeles", "londra", "stockholm"));

        System.out.println("listsehir.remove(\"angara\") = " + listsehir.remove("angara"));//false
        System.out.println("listsehir.remove(\"londra\") = " + listsehir.remove("londra"));//true
        System.out.println("listsehir.remove(1) = " + listsehir.remove(1));//losangeles

        System.out.println("listsehir = " + listsehir);// son hali listsehir = [münih, stockholm]

        // tekrarlı eleman varsa ilk index eleman silinir diğerlerine bişey olmaz

        ArrayList<String> listülke = new ArrayList<>(List.of("almanya", "amerigonya", "ingiltere", "isvec"));

        listsehir.addAll(listülke);// sehirlist ülkeliste eklendin
        System.out.println("listsehir = " + listsehir);

        listsehir.removeAll(listülke);//sehirlistte ülkelist cıkarıldı
        System.out.println("listsehir = " + listsehir);// ülkelist cıkarılmıs hali


    }
}
