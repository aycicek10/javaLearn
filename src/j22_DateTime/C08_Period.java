package j22_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        //Period -- iki tarih arasında gecen tekrarlanabilen zamanı tutar
        LocalDate bugun=LocalDate.now();
        LocalDate fthBirtday=LocalDate.of(1993,5,19);
        Period fark=Period.between(fthBirtday,bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.toTotalMonths() = " + fark.toTotalMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        Period period5Gun=Period.ofDays(5);
        Period period7Ay=Period.ofMonths(7);
        Period periodX=Period.ofMonths(7).ofDays(21);

        bugun=bugun.plus(period5Gun);
        System.out.println("bugun = " + bugun);
        bugun=bugun.minus(period7Ay);
        System.out.println("bugun = " + bugun);
        bugun=bugun.plus(periodX);
        System.out.println("bugun = " + bugun);

        // task-> 5.9.2022 de başlayan kur 9 ay olduguna göre bitiş tarihini print eden code create ediniz

        LocalDate kursBasla = LocalDate.of(2022, 9, 5);
        System.out.println("kursBasla = " + kursBasla);

        Period kursSure=Period.ofMonths(9);//kurs suresi 9 ay olarak atandı.
        System.out.println("kursBasla.plus(kursSure) = " + kursBasla.plus(kursSure));

        System.out.println("kurs bitis tarihi : "+kursBasla.plus(kursSure).format(DateTimeFormatter.ISO_LOCAL_DATE));

    }
}
