package j25_Encapsulation.Encapsulation02;

public class Kisi {
    /*
    kisi polo class icin fields -- ad, soyad, password(string), yas
     tüm field ları password haric kullanıcı görebilmeli ve update edebilmeli
     password encopsulation edilmeli . yas variable negatif değer girmeye karsı encapsulated

     runner classd obj ile field ları print eden code create ediniz
     */

    String name;
    String surname;
   private String password;
   private int age;



    public Kisi(String name, String surname, String password, int age) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }


    public String getPassword() {
        return password;
    }


    public void setAge(int age) {
            this.age = Math.abs(age);// parametre gelen age - den kurtul


    }

    public int getAge() {
        return age;
    }
}
