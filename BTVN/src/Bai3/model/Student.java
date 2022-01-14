package Bai3.model;

public class Student {
    private String name;
    private String birthDay;
    private String id;
    private String classes;

    public Student() {
    }

    public Student(String name, String birthDay, String id, String classes) {
        this.name = name;
        this.birthDay = birthDay;
        this.id = id;
        this.classes = classes;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", id='" + id + '\'' +
                ", classes='" + classes ;
    }
}
