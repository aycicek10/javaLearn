package j32_Abstract.abstract02;

public class Accord extends Honda {
    @Override
    public void motor() {// implement edilen
        System.out.println("agam 2.0 turbo atesle hız felakettir");

    }

    @Override
    void sunroof() {// override edilen concrete method
        System.out.println("agam cugara yakınca sunroof acmaya");
    }

    @Override
    void koltuk() {
        System.out.println("agam deri koltuk ter yapar pisik olursun");

    }

    @Override
    void kapı() {
        System.out.println("agam vakumlu kapı carpılmayasan ");

    }
}
