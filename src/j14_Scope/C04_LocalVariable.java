package j14_Scope;

public class C04_LocalVariable {
    public static void main(String[] args) {//main bası

        int yas=33;// main method local variable

        System.out.println("yas = " + yas);

        for (int i = 0; i < 7; i++) {//for bası

            System.out.print(yas+ " ");// local variable aynı locale call edildi

            i++;// local varaible loop ici call edildi
        }// for sonu
        //i=34;// local dısı call edilemez

        yas=35;// local variable localinden call edildi







    }//main sonu ***
    //yas=48; local dısı call edilemez

}
