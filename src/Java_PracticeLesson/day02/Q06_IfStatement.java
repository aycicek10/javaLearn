package Java_PracticeLesson.day02;

import java.util.Scanner;

public class Q06_IfStatement {

    /*
   not hesaplayici
              A => 90 ~100
              B => 80 ~ 89
              C => 70 ~ 79
              D => 60 ~ 69
              F =>  0 ~ 59
              sartlari aralik belirterek yaziniz

     write a program that:
	 	1. 0 ~12 ==> good morning
		2. 12 ~ 15 ==> good afternoon
		3. 15 ~ 23 ==> good night
		4. 12 ==> good noon
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("not giriniz: ");
        int not=sc.nextInt();

        if(not>=0 && not<=59){
            System.out.println("f");
        }else if (not>=60 && not<=69){
            System.out.println("d");
        }else if(not>=70 && not<=79){
            System.out.println("c");
        }else if(not>=80  && not<=89){
            System.out.println("b");
        }else if(not>=90 && not<=100){
            System.out.println("a");
        }else System.out.println("hatalı girdin gardaaaaş");



        int hour = 12;

        if(hour >=0 && hour < 12) {
            System.out.println("Good Morning ");
        }
        else if (hour > 12 && hour <= 15) {
            System.out.println("Good Afternoon");
        }
        else if(hour > 15 && hour <= 23) {
            System.out.println("Good night");
        }
        else {
            System.out.println("noon");
        }






































    }


}
   /* int grade = 85;

        if( grade >= 90 && grade <= 100) { // 90, 91 ..... 99
                System.out.println("You  made A, Great job");
                }

                else if( grade <90 && grade >= 80) { // 80, 81, 82...89
        System.out.println("You made B, Good");
        }

        else if(grade < 80 && grade >= 70 ) {  // 70, 71 ,... 79
        System.out.println("You made C, That's Okay");
        }

        else if ( grade <70 && grade >=60) {  // 60, 61 ,.. 69
        System.out.println("You made D, Really?");
        }
        else {
        System.out.println("You made F, Study more");
        }



        int hour = 12;

        if(hour >=0 && hour < 12) {
        System.out.println("Good Morning ");
        }
        else if (hour > 12 && hour <= 15) {
        System.out.println("Good Afternoon");
        }
        else if(hour > 15 && hour <= 23) {
        System.out.println("Good night");
        }
        else {
        System.out.println("noon");
        }


    */