package Applying_Factory_Method;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Diện tích = d*r");
        System.out.println("Chu vi = 2*(d+r)");
    }
}
