package j12_Loops.L01_ForLoop.Task;

import java.util.Scanner;

public class Task11_Nested {
    public static void main(String[] args) {

        int harf=65;
        for (int i = 0; i <6 ; i++) {

            for (int j = 0; j <=i; j++) {
                System.out.print((char) (harf+j)+ " ");
            }


            System.out.println();
        }


    }
}
