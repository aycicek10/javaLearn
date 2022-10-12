package j14_Scope;

public class C01_InstanceVariable {
static String kurs="Clarus";

 /*                                  INSTANCE VARIABLE

   1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
      olusturulan variable'lara "instance variable" denir.
   2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
   3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
      Asagida goruldugu gibi "yas" variable'ina deger atamasi yaptim "tecrube" variable'ina yapmadim.
      Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
         "i" variable'i initialize edildi, digerleri initialize edilmedi.
   4) Initialize edilmeyen "instance variable" lar icin Java kendisi deger atamasi yapar.
      Java'nin instance variable'lara kendisinin verdigi degerlere "default value" denir.
            byte, short, int, long icin default value 0'dir.
            float, double icin default value 0.0'dir.
            char icin default value 0'dir.
            boolean icin default value false'dur.
            String icin default value "null" dir.

*/
// instance variable

        int yas = 48; //initialized ilk atamsı yapılmış ins. variable
        int tecrube;// default deger 0
        String name;// default deger null
        boolean developerMı;// deafult deger false
        double boy;// default deger 0.0
        char unvan;// default deger bosluk

        public static void main(String[] args) {//main bası
int a=7;//local variable
            System.out.println(a);
          //  System.out.println(yas);//inst değer ataması yapmadan isleme alınmaz non static oldugu için doğrudan call edilmez
            System.out.println(kurs);//static variable static methoda cagrıldı


            staticMethod();//statci method call edildi-astral seyahat- static olan main sadece static method call eder
            // non static method call edilemez


            // obje creation -> ClassName objName = new Classname();


            C01_InstanceVariable ebikagbık=new C01_InstanceVariable();// obj create edildi
            ebikagbık.boy=1.9;// instance variable obj ile call edilip update edildi
            ebikagbık.developerMı=true;
            ebikagbık.name="kubra";
            System.out.println(ebikagbık.name);// kubra yazar
            System.out.println("ebikagbık.tecrube = " + ebikagbık.tecrube);// default deger : 0
            ebikagbık.yas=33;
            System.out.println("ebikagbık.yas = " + ebikagbık.yas);//33

            C01_InstanceVariable obj1=new C01_InstanceVariable();// farklı bir obj isminde obj create edildi
            obj1.boy=1.75;
            obj1.name="ahmet";


        }// main sonu

    public void non_static(){// static olmayan method
        System.out.println("static olmayan methodtan selam");
    }

    public static void staticMethod(){// static method
        System.out.println("static yani günes methoddasın devamkeeee");
    }
}
