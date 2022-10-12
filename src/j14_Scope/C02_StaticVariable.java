package j14_Scope;

public class C02_StaticVariable {



/* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
    ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

   Static variabler ise class variable olarak tanimlanir
   ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
   eger static variable'in degeri degistirilirse herkes icin degisir


 */
        static String firmaName = "clarusway";
        static int firmaId;
        static boolean firmaIT;

        public static void main(String[] args) {//main bası

            firmaId=1001;// static variable name ile call - best practice
            System.out.println("firmaId = " + firmaId);//1001

            C02_StaticVariable.firmaIT=true;// class name ile static variable call edildi - bad practice -

            staticMethod();// astral seyahat yapabilir - maine call edildi
            // sefil dünyalı non static method galaksiye cıkamaz ***











        }//*** main sonu ***

    public static void staticMethod() {// static method - galaksi
            firmaId=2002;//static variable call
        System.out.println("agam yeni id hayırlı olsun " + firmaId);

    }

    public void non_staticMethod() {// non static method - sefil dünyalı
            firmaName="javacanlar aş";//
        System.out.println("agam yeni isim hayırlı olsun " + firmaName);

    }









}
