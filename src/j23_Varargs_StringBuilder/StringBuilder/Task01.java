package j23_Varargs_StringBuilder.StringBuilder;

public class Task01 {
    public static void main(String[] args) {
        /*
Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
       olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir method create ediniz.
    (without case sensitivity)
    Eg : input : I love Java
    Output: "Reversed sentence : avaJ evol I
       It is not a palindrome"

 */

        System.out.println("terString(\"ece\") = " + terString("ece"));
        System.out.println("terString(\"serhat\") = " + terString("serhat"));

        tersSb(new StringBuilder("ahmet"));

        System.out.println("isPalindrome(\"ey edip adanada pide ye\") = " + isPalindrome("ey edip adanada pide ye"));

        System.out.println("isPalindrome(\"ahmet aga\") = " + isPalindrome("ahmet aga"));


    }// main sonu

    public static String terString(String str){
        String stringTersi="";

        for (int i = str.length()-1; i >=0 ; i--) {

            stringTersi+=str.charAt(i);


        }


        return stringTersi;
    }


public static void tersSb(StringBuilder sb){

    System.out.println("sb.reverse() = " + sb.reverse());

}

public static boolean isPalindrome(String str){

  if (str==null){

      return false;
  }


    return new StringBuilder(str).reverse().toString().equals(str);
}


}
