package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {
    public static void main(String[] args) {
        // get(); --- listte istenen index elemanı return eder (arr[3]- arr'in 3 .indexteki elemanı ver

        ArrayList<String> listsehir = new ArrayList<>(List.of("münih", "losangeles", "londra", "stockholm"));
        System.out.println("listsehir.get(1) = " + listsehir.get(1));
        System.out.println("listsehir.get(1) = " + listsehir.get(11));// olmayan index elemanı rte verir



    }
}
