package Java_PracticeLesson.day07;

public class Q01_WhileDoWhile {
    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

        int  sayı=2562;

        System.out.println("btoplam(sayı) = " + btoplam(sayı));


    }

    private static int btoplam(int sayı) {
        int toplam=0;
        while (sayı>0){
            toplam+=sayı%10;
            sayı/=10;


        }

        return toplam;
    }
}
