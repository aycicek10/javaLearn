package j22_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {

        LocalDate bugün=LocalDate.now();
        LocalDate falangun=bugün.minusDays(2);
        LocalDate filangun=bugün.plusDays(3);
        System.out.println("bugün = " + bugün);
        System.out.println("falangun = " + falangun);
        System.out.println("filangun = " + filangun);

        System.out.println("bugün.isBefore(falangun) = " + bugün.isBefore(falangun));
        System.out.println("bugün.isBefore(filangun) = " + bugün.isBefore(filangun));
        System.out.println("falangun.isBefore(filangun) = " + falangun.isBefore(filangun));

        System.out.println("bugün.isAfter(falangun) = " + bugün.isAfter(falangun));
        System.out.println("falangun.isAfter(filangun) = " + falangun.isAfter(filangun));

        System.out.println("bugün.isLeapYear() = " + bugün.isLeapYear());

        System.out.println("bugün.compareTo(falangun) = " + bugün.compareTo(falangun));

    }
}
