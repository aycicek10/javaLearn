package j32_Abstract.Ornek03;

public abstract class Salad extends Food{
    public abstract void madeIn();

    @Override
    public void taste() {
        System.out.println("agam salatanı gavurdagı coban sögüs mü verelim");
    }
}
