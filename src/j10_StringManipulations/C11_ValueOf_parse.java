package j10_StringManipulations;



public class C11_ValueOf_parse {
    public static void main(String[] args) {


        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar.

//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        // task-- String tpe verilen iki adet bağıs miktarını toplayan code create ediniz

        String b1="1500";
        String b2="2500";
        int bg1=Integer.valueOf(b1);
        int bg2=Integer.valueOf(b2);
        System.out.println(bg1 + bg2);

        int fetih=Integer.valueOf("1453");
        System.out.println(fetih);


        System.out.println(Integer.parseInt(b1) + Integer.parseInt(b2));

        int tc=12345;

       String strTc=String.valueOf(tc);
        System.out.println(strTc + tc);// string + int napaaar-- concanation yapar 1234512345 yapar


        String fiyat="$150";
        System.out.println(fiyat.replace("$", ""));
        int yf= Integer.valueOf(fiyat);
        System.out.println(yf);


    }
}
