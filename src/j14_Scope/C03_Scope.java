package j14_Scope;

public class C03_Scope {
    public static void main(String[] args) {


        C01_InstanceVariable kus=new C01_InstanceVariable();
        kus.name="Hüma";
        kus.developerMı=false;

        System.out.println("kus.name = " + kus.name);//hüma

        C01_InstanceVariable.staticMethod();//class name ile staticmethod call edildi
        kus.non_static();// obj ile call edildi - non static

    }
}
