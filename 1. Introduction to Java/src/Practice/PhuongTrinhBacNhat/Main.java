package Practice.PhuongTrinhBacNhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Phương trình bậc nhất: ax + b = 0 ;");
        System.out.println("Nhập vào a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập vào b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm!");
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        } else System.out.println("Nghiệm của phương trình là x= "+ -b/a);
    }
}
