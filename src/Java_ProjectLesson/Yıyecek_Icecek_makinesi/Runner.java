package Java_ProjectLesson.Yıyecek_Icecek_makinesi;

public class Runner {
    public static void main(String[] args) {

        double accountBalance=1;

        Urun urun=new Urun();
      //  System.out.println("urun.toString() = " + urun.toString());

        Options opt=new Options();
        //opt.select(urun);
        urun.setPrice(opt.select(urun));

        accountBalance=opt.balance(urun.getPrice(),accountBalance,urun);

        System.out.println("accountBalance = " + accountBalance);

        opt.purchase(urun.getPrice(),accountBalance,urun);

    }
}
