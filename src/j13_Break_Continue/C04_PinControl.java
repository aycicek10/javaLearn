package j13_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {

// String data type bir pin datasının 3 giriş  hakkında kontrol eden code create ediniz

        Scanner sc = new Scanner(System.in);

        String dogruPın="javacan";

int girişHakkı=3;


while (true){
    System.out.println("pin giriniz: ");
    String agaPin=sc.nextLine();
    if(agaPin.equals(dogruPın)){
        System.out.println("dogru giriş");
        break;
    }else {
        System.out.println("hatalı giriş tekrar deneyin");
        girişHakkı--;
        System.out.println("kalan giriş hakkı: " + girişHakkı);
        if (girişHakkı==0){
            System.out.println("girişi hakkınız kalmadı");
            break;
        }
    }


}









    }
}
