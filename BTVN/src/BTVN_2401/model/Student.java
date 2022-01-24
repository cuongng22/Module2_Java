package BTVN_2401.model;

public class Student {
    private int id;
    private String name;
    private String address;
    private String classes;
    protected double point;

    public Student() {
    }

    public Student(int id, String name, String address, String classes, double point) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.classes = classes;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", classes='" + classes + '\'' +
                ", point=" + point +
                '}';
    }
}
