package Exercise.ChuyenDoiTienTe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Chuyển dổi tiền tệ");
            System.out.println("1. Từ vnd sang usd ");
            System.out.println("2. Từ usd sang vnd ");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice= scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập vào số tiền: ");
                    double vnd = scanner.nextDouble();
                    System.out.println(vnd + " vnd =" + vnd / 23000 +" usd");
                    break;
                case 2:
                    System.out.println("Nhập vào số tiền: ");
                    double usd = scanner.nextDouble();
                    System.out.println(usd  + " usd =" + usd * 23000 +" vnd");
                    break;
            }
        } while (choice != 0);
    }

}
