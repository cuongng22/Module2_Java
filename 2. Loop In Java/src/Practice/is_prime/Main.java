package Practice.is_prime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiểm tra số nguyên tố!");
        System.out.print("Nhập vào số cần kiểm tra: ");
        int num = scanner.nextInt();
        boolean check = false;
        if (num < 2) {
            System.out.println(num + " không phải snt");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = true;
                    break;
                }
            }
        }

        if (check) {
            System.out.println(num + " ko là snt");
        } else System.out.println(num + " là snt");
    }
}
