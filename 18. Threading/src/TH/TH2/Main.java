package TH.TH2;

public class Main {
    public static void main(String[] args) {
        Car carA = new Car("BMW");
        Car carB = new Car("Audi");
        Car carC = new Car("Mec");

        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);

        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
