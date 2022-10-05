package j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Trafik cezasının değerini hesaplayın.
        45 hız sınırıdır.

        Eğer hızınız 55-74 arasında ise:
        Ceza 100 $'dır.

        Eğer hızınız 75 - 84 arasında ise:
        Ceza 150 $'dır.

        Eğer hızınız 85 -94 arasında ise:
        Ceza 320 $'dır.

        Eğer hızınız 94'den daha fazla ise:
        Ceza 500 $'dır.

        ve ayrıca,
        Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


-----------------------------------------


Örn;

currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

sonuç 300 olmalıdır.  */

        Scanner scan = new Scanner(System.in);

        // int currentSpeed = scan.nextInt();

        // boolean isDriverLicenceAvailable = scan.nextBoolean();

//Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        System.out.println("hızınızı giriniz: ");
        int currentSpeed = scan.nextInt();
        System.out.println("isDriverLicenceAvailable: ");
        boolean isDriverLicenceAvailable = scan.nextBoolean();
        if ((currentSpeed > 45)) {

            if (isDriverLicenceAvailable==true) {
                System.out.println("cezanız: 100$");
            } else System.out.println("cezanız: 300$");
       }

        else if ((55 < currentSpeed) && (74 > currentSpeed)) {
            if (isDriverLicenceAvailable==true){
                System.out.println("cezanız: 100$");

            }else System.out.println("cezanız: 300$");
        }

        else if ((75 < currentSpeed) && (84 > currentSpeed)){
            if (isDriverLicenceAvailable==true){
                System.out.println("cezanız: 150$");

            }else System.out.println("cezanız: 350$");
        }

        else if ((84 < currentSpeed) && (95 > currentSpeed)){
            if (isDriverLicenceAvailable==true){
                System.out.println("cezanız: 3200$");

            }else System.out.println("cezanız: 520$");
        }
        else if ((95 < currentSpeed) ){
            if (isDriverLicenceAvailable==true){
                System.out.println("cezanız: 500$");

            }else System.out.println("cezanız: 700$");
        }
        else System.out.println("bravo hacı doğru yoldasın");














        }

    }