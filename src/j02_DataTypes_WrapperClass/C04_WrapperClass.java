package j02_DataTypes_WrapperClass;

import java.util.Locale;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String name="Ahmet";
        int yas=24;
        name.toLowerCase();
        System.out.println( name.toLowerCase());

        System.out.println(name.toUpperCase());
        // // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        //// ancak primitive data turlerinin boyle bir ozelligi yoktur
        //// primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        ////Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        //// olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        //// ara çözüm imkanı sunmuştur.

        String tc="12345";

       int yenitc= Integer.valueOf(tc);

        System.out.println(yenitc);
        String id="98765";
        int yeniid= Integer.valueOf(id);
        System.out.println(yeniid);
        System.out.println(yenitc+yeniid);
        System.out.println("yeniid = " + yeniid);
        System.out.println("yenitc = " + yenitc);

        String no="23453";
        int yenino=Integer.valueOf(no);// run time exception hatası
        System.out.println(yenino);

        // task- byte short int max ve min değerlerini print eden kod


        byte min= Byte.MIN_VALUE;
        System.out.println(min);

        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);




    }
}
