package j32_Abstract.abstract02;

public class IdariPersonel extends Personel{
    @Override // mecbur implement edilmeli
    public void maasHesapla() {// Personel classtan override abs method
        System.out.println("agam frapan idarecimize saat bası 120$ gayme verilir");
    }

    @Override // tercihen override ettik
    public void sigorta() {// Personel classtan override concrete method
        System.out.println("agam cıncık coder personel full sigorta");
    }

    @Override
    public void maasBilgisi() {// Personel classtan override abs method
        System.out.println("agam cıncık code yazan idare personele ekstradan bir ay ikramiye");
    }
}
