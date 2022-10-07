package j08_IfStatement_TernaryOperator.HW;

import java.util.Scanner;

public class _03_if_statement3 {

    public static void main(String[] args) {

    /*    str1 ve str2 isimli 2 tane String oluşturulmuştur.
          Eğer str1, str2'ye eşit ise "String 1 is equal to String 2" yazdırınız.
          Eğer str1, str2'ye eşit değil ise "String 1 is NOT equal to String 2" yazdırınız. */

        Scanner sc=new Scanner(System.in);

        String str1= "javacan";
        String str2= "javacan";
        if (str1== str2){
            System.out.println("String 1 is equal to String 2");
        }

        else if (str1!=str2){
            System.out.println("Stirng 1 is not equal to String 2");
        }





    }
}
