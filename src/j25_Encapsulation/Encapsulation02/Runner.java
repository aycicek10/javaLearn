package j25_Encapsulation.Encapsulation02;

public class Runner {
    public static void main(String[] args) {
        Kisi obj1=new Kisi("ümit","k","umitK33",33);// obj create edildi

        System.out.println("obj1.name = " + obj1.name);
        obj1.name="ahmet";
        System.out.println("obj1.name = " + obj1.name);

        System.out.println("obj1.surname = " + obj1.surname);
        System.out.println("obj1.getPassword() = " + obj1.getPassword());
        obj1.setAge(-34);
        System.out.println("obj1.getAge() = " + obj1.getAge());


    }
}
