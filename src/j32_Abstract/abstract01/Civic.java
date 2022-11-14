package j32_Abstract.abstract01;

public class Civic extends Lastik {// Honda parent abs Class extend child concrete class

    /*
    Extend Honda yazılarak Honda class'a concrete bir civic class tanımlandı
    Java cte verdi
    Cözüm olarak
     a- Unimplemented(uyarlanmamıs) method implement edilmeli
     b- Parent Honda class'dan abstract keyword kaldırılmalı
     c- Concrete olan child class abstract tanımlanmalı

     */

    // Trick -- child concrete class parent abs class'ın abs methodlarını mutlaka implement etmeli
    @Override
    public void motor() {
        System.out.println("agam 1.6 eco motor az yakar cok kacar");
    }

    @Override
    void koltuk() {
        System.out.println("agam ucuz olsun diye kumas koltuk temiz kullanın");

    }

    @Override
    void kapı() {
        System.out.println("5 kapılı sedan");

    }
    public int vites(){// concreter child class method
        return 5;
    }

    @Override
    public void lastikEbatı() {
        System.out.println("21 inc lastik ");
    }
}
