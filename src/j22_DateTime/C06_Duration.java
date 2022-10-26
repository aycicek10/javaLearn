package j22_DateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {
        LocalTime gece = LocalTime.of(0,0);
        LocalTime oglen = LocalTime.of(13,30);

        Duration fark=Duration.between(gece,oglen);

        System.out.println("fark = " + fark);
        System.out.println("fark.getSeconds() = " + fark.getSeconds());
        System.out.println("fark.toHours() = " + fark.toHours());


    }
}
