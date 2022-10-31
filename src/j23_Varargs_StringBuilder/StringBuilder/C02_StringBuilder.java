package j23_Varargs_StringBuilder.StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        // string builder obj create etme
        // 1.yol --
        StringBuilder sb1 = new StringBuilder();//default capacity 16 bit olan value'su olmayan bos

        System.out.println("sb1.length() = " + sb1.length());//boyutu

        System.out.println("sb1.append(\"javatar\") = " + sb1.append("javatar"));// sb1 e eklendi
        sb1.append("selam").append("olsun").append(24).append(true);
        System.out.println("sb1 = " + sb1);

        System.out.println("sb1.capacity() = " + sb1.capacity());

        sb1.append("basarı gayrete asıktır");
        System.out.println(sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());

        // 2. yol

        StringBuilder sb2 = new StringBuilder("Fatih beye selamlar");// ilk değer ataması yapılmıs sb1 string builder obj

        System.out.println("sb2 = " + sb2);

        System.out.println("sb2.capacity() = " + sb2.capacity());

        // trimToSize() methodu -- fazlaadan ayrılan capacity silinir

        System.out.println("sb2.length() = " + sb2.length());

        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity());

        // 3. yol

        StringBuilder sb3 = new StringBuilder(11);// hafızadan 11 karakterlik yer ayıran bos sb tanımlandı
        System.out.println("sb3.length() = " + sb3.length());// bos sb3 karaktera sayısı=0
        System.out.println("sb3.capacity() = " + sb3.capacity());
        sb3.append("ahmet bey");
        System.out.println("sb3.capacity() = " + sb3.capacity());


        // istenen bir character indexi alma

        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));

        // belirli aralıktaki characterleri alma
        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13));// 3-13 (13 haric) index karakterlerini verir

        System.out.println("sb1.substring(17) = " + sb1.substring(17));//17 den sona karadar tüm karakterleri verir
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13));

        // belirli bir indexteki karaktri silmek

        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3));// 3. index a silindi

        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7));//3,4,5,6 . indexler silindi

        // istenen karakter veya karakterleri ekleme
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.insert(4,\":)\") = " + sb3.insert(4, ":)"));

        String s="güzel insan";

      //  System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s));

        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7));

        StringBuilder sb4 = new StringBuilder("nihan hanım");

        System.out.println("sb4.insert(5,\"qa team lead\",0,2) = " + sb4.insert(5, "qa team lead", 0, 2));

        // istenen index deki karakteri değiştirme

        sb4.setCharAt(4,' ');
        System.out.println("sb4 = " + sb4);

        // istenen index'e karakter yerine birden çok karakter eklemek

        System.out.println("sb4.replace(8,10,\"hi\") = " + sb4.replace(8, 10, "hi"));

        // sb obj String'e cevirme -- toString()

        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase());


        //String ile StringBuilder karsilastirmasi


/*
Compare iki sb'i esit mi diye kontrol etmek icin
ilk harften baslayarak tum karakterleri karsilastirir
Ayni olan karakterler icin bir sey return etmezken
farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
oldugunu print eder
Tamamen ayni ise bize 0 return eder

bir sb ile bir String'i compare etmek istersek Java CTE verir
 */



        StringBuilder sb5= new StringBuilder("javacan");
        StringBuilder sb6= new StringBuilder("javacan");
        String str1="javacan";

        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));// 0 verdi -- tamamen aynı

        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb5));// false -- sb equals == gibi calısır -- hem value hem de referans degerine bakar

        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6));//true

        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));


    }
}
