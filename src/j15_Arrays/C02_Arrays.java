package j15_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
//Array elemanının varlığını kontrol etme

        int arr[]={67,97,20,63,43,34,54,24,16,7,55,17};
        int sayı=34;
        boolean flag=false;//bayrak

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == sayı) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("aradığınız array de var ");
        }else {
            System.out.println("aradığınız sayı arrayde yok");
        }
        Arrays.sort(arr);// array eleman sıralandı
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.binarySearch(arr,34) = " + Arrays.binarySearch(arr, 34)); // aranan elemanı array de arayıp indexini return eder
        System.out.println("Arrays.binarySearch(arr,55) = " + Arrays.binarySearch(arr, 55));
        System.out.println("Arrays.binarySearch(arr,30) = " + Arrays.binarySearch(arr, 30));
        // trick-> binarySearch methodu array de olmayan elemanı calışırsa sonuc olarak eğer bu eleman array de olsaydı
        // kacıncı sırada olurdu cevabını verir

        System.out.println("Arrays.binarySearch(arr,99) = " + Arrays.binarySearch(arr, 99));



    }
}
