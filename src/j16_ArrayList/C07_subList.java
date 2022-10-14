package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_subList {
    public static void main(String[] args) {
        ArrayList<String> listsehir = new ArrayList<>(List.of("münih", "losangeles", "londra", "stockholm","angara", "patagonya"));

        //sublist(); --- listten istenen list parcasını verir

        System.out.println("listsehir.subList(3,5) = " + listsehir.subList(3, 5));//3.4. index elemanlarını verir

        ArrayList<String> city=new ArrayList<>(listsehir.subList(2,5));//listSehir'den 2.3.4. index eelamnalrı city liste atandı.
        System.out.println("city = " + city);//city = [Londra, stockholm, Angara]


    }
}
