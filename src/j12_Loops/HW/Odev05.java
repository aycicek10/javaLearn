package j12_Loops.HW;

import java.util.Scanner;



public class Odev05 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = sc.nextInt();

        System.out.println(powerOfThree(sayı));

    }

    private static boolean powerOfThree(int sayı) {
        boolean ücÜssümü=true;



        for (int i = 3; i <=sayı; i*=3) {
                if (sayı%i!=0){
    ücÜssümü=false;

}
        }


        return ücÜssümü;

    }




}

