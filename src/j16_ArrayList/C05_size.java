package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_size {
    public static void main(String[] args) {

        // size(); --- listtin eleman sayısını return eder *** arr deki lenght misali

        ArrayList<String> listsehir = new ArrayList<>(List.of("münih", "losangeles", "londra", "stockholm"));

        System.out.println("listsehir.size() = " + listsehir.size());


    }
}
