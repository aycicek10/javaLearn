package Java_PracticeLesson.day03;

public class Q04_SwitchCase {
    /*
    switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
	switch() de int, byte, short, char, String kullanilir.
     */
 /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {

        String day="monday";
        switch (day) {
            case "monday":
            case "tuesday":
                System.out.println("java class");
                break;
            case "thursday":
            case "friday":
                System.out.println("selelnyum class");
                break;
            case "saturday":
            case"sunday":
                System.out.println("sql class");
                break;
            default:
                System.out.println("off day");

        }
    }

    }