package Interview_Questions.day02;

import java.util.Scanner;

public class Q04_PerfectNumber {

/* Perfect Number (Mukemmel sayi)
  Kullanici tarafindan bir sayiya kadar olan sayilarin,
  mukemmel olup olmadigini bulan method yaziniz.
  Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
  kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
  ORNEK: (6, 28, 496, 8128)
  INPUT      : 6
  OUTPUT     :  1,2,3
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz :");
        int sayı = scan.nextInt();

        perfectNum(sayı);
        girilenSayıyaKadarOlanPerfect(sayı);

    }

    private static void girilenSayıyaKadarOlanPerfect(int sayı) {
        int toplam=0;
        for (int i = 1; i <sayı ; i++) {// girilen sayıya bakar
            for (int j = 1; j < i; j++) {// burada bolenler kontrol edilir
                if (i%j==0){// sayının herhangi bir boleni varsa
                    toplam+=j;//bolenleri toplama ekle
                }
            }
            if (toplam==i){
                System.out.println(i + " mukemmel sayıdır ");
            }
            toplam=0;
        }
    }

    private static void perfectNum(int sayı) {
        int toplam=0;

        for (int i = 1; i <sayı; i++) {// 1 den baslayarak bolenler kontrol edilecek
            if (sayı%i==0){ // asyının herhangi bir boleni (i) varsa
                toplam+=i;// toplam degiskenine ekle
                System.out.println(i + " ");// bolenleri görmek icin


            }

        }
        System.out.println();
        if (toplam==sayı){
            System.out.println(sayı + " sayısı mukemmel sayıdır");
        }else System.out.println(sayı + " sayısı mukemmel sayı değildir");

    }
}
