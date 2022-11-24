package Java_depo.pr2;

public abstract class Main implements GirisCikisInterface {
    public static void main(String[] args) {


        Main depoCalis = new Main() {
            @Override
            public void girisPaneli() {

            }

            @Override
            public void cikisYap() {

            }
        };
        depoCalis.girisPaneli();
    }



}

