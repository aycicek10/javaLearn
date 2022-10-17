package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {
    public static void main(String[] args) {
        // King of Trick -- Array'dan cevrilen list Array kaynaklı oldugu için array davranısı gösterir
        //boyut sabittir. dolayısıyla remove add method calısmaz

        String arrJavacan[]={"akif","gamze","musty","sevdenur"};

        List<String>ListJavatar= Arrays.asList(arrJavacan);// arrJavacan değerleri listte eleman olarak

        System.out.println("ListJavatar = " + ListJavatar);

        System.out.println("ListJavatar.size() = " + ListJavatar.size());
        // ListJavatar.add("sefilcan haluk"); *** Array'a eleman eklenmez

        // Kral Trick --- list data type ArrayList tanımlanırsa rte vermez kaynagı array de olsa list davranır boyut esnekliği yapar

        ArrayList<String> ListJavatar1= new ArrayList<>(Arrays.asList(arrJavacan));
        ListJavatar1.add("sefil haluk");
        System.out.println("listJavaTar1 = " + ListJavatar1);//[Akif, Gamze, Musty, SevdeNur, sefil haluk]



    }
}
