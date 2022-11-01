package j25_Encapsulation.Encapsulation01;

public class C02_Encapsulation {// pojo class


  private String name="Gamze Hanım";
  private int id=1001;

    public C02_Encapsulation() {
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", id=" + id
               ;
    }

  // public String isimVer() {// getter method

  //     return name;
  // }
  // public int idVer() {// getter method

  //     return id;
  // }

  // public void setİsim(String isim) {//setter method
  //     this.name=isim;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    // }

    public C02_Encapsulation(String name, int id) {
        this.name = name;
        this.id = id;
    }

}
