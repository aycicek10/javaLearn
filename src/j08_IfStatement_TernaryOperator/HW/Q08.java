package j08_IfStatement_TernaryOperator.HW;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
        System.out.println("alınan ürün adedi: ");
        int ürün=sc.nextInt();
        System.out.println("liste fiyatı: ");
        double fiyat=sc.nextDouble();
        System.out.println("müsteri kartı var mı: ");
        boolean kart=sc.hasNext();
        //double fatura=0;
        double ind=(ürün*fiyat)-((ürün*fiyat)*0.20);


/* ftr=0 yazıp toplam tutar üzeindende olabilir ya da aşşada olduğu gibi direk indirimi tanımlayıp daolabilri

 */


        if (kart==true){
            if(ürün>10){
                System.out.println("ind = " + ind);
            }
                //fatura=(ürün*fiyat)*0.8;
          //  }else fatura=(ürün*fiyat)*0.85;
            System.out.println(ind);
        }

       //else if(kart==false){
       //    if(ürün>10) {
       //        fatura=(ürün*fiyat)*0.85;
       //    }
       //    if(ürün<10){
       //        fatura=(ürün*fiyat)*0.90;
       //        System.out.println("fatura = " + fatura);
       //    }
       //    else System.out.println("hatalı giriş");

       //}

























    }

}
