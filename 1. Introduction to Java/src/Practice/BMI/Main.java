package Practice.BMI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your weight (in kilogram):");
        double weight = scanner.nextDouble();
        System.out.print("Your height (in meter):");
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height, 2);

    }
}
