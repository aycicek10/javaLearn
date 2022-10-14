package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty {
    public static void main(String[] args) {

        // isEmpty(); --- listin bos olmasını kontrol eder true/false return eder
        // clear(); --- listin tüm elemanlarını siler

        ArrayList<String> listsehir = new ArrayList<>(List.of("münih", "losangeles", "londra", "stockholm"));
        System.out.println("listsehir = " + listsehir);
        System.out.println("listsehir.isEmpty() = " + listsehir.isEmpty());// list boslugu kontrol edildi

        listsehir.clear();//list temizlendi

        System.out.println("listsehir = " + listsehir);

        System.out.println("listsehir.isEmpty() = " + listsehir.isEmpty());


    }
}
