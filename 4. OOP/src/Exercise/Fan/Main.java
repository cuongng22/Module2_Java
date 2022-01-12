package Exercise.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true, 5, "yellow");
        Fan fan2 = new Fan(2,false, 10, "blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
