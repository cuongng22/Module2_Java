package Exercise.Circle_Cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return height*super.getArea();
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
