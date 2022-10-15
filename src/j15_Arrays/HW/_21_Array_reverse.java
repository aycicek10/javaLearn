package j15_Arrays.odev;

import java.util.Arrays;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */


        int sayı = 123;
        String s = String.valueOf(sayı);
        String ss[] = s.split("");
        for (int i = ss.length - 1; i >= 0; i--) {
            System.out.print(ss[i]);


        }
    }
}


