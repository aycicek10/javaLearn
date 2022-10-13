package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        // task -- girilen bir int array elemanlarından ortalamadan büyük olan eleman sayısını print eden code create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("agam kac elemanlı array istiyirsen: ");


        int arr[] = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {// array elemanlarını alıp atama yapar
            System.out.print(i + ".index elemanı giriniz : ");
            arr[i] = sc.nextInt();

        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        int arrToplam=0;
        for (int i = 0; i <arr.length; i++) {// array elemanlarını toplar
            arrToplam+=arr[i];


        }
        System.out.println("arrToplam = " + arrToplam);

        int arrOrt=arrToplam/arr.length;
        System.out.println("arrOrt = " + arrOrt);

        int ortGecenElemanSayısı=0;

        for (int i = 0; i <arr.length; i++) {
            if (arr[i]>arrOrt){
                ortGecenElemanSayısı++;

            }

        }
        System.out.println("ortGecenElemanSayısı = " + ortGecenElemanSayısı);
    }
}
