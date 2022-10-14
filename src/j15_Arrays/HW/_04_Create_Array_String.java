package j15_Arrays.odev;

import java.util.Arrays;

public class _04_Create_Array_String {

    public static void main(String[] args) {

        /*
        elemanları: "new jersey" , "new york", "boston","California" olan  String array  oluşturun ve
        Array'daki eleman sayısını yazdırınız.
        Cevap 4 olmalı.
         */

        String arr="new jersey, new york, boston, California";

        String arr1[]=arr.split(",");
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));

        System.out.println("arr1.length = " + arr1.length);


    }
}
