package j08_IfStatement_TernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {

        int krmYas = 33;
        int ismYas = 40;
        if (krmYas == ismYas) {

            System.out.println("aynı yasdasınız güzel insanlar");
            System.out.println("yoksa siz ikiz misiniz");
        }

        if (krmYas >= 40) System.out.println("krm bey olgunluk yasındasnız");
        System.out.println("bu yazıyı okuduysnız 12. satırdaki if den bagımsız");
/* if blokta süslü parantez kullanılmazsa ilk noktalı virgüle kadar olan çalışır
        veya çalışmaz alt satırdan devam eder


 */
        if (krmYas + ismYas > 100) {
            System.out.println("krm bey ve ism bey yasları toplamı 100 den buyuk");

        }

        System.out.println("selam javacanlar");

        /* eğer süslü parantez kullanmazsanız ilk satırı çalıştırır, koyarsanız
        parantez içi hepsiniz çalıştırır bu durum kod karmaşasından kurtarır
         ctrl+alt+l code format
         */

        /*
        bağımsız if statement yapıları sadece kendi scop run edeer
        birden fazla bagımsız if statement yapıları hepsinin body calısabileceği
        gibi hiçbirisini body de çalışmayabilir
         */

    }













}
