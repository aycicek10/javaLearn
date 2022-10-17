package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replaceAll_fill {
    public static void main(String[] args) {

        //replaceAll(); -- listte belirli bir elemanı belirli bir değer ile update eder

        ArrayList<Integer> listsayı = new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));

        System.out.println("listsayı = " + listsayı);//replaceAll öncesi

        Collections.replaceAll(listsayı,1,20);// sayılist te 1 yerine 20 değeri atandı

        System.out.println("listsayı = " + listsayı); // replaceAll sonrası


        // fill(); -- listte tüm elemanları belirli bir değere update eder

        Collections.fill(listsayı,33);

        System.out.println("listsayı = " + listsayı);// fill sonrası tüm değerler 33 olarak update edildi


    }
}
