package j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        /*Ternary ile yapılan tüm işlemler if-else blok ile yapılabilir
        ternary tercih edilmesi yapının basit okunabilir ve anlaşılabilir
        olması içindir->clean code

       Ternary içerisinde kompleks kodlar yerine doğrudan sonuç üreten
       veya veren daha basic codelar bulunur
         */
        //task01->girilen bir tamsayının tek çift olmasını kontrol eden kod giriniz

        Scanner sc=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz");
        int sayı= sc.nextInt();
       // if (sayı%2==0){
       //     System.out.println("sayı çift");
       // }else System.out.println("sayı tek");


     //   System.out.println((sayı % 2 == 0 ? "çift" : "tek"));
        String ssonuc=(sayı%2==0 ? "çift" : "tek");

        /* trick

      ternary operator işlem sonucunda true veya false göre bir çıktı verir
      eğer bu çıktı type göre bir variable atanmazsa sout ile doğrudan print edilmeli

         */

        System.out.println((sayı > 0 ? "p" : "n"));


    }
}
