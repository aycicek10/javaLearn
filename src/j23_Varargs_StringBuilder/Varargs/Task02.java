package j23_Varargs_StringBuilder.Varargs;

public class Task02 {
    public static void main(String[] args) {
        // task -- girilen ilk sayı haric diğerlerini toplayan ve toplam ile ilk sayıyı carpan method create ediniz

        System.out.println("toplaCarp(2,24,23,38,33,21,59,26,10) = " + toplaCarp(2, 24, 23, 38, 33, 21, 59, 26, 10));


    }
    public static int toplaCarp(int carpılacakSayı,int...toplancakSayılar){
int toplam=0;
for (int a:toplancakSayılar){
    toplam+=a;
}

        return carpılacakSayı*toplam;
    }




}
