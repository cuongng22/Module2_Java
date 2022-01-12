package Exercise.QuadraticEquation;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double  getDiscriminant() {
        return (b*b-4*a*c);
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
