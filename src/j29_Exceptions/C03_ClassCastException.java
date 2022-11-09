package j29_Exceptions;

public class C03_ClassCastException {
    public static void main(String[] args) {

        // ClassCastException -- Birbirine dönüstürülemeyen data type'lar birbirine dönüstürüldügünde olusan RTE exceptiondur

        Object obj="Javacanlara selam olsun";
        String str= (String) obj;// objcet data type String data type casting yapılarak atandı
        System.out.println("str = " + str);

        Object sayı1=10;
       // String str2= (String) sayı1;
      //  System.out.println("str2 = " + str2);// ClassCastException
try {

    String str2= (String) sayı1;

}catch (ClassCastException e){

    System.out.println("agam integer object hiç stringe cevrilir mi");

}
try {
    String str3= (String) obj;
    System.out.println("agam try blocktasın bu yazıyı okuduysan excp fırlatmadı komut soorunsuz");

}catch (ClassCastException e){
    System.out.println("agam integer object hiç stringe cevrilir mi");
}

        System.out.println("agam sorun handle edildi dewamkeee");// bu kod calısmıssa pr sorunsuz kırılmadan run olmustur

    }
}
