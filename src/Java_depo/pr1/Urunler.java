package Java_depo.pr1;

public class Urunler {//pojo model class

   private String urunIsmi;
   private String uretici;
   private int miktar;
   private String birim;
   private int raf;

    public Urunler() {
    }

    public Urunler( String urunIsmi, String uretici, int miktar, String birim, int raf) {

        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }






    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public int getRaf(int guncelRaf) {
        return raf;
    }

    public void setRaf(int raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "Urunleriniz" +

                ", urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +"\n"
                ;
    }
}
