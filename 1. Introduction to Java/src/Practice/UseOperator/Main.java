package Practice.UseOperator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        double height = scanner.nextDouble();
        System.out.println("Nhập chiều rộng: ");
        double width = scanner.nextDouble();

        System.out.println("Diện tích của hcn là: " + height * width + "(dvdt)");
    }
}
