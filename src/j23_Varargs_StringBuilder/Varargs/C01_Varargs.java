package j23_Varargs_StringBuilder.Varargs;

public class C01_Varargs {
    public static void main(String[] args) {
        /*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        meyhod budy....
        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli
         */

        // Task -> verilen 3 toplamını print eden METHOD create ediniz

        int sayı1=24;
        int sayı2=27;
        int sayı3=46;
        int sayı4=10;

        toplaVarargs(sayı1,23,sayı2,sayı3);
        toplaVarargs(sayı1,sayı3);
        toplaVarargs(sayı2,sayı3);




    }

    public static void toplaVarargs(int ... a){
        int toplam=0;
        for(int w:a){
            toplam+=w;
        }
        System.out.println("sayılar toplamı : " + (toplam));
    }
}
