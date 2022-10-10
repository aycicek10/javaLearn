package j13_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {
       // task- > girilen bir ifadedeki c karakterine kadar a karakterini print eden code create ediniz


        Scanner sc = new Scanner(System.in);
        System.out.println("metin giriniz: ");
        String metin = sc.nextLine();
        int a=0;
        for (int i = 0; i <metin.length() ; i++) {
           if (metin.charAt(i)=='a'){
               a++;

           }else if (metin.charAt(i)== 'c' ){
               break;
           }
            System.out.println("döngüde işleme giren karakterler : " + metin.charAt(i));

        }


        System.out.println("a sayısı : " + a);








    }
}
