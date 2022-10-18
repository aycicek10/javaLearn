package j17_ForEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        // task -- iki string array elemanlarının ortak olmasını kontrol eden code create ediniz

        String arr1[]={"nazım","gülsüm","dilek","erol","cüneyt","cigdem"};
        String arr2[]={"musty","gülsüm","ayse","enise","cüneyt","cigdem"};

       for (String arr:arr1){
           for (String arr0:arr2){
               if (arr.equalsIgnoreCase(arr0)){
                   System.out.println(arr);
               }
           }
       }

    }
}
