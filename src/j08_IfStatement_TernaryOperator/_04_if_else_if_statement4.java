package j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class _04_if_else_if_statement4 {

    public static void main(String[] args) {

     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */

        Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriniz");
        double x= sc.nextDouble();
        double y= sc.nextDouble();

        if (x>y){
            System.out.println("double x is greater than double y");
        }

        else if (x<y) {
            System.out.println("x is smaller than y");




    }
}
    }