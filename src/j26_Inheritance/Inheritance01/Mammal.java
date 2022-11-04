package j26_Inheritance.Inheritance01;

public class Mammal extends Hayvancık {// hayvancık parentin child classı dır -- baba
    public Mammal() {//p siz cons

        System.out.println("agam hayvancık** p'siz cons..");
    }
    public void sutBeslenme(){
        System.out.println("bebeleri süt ile beslenir");
    }
    public void dogum(){
        System.out.println("bebesini dogurup analık eder");
    }
}
