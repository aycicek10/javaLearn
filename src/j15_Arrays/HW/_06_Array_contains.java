package j15_Arrays.odev;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */
       // arr=new String[]={"Apple", "Orange", "Banana", "Pineapple"};



        String arr ="Apple, Orange, Banana, Pineapple";
        String arr1[]=arr.split(",");
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));

        boolean flag = false;




            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].equals("Apple")) {
                    flag = true;
                    System.out.println(flag);
                    break;


                }else System.out.println(flag);

            }
        }
    }


