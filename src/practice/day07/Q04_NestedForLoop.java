package practice.day07;

public class Q04_NestedForLoop {
    /*  Problem Tanımı
    Girilen bir sayı kadar satır ve sütünu olan ve
    sağ kenara dayalı üçgeni basan kodu yazınız.
    Ekran Çıktısı
    Bir sayi giriniz: 5
           *
          **
         ***
        ****
       *****
*/
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {
            for (int j = 5-i; j > 0 ; j--) {
                System.out.print(" ");
            }
                for (int k = 1; k <=i ; k++) {
                    System.out.print("*");



            }
            System.out.println();
        }



    }
}
