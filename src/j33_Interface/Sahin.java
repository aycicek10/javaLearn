package j33_Interface;

public class Sahin extends Tofas implements dısDonanım,icDonanım,Lastik {// zavallı concrete child class -- extends -> tofas -- implements -> dısDonanım,icDonanım,Lastik
    @Override
    public void ebat() {
        System.out.println("agam 16 inc lastik ebat");
        System.out.println("doktor bu ne insan yiyecek bunu");

    }

    @Override
    public void jant() {
        System.out.println("agam senin gibi janti adama celik 5 kolllu jant yakısır");

    }

    @Override
    public void motor() {
        System.out.println("1.6 motor");

    }

    @Override
    public void yakıt() {
        System.out.println("tüpü dak ıraat et");

    }

    @Override
    public void kapı() {
        System.out.println("4 kapı sedan");

    }

    @Override
    public void kaporta() {
        System.out.println("akordiyon kaporta ");

    }

    @Override
    public void koltuk() {
        System.out.println("agam deri dösemeli pisik ederr");

    }

    @Override
    public void klima() {
        System.out.println("acs mevcuttur");

    }

}
