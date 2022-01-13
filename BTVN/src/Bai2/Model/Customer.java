package Bai2.Model;


public class Customer  {
    private String name;
    private int homeNumber;
    private int IdElectric;

    public Customer() {
    }

    public Customer(String name, int homeNumber, int idElectric) {
        this.name = name;
        this.homeNumber = homeNumber;
        IdElectric = idElectric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public int getIdElectric() {
        return IdElectric;
    }

    public void setIdElectric(int idElectric) {
        IdElectric = idElectric;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", homeNumber=" + homeNumber +
                ", IdElectric=" + IdElectric ;
    }
}
