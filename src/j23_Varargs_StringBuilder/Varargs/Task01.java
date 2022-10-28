package j23_Varargs_StringBuilder.Varargs;

public class Task01 {
    public static void main(String[] args) {
        /*
        Task --
        verilen Stringleri birleştiren concat isimli method create edin
        input : "m", "e", "r", "v", "e";
output : merve
         */

        String arr[]={"m", "e", "r", "v", "e"};
        String arr1[]={"a", "l", "i"};

        strBirlestir(arr);
        strBirlestir(arr1);
        strBirlestir("javacan","enise","hanım");




    }
    public static void strBirlestir(String...str){
        String birlesenStr="";

        for (String w:str){
            birlesenStr=birlesenStr.concat(w);
        }
        System.out.println("birlesenStr = " + birlesenStr);
    }



}
