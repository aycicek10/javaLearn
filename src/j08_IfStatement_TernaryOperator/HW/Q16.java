package j08_IfStatement_TernaryOperator.HW;

import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("num1: giriniz" + "\nnum2: giriniz" + "\nnum3: giriniz" );
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();

        if (num1>num2){
            if(num2>num3) {
                if (num1 > num3) {
                    System.out.println("num1 en büyük");
                } else System.out.println("num3 en küçük");
            }
            }
            else if (num2>num1){
                if (num2>num3) {
                    if (num1 > num3) {
                        System.out.println("num2 en büyük");
                    } else System.out.println("num3 en küçük");
                }

                }
                else if (num3>num2){
                    if (num2>num1){
                        if (num3>num1){
                            System.out.println("num3 en büyük");
                        }else System.out.println("num1 en küçük");
                    }
                }
            }
        }




