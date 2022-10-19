package j18_Constructor;

public class C04_teacher {// obj üreten kalıp hane class
    String ad;
    String soyad;
    String brans;
    double maas;
    int tecrübe;
// trick -- parametreli cons default cons ezer
    public C04_teacher(String ad, String soyad, String brans, double maas, int tecrübe, int id, boolean emekli) {
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.maas = maas;
        this.tecrübe = tecrübe;
        this.id = id;
        this.emekli = emekli;
    }

    int id;

    public C04_teacher() {// p'lini ezdiği default cons yerine p'siz o-cons

    }

    @Override
    public String toString() {
        return "C04_teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", brans='" + brans + '\'' +
                ", maas=" + maas +
                ", tecrübe=" + tecrübe +
                ", id=" + id +
                ", emekli=" + emekli +
                '}';
    }

    boolean emekli;

    public void dersSaati(){
        System.out.println("agam haftada 20 saatten sonra extraya girer");
    }
}
