package j18_Constructor;

public class C03_Student {// main olmayan sadece student obj create etmek için pojo -- plan old object java: obj icin standart
    // fields --

    String ad;
    String soyad;
    int sınıf;
    double ort;
    int okulNo;
    boolean takdir;

    public void mezuniyet(){
        if (ort>=50){
            System.out.println("agam diploman hayırlı olsun");
        }else System.out.println("agam seneye de bekleriz devamkee");
    }

    @Override
    public String toString() {
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sınıf +
                ", ort=" + ort +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir +
                '}';
    }
}
