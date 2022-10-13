package j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        //String'i array'a cevirme *** --->>> split() girilen parametre değere göre String ifade parcalanır
        String str="javacan'lara selam olsun. en kısa zamanda bolcana offer sonrası tuzlabalık :)";
        // task -- string ifadenin kelime sayısını print eden code create ediniz
        String strArr[]=str.split(" "); // string her " " karaketere göre parcalanır. her bir parca str arrayın bir elemanı olarak atandı


        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));

        System.out.println("strArr.length = " + strArr.length);
        // task -- string ifadedeki harf sayısını print eden code create ediniz

      String harfArr[]=str.split("");
        System.out.println("Arrays.toString(harfArr) = " + Arrays.toString(harfArr));
        System.out.println("harfArr.length = " + harfArr.length);


    }
}
