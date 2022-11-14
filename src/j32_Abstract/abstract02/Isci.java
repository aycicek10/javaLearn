package j32_Abstract.abstract02;

public class Isci extends Personel {// abs Personel parent Class'a extends -- concrete child Iscı class
    @Override
    public void maasHesapla() {// Personel classtan override abs method
        System.out.println("agam marabalara en cok yevmiye 400 gayme");
    }


    @Override
    public void maasBilgisi() {// Personel classtan override abs method
        System.out.println("agam marabalar cay-cigüra haric günde 8 saat kurek mahkumu");

    }
}
