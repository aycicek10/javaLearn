package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C01_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll1= new LinkedList<>(Arrays.asList("ebubekir","gülsüm","adem","ilker","merve"));

        // LinkedList print ***

        System.out.println("ll1 = " + ll1);

        //LinkedList add() ***

        ll1.add("ugur");
        System.out.println("ll1 = " + ll1);
        ll1.add(2,"ahmet");
        System.out.println("ll1 = " + ll1);



    }
}
