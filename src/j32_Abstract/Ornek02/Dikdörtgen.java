package j32_Abstract.Ornek02;

public class Dikdörtgen extends Sekil{

    private double uzunKenar;
    private double kısaKenar;

    public Dikdörtgen(double uzunKenar, double kısaKenar) {// full parametreli constructor
        this.uzunKenar = uzunKenar;
        this.kısaKenar = kısaKenar;
    }

    @Override
    public double alanHesapla() {
        return this.uzunKenar*this.kısaKenar;
    }

    @Override
    public double cevreHesapla() {
        return (this.uzunKenar+this.kısaKenar)*2;
    }
}
