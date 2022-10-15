package j15_Arrays.odev;

import java.util.Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
String str="Hello World";
String tersStr[]=str.split("");
        System.out.println("Arrays.toString(tersStr) = " + Arrays.toString(tersStr));


        for (int i =tersStr.length-1; i >=0 ; i--) {
            System.out.print(tersStr[i]);
        }











    }
}