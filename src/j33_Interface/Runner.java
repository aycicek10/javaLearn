package j33_Interface;

public class Runner {
    public static void main(String[] args) {
        Sahin shn = new Sahin();
        shn.ebat();
        shn.jant();
        shn.kapı();
        shn.kaporta();
        shn.klima();
        shn.koltuk();
        shn.motor();
        shn.yakıt();
        shn.sisLamp();// default conc method oldugu icin obj ile call edildi
        shn.sunroof();
        System.out.println("dısDonanım.renk = " + dısDonanım.renk);
        System.out.println("icDonanım.KUMAS = " + icDonanım.KUMAS);// final variable oldugu icin cte verir *** atama yapılamaz ***
        System.out.println("icDonanım.RENK = " + icDonanım.RENK);
        System.out.println("icDonanım.MUSIC = " + icDonanım.MUSIC);
        System.out.println("Lastik.RENK = " + Lastik.RENK);
        dısDonanım.anten();// static concrete method interface name ile call edildi
    }
}
