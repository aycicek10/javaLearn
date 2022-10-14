package j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

        //Array copy... copyOf(arr,newLength); -> girilen arr in newLength kadar ilk elemanını copy eder

        int sayı[]={63,21,47,27,35,12,36,31,46,24};
        int newArr[]= Arrays.copyOf(sayı, 5);// ilk besi kopyalanan yeni array
        System.out.println("Arrays.toString(newArr) = " + Arrays.toString(newArr));

        int otherArr[]=Arrays.copyOfRange(sayı, 3,8);// 3 dahil 8 haric index elemanları kopyalanır
        System.out.println("Arrays.toString(otherArr) = " + Arrays.toString(otherArr));

        // Array ı belirli bir eleman ile update(set) etme ... fill(arr, value);

        Arrays.fill(sayı,99);
        System.out.println("Arrays.toString(sayı) = " + Arrays.toString(sayı));
        Arrays.fill(sayı,3,7,33);
        System.out.println("Arrays.toString(sayı) = " + Arrays.toString(sayı));


    }
}
