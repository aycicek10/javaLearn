package practice.day02;

public class Q03_IncrementDecrement {

    public static void main(String[] args) {
        System.out.println("-----Arttirma-----");

       int a=1;
        System.out.println(++a);//2 value 2
        System.out.println(a++);//2 *önce yazdı sonra arttırdı* value 3
        System.out.println(a);//3

        int b=5;
        System.out.println(--b);//4
        System.out.println(b--);// 4 value 3
        System.out.println(b);//3

        int x=20;
        int y=15;
        System.out.println(++x + y--);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println(++x + --y);


        int k=5;
        System.out.println(++k + k++ + k++ + --k + k-- + k);
        System.out.println("k = " + k);


    }


}
