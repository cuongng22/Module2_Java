package Bai1.Model;
public class Human {
    private String name;
    private String birthDay;
    private String cmnd;

    public Human() {
    }

    public Human(String name, String birthDay, String cmnd) {
        this.name = name;
        this.birthDay = birthDay;
        this.cmnd = cmnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", cmnd='" + cmnd + '\'' +
                '}';
    }
}
