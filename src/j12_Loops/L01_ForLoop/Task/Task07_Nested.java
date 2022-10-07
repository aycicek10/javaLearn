package j12_Loops.L01_ForLoop.Task;

import java.util.Scanner;

public class Task07_Nested {
    public static void main(String[] args) {
        /* task***
        girilen boyutta bir kare içi
         */
Scanner sc=new Scanner(System.in);
        System.out.println("boyut giriniz: ");
        int boyut=sc.nextInt();


        for (int i = 1; i <=boyut; i++) {
            for (int j = 1; j <=boyut; j++) {
                if(i==j){
                    System.out.print("1  ");
                }else System.out.print("0  ");

            }
            System.out.println();
        }





    }
}
