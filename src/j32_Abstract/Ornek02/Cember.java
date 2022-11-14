package j32_Abstract.Ornek02;

public class Cember extends Sekil{
    private double yarıCap;
    private final double Pi=3.14;

    public double getYarıCap() {
        return yarıCap;
    }

    public void setYarıCap(double yarıCap) {
        this.yarıCap = yarıCap;
    }

    public double getPi() {
        return Pi;
    }

    public Cember(double yarıCap) {
        this.yarıCap = yarıCap;


    }

    @Override
    public double alanHesapla() {
        return this.yarıCap*Pi*this.yarıCap;
    }

    @Override
    public double cevreHesapla() {
        return 2*Pi*this.yarıCap;
    }
}
