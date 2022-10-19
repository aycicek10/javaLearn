package j16_ArrayList.HW;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("kaçtane not girmek istersiniz");
        int notSayisi= sc.nextInt();
        int Notlar[]=new int[notSayisi];
        int toplam=0;
        int ortalamaUstu=0;
        int ortalamaltı=0;
        for (int i = 0; i < notSayisi; i++) {
            System.out.println("Notu Giriniz");
            Notlar[i] =sc.nextInt();
            toplam+=Notlar[i];


        }

        System.out.println("toplam="+toplam);
        int ortalama=ortalamaUstu/notSayisi;
        for (int i = 0; i <=Notlar.length-1; i++) {
            if (Notlar[i]>=ortalama) {
                ortalamaUstu++;


            }else ortalamaltı++;

        }

        System.out.println("dersten geçenler="+ortalamaUstu);
        System.out.println("Dersten kalanlar="+ortalamaltı);














































    }
}
