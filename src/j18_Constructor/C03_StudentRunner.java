package j18_Constructor;

public class C03_StudentRunner {
    @Override
    public String toString() {
        return "C03_StudentRunner{}";
    }

    public static void main(String[] args) {
        C03_Student ogr1=new C03_Student();//obj create edildi
        ogr1.ad="fatih";
        ogr1.soyad="atas";
        ogr1.sınıf=1;
        ogr1.okulNo=1001;
        ogr1.ort=77;
        ogr1.takdir=false;

        System.out.println("ogr1 = " + ogr1);
        ogr1.mezuniyet();

        // task -- diger bir ögr obj ile tum field'ları atayıp print ediniz

        C03_Student ogr2=new C03_Student();//obj create edildi
        ogr2.ad="ahmet";
        ogr2.soyad="ayc";
        ogr2.sınıf=1;
        ogr2.okulNo=26;
        ogr2.ort=99;
        ogr2.takdir=true;


        System.out.println("ogr2 = " + ogr2);
        ogr2.mezuniyet();


    }
}
