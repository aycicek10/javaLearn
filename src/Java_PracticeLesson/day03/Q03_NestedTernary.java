package Java_PracticeLesson.day03;

public class Q03_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {
        char not = 'F';
        String result = not == 'A' ? "gayet basarılı" : not == 'B' ? "basarılı" : not == 'C' ? "ha gayret" : "diğerleri";
        System.out.println("result = " + result);

    }
}
