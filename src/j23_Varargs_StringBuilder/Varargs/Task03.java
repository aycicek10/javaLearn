package j23_Varargs_StringBuilder.Varargs;

public class Task03 {
    public static void main(String[] args) {
        /*
Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
 */

        int sayı=5;
        String str1="muharrem";
        String str2="ugur";
        String str3="ebikgabık";
carpTopla(sayı,str1,str2,str3);
    }

    public static void carpTopla(int carpacakSayı,String ... str){
        String enUzun="";

        for (String a:str){
            if (a.length()>enUzun.length()){
                enUzun=a;
            }
        }
        System.out.println("sonnuc : "+(carpacakSayı*enUzun.length()));
    }
}
