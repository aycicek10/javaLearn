package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {
       // contains(); -- method listte istenen elemanın varlığını kontrol eder true/false return eder

        ArrayList<String> listsehir = new ArrayList<>(List.of("münih", "losangeles", "londra", "stockholm"));

        System.out.println("listsehir.contains(\"angara\") = " + listsehir.contains("angara"));//false
        System.out.println("listsehir.contains(\"münih\") = " + listsehir.contains("münih"));//true


    }
}
