package j22_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime now=LocalTime.now();
        System.out.println("now = " + now);

        System.out.println("now.getHour() = " + now.getHour());
        System.out.println("now.getMinute() = " + now.getMinute());
        System.out.println("now.getNano() = " + now.getNano());
        System.out.println("now.getSecond() = " + now.getSecond());

        // belirli zamanda ileri geri zamana gidilebilir

        LocalTime time=LocalTime.of(13,43,34);//belirli saat dakika saniyesi olan zaman atandı
        System.out.println("time.plusMinutes(90) = " + time.plusMinutes(90));
        System.out.println("time.plusMinutes(150) = " + time.plusMinutes(150));
        System.out.println("time.minusHours(23) = " + time.minusHours(23));

        System.out.println("time.minusMinutes(100).plusHours(2) = " + time.minusMinutes(100).plusHours(2));

        LocalTime forBası=LocalTime.now();
        System.out.println("forBası.getSecond() = " + forBası.getNano());
        int sayı=0;
        for (int i = 0; i <100000 ; i++) {
            sayı+=i;
        }
        LocalTime forSonu=LocalTime.now();
        System.out.println("forsonu.getSecond() = " + forSonu.getNano());
        System.out.println("forSonu.getNano()- forBası.getNano() = " + (forSonu.getNano() - forBası.getNano()));

    }
}
