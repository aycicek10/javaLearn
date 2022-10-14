package j15_Arrays.odev;

import java.util.Arrays;

public class _01_Create_array {

    public static void main(String[] args) {
        /*
        Task ->
        elemanları : Apple, Orange , Banana, Kiwi
        olan String Array (Dizi) crdeate edip print eden code create ediniz.

         */


        String arr[]={"Apple, Orange, Kiwi"};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));


    }
}
