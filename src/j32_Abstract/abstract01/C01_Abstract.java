package j32_Abstract.abstract01;

public class C01_Abstract {
    /*
    1- Bazı durumlarda child classlar parent classtaki methodların genellikle bodylerine degistirerek override ederler
    Bu gibi durumlarda parent classdaki methoda body tanımlamak ram ve memory acısından gereksizdir
    Çözüm olarak java parent class a bodysiz -- abstract(soyut) methodlar tanımlamıstır

    2- Parent class'daki abstract methodlar app güvenliği acısından child class'da override edilmek zorundadır
    Eger parent class'daki child class'ın mutlaka kullanması gereken method varsa abstract tanımlanmalı
    motor() her aracta olmalı

    3- Abstract method tanımlamak icin

    a- {} body olmaz
    b- acces modify sonrası abstract keyword kullanılmalı
    c- abs method icinde abstract keyword ve {} body bir arada kullanılamaz aksi halde cte
    abstrack class tanımlamak için class ifadesinden önce abstract keyword kullanılmalı.
    4- Abs method sadece abs Class'da tanımlanabilir kesinlikle concrete class'da abs method tanımlanamaz.
            ama abs class'da concerete emthod tanımlanabilir

    5- Abs class icinde hem abs method hem de concrete method ve variable tanımlanabilir

    6- Bir concrete child class parent abs class extend ettiğinde abs method'ları implement etmek zorunda
    ancak concrete methodlar isteğe göre override edilir

    7- parent child iliski olan abstract class'lar abs method'ları implement etmek zorunda

    8- Parent olan abs class birden cok concrete veya abs child class extends edilebilir
    ancak child class birden cok abs parent class'dan extend edilemez

    9- Abs Class'da final ve abs method tanımlanamaz cte verir -- final method override edilemeyeceğinden
    10- Abs Class'da private ve abs method tanımlanamaz cte verir
    11- Abs Class'da static ve abs method tanımlanamaz cte verir






     */
}
