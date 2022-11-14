package j32_Abstract.abstract02;

public class Runner {
    public static void main(String[] args) {
Isci maraba1=new Isci();
maraba1.maasHesapla();
maraba1.maasBilgisi();
maraba1.name="ebubekir bey";
        System.out.println("maraba1.name = " + maraba1.name);
        maraba1.sigorta();// concrete method obj ile call edildi
     IdariPersonel cnc=new IdariPersonel();
     cnc.name="dilek hanım";
     cnc.sigorta();
     cnc.maasBilgisi();
     cnc.maasHesapla();
        System.out.println("cnc.name = " + cnc.name);

    }
}
