package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_ListConvertArray {
    public static void main(String[] args) {

        // listi Array'a cevirme -- toArray();

        // 1.yöntem -- toArray(); parametre olarak String[0] alarak yapılır

        ArrayList<String> listülke = new ArrayList<>(List.of("almanya", "amerigonya", "ingiltere", "isvec"));

        String arrUlke[]=listülke.toArray(new String[0]);// ülkelist elemanları artık arrUlke olarak atandı

        System.out.println("listülke = " + listülke);

        System.out.println("Arrays.toString(arrUlke) = " + Arrays.toString(arrUlke));

        // 2. yöntem -- olusturulan Array'in data type object olarak atanır

        //Trick -- Object class javada tüm class'ların parent yani atası:Hz Adem

        // Object Class javada parent olmayan tek classtır(tüm vagonları ceken ama cekilemez lokomotif

        // String Integer Class lar Object Class ' ın child' i oldugu için istenen durumlarda data type olarak object class kullanılabilir

        Object arrUlkeler[]=listülke.toArray(); // Object -- Hz Adem Class'ına atandı

        System.out.println("Arrays.toString(arrUlkeler) = " + Arrays.toString(arrUlkeler));


    }
}
