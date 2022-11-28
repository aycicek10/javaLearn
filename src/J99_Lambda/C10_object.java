package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_object {
    public static void main(String[] args) {
        /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
 */

        Universite u01 = new Universite("Bogazici", "Matematik", 571, 73);
        Universite u02 = new Universite("Istanbul", "Matematik", 622, 77);
        Universite u03 = new Universite("Marmara", "Hukuk", 1453, 52);
        Universite u04 = new Universite("Itu", "uçak muh.", 333, 63);
        Universite u05 = new Universite("Yıldız Teknik", "Gemi ", 216, 55);

        List<Universite> unv=new ArrayList<>(Arrays.asList(u01,u02,u03, u04,u05));


    }// main sonu

    //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.







}
