package j20_PassByValue;

public class C04_PassByValue {
    static  double etiketFiyat;// günes - herkesi baglar
    static  double indirimOranı;
    public static void main(String[] args) {
        /*
        eger bir methodta yapılan degisiklik kalıcı olsun istenirse
        1- degisiklik yapılan variablelar static olarak tanımlanır
        */

        etiketFiyat=200;
        indirimOranı=0.11;

        indir();//method call edildi
        indirimOranı=0.22;
        indir();
        indirimOranı=0.05;
        indir();

    }//main sonu
    public static void indir(){
        etiketFiyat*=(1-indirimOranı);// etiket fiyatı indirimli hale geldi
        System.out.println("etiketFiyat = " + etiketFiyat);
    }
}
