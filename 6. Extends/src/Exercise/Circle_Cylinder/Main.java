package Exercise.Circle_Cylinder;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5,8);
        Circle circle = new Circle(5);
        System.out.println(circle.getArea());
        System.out.println(cylinder.getArea());
    }
}
