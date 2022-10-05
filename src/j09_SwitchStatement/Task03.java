package j09_SwitchStatement;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız

        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo = ");
        int gunNo = oku.nextInt();

        switch (gunNo){
            case 1:
                System.out.println("ptesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("crsmb");
                break;
            case 4:
                System.out.println("prsmb");
                break;
            case 5:
                System.out.println("cma");
                break;
            case 6:
                System.out.println("cts");
                break;
            case 7:
                System.out.println("pzr");
                break;
            default:
                System.out.println("hatalı giriş");
        }



    }
}
