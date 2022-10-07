package j12_Loops.L01_ForLoop;

public class C03_NestedLoop {
    public static void main(String[] args) {
/*
eğer bir döngünün bodysinde başka bir döngü bulunuyorsa bu tür döngülere nested loop yani iç içe döngü denir.
iç döngü dış döngünün her adımında tekrar calısır. iç içe döngülerde en içteki döngü en önce çalısır
 */

        for (int apt = 1; apt <=10; apt++) {
            System.out.println("apt döngü: " + apt);

            for (int daire = 1; daire < 6; daire++) {
                System.out.println("apt" + apt + "için iç döngü j: " + daire);
            }
        }














    }
}
