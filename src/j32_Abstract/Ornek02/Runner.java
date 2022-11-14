package j32_Abstract.Ornek02;

public class Runner {
    public static void main(String[] args) {
        Dikdörtgen dd=new Dikdörtgen(24,7);
        dd.setName("dikdörtgen");
        dd.cevreHesapla();
        dd.alanHesapla();
        System.out.println(dd.ciz());
        System.out.println(dd);

        Cember cc=new Cember(39);

        cc.setName("cemberimde gül oya ");
        System.out.println("cc = " + cc);


    }
}
