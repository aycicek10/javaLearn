package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_equals {
    public static void main(String[] args) {
        // equals(); -- iki listin index ve eleman esitliğini kontrol eder true/false return verir

        List<String>list1=new ArrayList<>(Arrays.asList("a","b"));
        List<String>list2=new ArrayList<>(Arrays.asList("A","B"));
        List<String>list3=new ArrayList<>(Arrays.asList("a","b"));
        List<String>list4=new ArrayList<>(Arrays.asList("b","a"));
        System.out.println("list1.equals(list3) = " + list1.equals(list3));// true
        System.out.println("list2.equals(list3) = " + list2.equals(list3));//false
        System.out.println("list1.equals(list2) = " + list1.equals(list2));//false
        System.out.println("list1.equals(list4) = " + list1.equals(list4));//false


    }
}
