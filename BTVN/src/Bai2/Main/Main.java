package Bai2.Main;

import Bai2.Manager.Manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1.Tạo 1 bill mới");
            System.out.println("2.Hiển thị tất cả bill");
            System.out.println("3.Tính tiền cho 1 bill");
            System.out.println("0.Thoát");
            System.out.println("Vui lòng nhập lựa chọn:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manager.createBill();
                    break;
                case 2:
                    manager.displayAll();
                    break;
                case 3:
                    System.out.println("Nhập id muốn tính tiền: ");
                    int money = scanner.nextInt();
                    System.out.println(manager.getMoney(money));
            }
        } while (choice != 0);
    }
}
