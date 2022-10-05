package j11_MethodCreation;

public class C01_MethodCreation{

    public static void main(String[] args) {//maid method açılış






topla();//parametresiz return type olmayan void bir method call edildi

        System.out.println("agam bu yazıyı okuduysan bu method call oldu");


topla2(34,43);

//Bir methodu main methodun call etmek icin mutlaka static keyword kullanılmalı.
//Method parantezinin icinde olusturulan variable'lara "parametre" denir.
//Methodu call edilirken method parantezinin icine yazilan degerlere "Argument" denir.
//Parametrenin data type'i ile Argumentin data type'i 1'e 1 eslesmeli


        System.out.println(topla3());


        System.out.println(topla4("selam", 10));


    }//*********************** main method kapanış  ****************************************

    public static int topla4(String selam, int i) {//<string ve int parametreli int return eden method
        System.out.println(selam);

        return i*2;
    }


    // bir method Class'in icinde ama  main method'un disinda  cereate edilir
// Best practice-> method'lar main method'dan sonra create edilir.


    public static void topla (){//parametresiz return type olmayan void bir method'tur.
        int a=33;
        int b=23;
        System.out.println(a+b);
        System.out.println("topla methodundan selamlar");


    }
public static void topla2(int a, int b){//parametreli (2 int) void method
    System.out.println(a+b);
    System.out.println("bu method parametreli");

}

    public static int topla3() {// parametresiz int return type method

        int a=72;
        int b=63;

        return a+b;

    }

 /*
 code okunabilirliği ve sadeliği için sürekli kullanılan aksiynlar için method create edip
    main method'a call edip run etmek uygulamanın test edilmesi mantanance ve reusable açısından tercih edilir
    1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
    parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

    str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                          bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                          bana rapor olarak ne getirdigini bilmem lazim (true/false)

    2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

    3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
       de oldugu gibi
       disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
       deklare edilmeli

       method call edildiğinde  Parametre olarak
       declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
*/






}// class kapanışı
