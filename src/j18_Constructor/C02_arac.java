package j18_Constructor;

public class C02_arac {

    String marka;
    String model;
    int km=10;
    double mHacim;
    boolean vitesAutomatic=false;
    boolean ikinciEl;
    int yıl;


    @Override
    public String toString() {// tüm obj field ları print edilir
        return "C02_arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", mHacim=" + mHacim +
                ", vitesAutomatic=" + vitesAutomatic +
                ", ikinciEl=" + ikinciEl +
                ", yıl=" + yıl +
                '}';
    }

    public static void main(String[] args) {

    C02_arac arc1=new C02_arac();// default cons ile arc1 obj create edildi

        arc1.ikinciEl=true;
        arc1.marka="volvo";
        arc1.km=50000;
        arc1.model="xc60";
        arc1.mHacim=2.4;
        System.out.println(arc1.model+" " +arc1.marka+" "+arc1.km+" "+arc1.yıl+" "+arc1.ikinciEl+" "+arc1.mHacim);

        // task -- 2. bir aracın tüm field' larını atayarak print ediniz

        C02_arac arc2=new C02_arac();

        arc2.ikinciEl=true;
        arc2.marka="ford";
        arc2.km=10000;
        arc2.model="focus";
        arc2.mHacim=1.5;

        System.out.println(arc2.model+" " +arc2.marka+" "+arc2.km+" "+arc2.yıl+" "+arc2.ikinciEl+" "+arc2.mHacim);
        System.out.println("arc2 = " + arc2);

    }
}
