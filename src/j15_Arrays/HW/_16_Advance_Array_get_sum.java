package j15_Arrays.odev;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        String str="$12 $23 $10 $2 $5 $2";
        String str1[]=str.replace("$","").split(" ");
        System.out.println("Arrays.toString(str1) = " + Arrays.toString(str1));
        int toplam=0;
        for (int i = 0; i < str1.length ; i++) {

            toplam+=Integer.parseInt(str1[i]);


        }
        System.out.println(" $ " + toplam);





    }
}