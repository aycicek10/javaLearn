package Java_PracticeLesson.day04;

public class Q10_StringManipulation {


    // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

    public static void main(String[] args) {
String s="   Java ogrenmek123 Cok guzel@      ";
        System.out.println(s.replaceAll("\\d", "").replace("@", "").replace("C", "c").trim());

    }
}
