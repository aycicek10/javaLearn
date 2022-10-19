package j18_Constructor;

public class C04_teacherRunner {
    public static void main(String[] args) {

        C04_teacher ogrt1=new C04_teacher();// ogrt1 obj create edildi

        ogrt1.ad="muarreem";
        ogrt1.soyad="güzel";
        ogrt1.brans="qa";
        ogrt1.emekli=false;
        ogrt1.maas=23000;
        ogrt1.tecrübe=5;

        ogrt1.dersSaati();
        System.out.println(ogrt1);

        C04_teacher ogrt2=new C04_teacher("ugur","javacan","dev ",15,100,333,false);

        System.out.println(ogrt2);
    }
}
