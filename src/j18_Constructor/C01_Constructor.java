package j18_Constructor;

public class C01_Constructor {
      /*
        1- Constructor ismi Class name ile aynı olmalı.Buyuk harf ile baslamalı
        2- constructor create edildiğinde nameden sonra (){} mutlaka kullanılmalı
        3- eger p'li cons create edildiğinde java default cons ezer(siler)
        4- cons. retrun type olmaz method'dan ayıran özelliğidir
        5- Class olustugunda java default cons kendi create eder
         */


    String str;
    String selam="güzel insan";






    public static void main(String[] args) {



        // class name     obj name    new keyword   default cons
         C01_Constructor     obj1      =new        C01_Constructor();
         C01_Constructor     obj2      =new        C01_Constructor();
         C01_Constructor     obj3      =new        C01_Constructor();
         C01_Constructor     obj4      =new        C01_Constructor();

         obj1.str="javacan";// str ins variable obj1 ile call edilerek ob1 degeri atandı

      obj2.str="javatar";// str ins variable obj2 ile call edilerek obj2 degeri atandı
        System.out.println("obj3.selam = " + obj3.selam);

        System.out.println("obj1.str = " + obj1.str);
        System.out.println("obj2.str = " + obj2.str);
        System.out.println("obj4.str = " + obj4.str);

        obj3.aga();//agama selamkeee







    }

    public  void aga(){
        System.out.println("agama selamkeee");
    }



}
