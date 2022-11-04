package j26_Inheritance.Task02;

public class SubClass extends SuperClass {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.myMetho();
    }
    int num = 10;
public void myMetho(){
    goster();
    super.goster();
    System.out.println("\"subclassnum\"+num = " + "subclassnum" + num);
    System.out.println("super.num = " + super.num);
}
    public  void goster() {
        System.out.println("Bu method Sub classsın görüntülenme methodudur. ");

    }

}
