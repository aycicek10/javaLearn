package j12_Loops.L01_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // 41 kere maşallah print ediniz

        //System.out.println("maaşallah");

        /*
        loop-> döngü tekrarlanan aksiyonlar icin kullanılan code bloklarıdır
         */
// baslangıc degeeri     bitiş   değişim
        for (int i = 1; i <= 41; i++) {
            System.out.println(i + "maaşallah");
            System.out.println(i + "selam javacanlar");
        }
// task -- iki basamaklı tek sayıları yan yan print eden code create ediniz

        for (int i = 11; i < 100; i += 2) {
            if (i % 2 == 1) {
                System.out.print(i + " ");

            }


        }
        for (int i = 0; i >10 ; i++) {//sartı sağlamayan false olan for body run olmaz kod kırılır sıradaki satırdan devam eder
            System.out.println("saelam java");

        }

        System.out.println("agam bu metni okuduysan kod çalışmadı");

        for (int i = 0; i >=0 ; i++) {// bu for cuğarayı cüpiterden yakana kadar calışır durdurana ask olsun
            System.out.println(i);

        }









    }
}