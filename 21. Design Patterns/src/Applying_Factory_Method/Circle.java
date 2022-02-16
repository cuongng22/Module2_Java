package Applying_Factory_Method;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Diện tích = π*r²");
        System.out.println("Chu vi = 2*π*r");
    }
}
