package Java_PracticeLesson.day06;

public class Q02_ForLoop {

//Interview Question
// 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
public static void main(String[] args) {
    System.out.println("*** for ***");

    for (int i =0;i<=255;i++){

            System.out.print((char)(i)+",");

            System.out.println(i+" ");
        }
    System.out.println("*** while ***");

    int a=0;
    while (a<=255){
        char c= (char) a;
        System.out.println(a + " , " + c);
        a++;
    }
    System.out.println("*** doWhile ***");


    int x=0;
    do {
        char k = (char) x;
        System.out.println(x + " , "+ k );
        x++;
    } while (x<=255);



    }





    }


