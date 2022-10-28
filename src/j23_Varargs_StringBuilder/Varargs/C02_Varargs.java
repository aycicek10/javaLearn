package j23_Varargs_StringBuilder.Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        /*
        arr ve varargs method
         */

        int arr[]={24,42,33,19,34,45,58,38};
        // task 1 -- array elemanları toplamını print eden method create ediniz
        // task 2 -- task1 varargs ile calısınız
// trick -- varargs method parametreleri array gibi tanımladığı için varargs methoda parametre olarak array de verilebilir
        System.out.println("arrTopla(arr) = " + arrTopla(arr));
        System.out.println("VarargsTopla(24,42,33,19,34,45,58,38) = " + VarargsTopla(24, 42, 33, 19, 34, 45, 58, 38));


    }

    public static int arrTopla(int[] a){
        int toplam=0;

        for (int w:a) {
            toplam+=w;
        }



        return toplam;
    }
public static int VarargsTopla(int ...b){
        int toplam=0;

        for (int s:b) {
            toplam+=s;
        }

    return toplam;
}

}
