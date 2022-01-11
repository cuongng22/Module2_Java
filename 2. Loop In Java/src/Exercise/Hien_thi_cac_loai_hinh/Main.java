package Exercise.Hien_thi_cac_loai_hinh;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    rec();
                    break;
                case 2:
                    triangle();
                    break;
                case 3:
                    triangle3();
                    break;
                default:
                    System.out.println("Vui long lam lai! ");
            }
        } while (choice != 0);
    }

    public static void rec() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangle() {
        int choice1 = -1;
        Scanner input1 = new Scanner(System.in);
        while (choice1 != 0) {
            System.out.println("Triangle: ");
            System.out.println("1. The square triangle botton-left");
            System.out.println("2. The square triangle top-left");
            System.out.println("0. Exit");
            System.out.print("In choice: ");
            choice1 = input1.nextInt();

            switch (choice1){
                case 1:
                    triangle1();
                    break;
                case 2:
                    triangle2();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("chon lai di!");
            }
        }
    }

    public static void triangle1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangle2() {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void triangle3() {
        int k = 0;
        for (int i = 1; i <= 5; i++, k = 0) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("   ");
            }
            while (k != 2 * i - 1) {
                System.out.print(" * ");
                k++;
            }
            System.out.println();
        }
    }
}
