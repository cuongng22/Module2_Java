package Applying_Factory_Method;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Diện tích = c²");
        System.out.println("Chu vi = 4*c");
    }
}
