package j15_Arrays.odev;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */

        String arr[][]={{"new jersey","atlanta","ohio"} ,
                        {"Pittsburgh" ,"ohio","new york","ohio"} ,
                        {"ohio","new york"}};

        for (int kat = 0; kat < arr.length ; kat++) {
            for (int daire = 0; daire <arr[kat].length ; daire++) {

               if (arr[kat][daire] == "ohio"){
                   arr[kat][daire] ="Florida";



                }

            }
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.deepToString(arr));

    }
}

