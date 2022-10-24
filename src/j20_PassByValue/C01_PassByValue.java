package j20_PassByValue;

public class C01_PassByValue {
    /*
    Java Pass By Value bir programlama dilidir
    Bir primitive variable argument olarak bir methoda call edildiğinde variable değil
    bir copy clone (vesikalık)(pointer) değeri gönderilir
     */

    // task -- verilen fiyat için %24  artırılmıs fiyatı print eden method create ediniz

    public static void main(String[] args) {

        double fiyat=100;
        System.out.println("fiyat = " + fiyat);// method call öncesi

        fiyatArttır(fiyat);// fiyat variable method a parametre call edildi

        System.out.println("method call sonrası fiyat = " + fiyat);// method call öncesi

    }// main sonu

    public static void fiyatArttır(double bişey) {
        bişey*=1.24;
        System.out.println("arttırılmıs fiyat : " + bişey);

    }
}
