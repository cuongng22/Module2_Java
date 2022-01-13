package Bai1.Main;

import Bai1.Manager.HotelManager;
import Bai1.Manager.HumanManager;
import Bai1.Model.Human;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final HumanManager humanManager = new HumanManager();
    private static final HotelManager hotelManager = new HotelManager();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1.Quản lí Human ");
            System.out.println("2. Quản lí Hotel ");
            System.out.println("0. Exit");
            System.out.println("NHập vào lựa chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    menuHuman();
                    break;
                case 2:
                    menuHotel();
                    break;
            }
        } while (choice != 0);
    }

    public static void menuHuman() {
        int choice1;
        do {
            System.out.println("Menu Human");
            System.out.println("1. Tạo 1 human");
            System.out.println("2. Xóa 1 human theo idCard");
            System.out.println("3. Hiển thị 1 human theo idCard");
            System.out.println("4. Hiển thị tất cả human");
            System.out.println("0. Exit");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choice1 = scanner.nextInt();
            switch (choice1) {
                case 1:
                    humanManager.creatHuman();
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Nhập vào cmnd của ng muốn xoá: ");
                    String id = scanner.nextLine();
                    humanManager.deleteHuman(id);
                    break;
                case 3:
                    System.out.println("Nhập vào cmnd: ");
                    String id1 = scanner.nextLine();
                    humanManager.deleteHuman(id1);break;
                case 4:
                    humanManager.displayAll();break;
            }
        } while (choice1 != 0);
    }

    public static void menuHotel() {
        int choice2;
        do {
            System.out.println("-----MenuHotel-----");
            System.out.println("1. Thuê phòng trọ");
            System.out.println("2. Trả phòng trọ");
            System.out.println("3. Hiển thị các khách trọ");
            System.out.println("4. Hiển thị các phòng trọ của khách trọ");
            System.out.println("0. Exit");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choice2 = scanner.nextInt();

            switch (choice2) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Nhập vào cmnd của khách muốn thuê: ");
                    String cmt2 = scanner.nextLine();
                    Human human = humanManager.getHuman(cmt2);
                    if (human != null) {
                        System.out.println(hotelManager.createHotel(human));
                    } else {
                        System.out.println("Human trên không tồn tại!");
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào idCard");
                    String cmt1 = scanner.next();
                    System.out.println("Số tiền phải trả là: ");
                    System.out.println(hotelManager.payForRoom(cmt1));
                    break;
                case 3:
                    hotelManager.displayRoomTenants();
                    break;
                case 4:
                    System.out.println("Nhập vào cmnd");
                    String cmt = scanner.next();
                    hotelManager.displayRoomOfHuman(cmt);
                    break;
            }
        } while (choice2 != 0);
    }
}
