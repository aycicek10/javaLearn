package j32_Abstract.Ornek02;

public abstract class Sekil {
    private String name;

    public Sekil() { // p'siz parent cons
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sekil(String name) {// parametreli parent cons
        setName(name);
    }

    public abstract double alanHesapla();
    public abstract double cevreHesapla();
    public String ciz(){

        return this.name + " cizildi";
    }

    @Override
    public String toString() {// obj value' ları print eder
        return
                "sekilIsmi='" + this.name + '\'' +
                        "\n sekil alanı : " + this.alanHesapla() +
                        "\n sekil cevre : " + this.cevreHesapla()+
                        "\n sekil : " + this.ciz();// ciz methodu call edildi

    }
}
