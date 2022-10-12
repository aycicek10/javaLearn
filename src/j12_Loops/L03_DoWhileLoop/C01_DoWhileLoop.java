package j12_Loops.L03_DoWhileLoop;

public class C01_DoWhileLoop {
    /*
        While loop-> önce sart konrol edilir eğer  sart sonucu true alınırsa body action çalışır
        do-While loop-> önce body action çalışır sonra şart kontrol edilir.Sart true ise döngü devam eder.
        sart false ise döngü lırılır ve döngüden sonraki ilk satır çalışır.
        do-While loop->  game app. de daha çok kullanılır.
        Trick: while loop sart sağlanmazsa hiç çaılşmayabilir ama do-while sart sağalasın sağlamasın
        en az bir kez çalışır..

         */
    public static void main(String[] args) {
int age =33;
while (age<33){
    System.out.println("agam yas" + age + "gayet basarılı  " );
    age++;
}


do {
    System.out.println("agam yas" + age + "gayet basarılı  " );
    age++;
}while (age<33);



    }
}
