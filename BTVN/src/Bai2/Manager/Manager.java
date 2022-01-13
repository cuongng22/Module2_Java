package Bai2.Manager;

import Bai2.Model.Bill;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    ArrayList<Bill> bills;
    Scanner scanner = new Scanner(System.in);

    public Manager() {
        this.bills = new ArrayList<>();
    }

    public Bill createBill() {
        System.out.println("Nhập tên chủ hộ: ");
        String name = scanner.nextLine();
        System.out.println("Nhập số nhà: ");
        int numHouse = scanner.nextInt();
        System.out.println("Nhập mã: ");
        int id = scanner.nextInt();
        checkId(id);
        System.out.println("Nhập số điện cũ: ");
        int oldBill = scanner.nextInt();
        System.out.println("Nhập số điện mới; ");
        int newBill = scanner.nextInt();
        scanner.nextLine();
        checkNew(newBill, oldBill);
        System.out.println("Tạo thành công");
        Bill bill = new Bill(name,numHouse, id, oldBill, newBill);
        bills.add(bill);
        return bill;
    }

    public void displayAll() {
        for (Bill bill : bills) {
            System.out.println(bill);
        }
    }

    public int getMoney(int id) {
        int numberElectric = 0;
        Bill bill1 = null;
        for (Bill bill : bills) {
            if (bill.getIdElectric() == id) {
                bill1 = bill;
            }
        }
        if (bill1 != null) {
            numberElectric = bill1.getNewIndex() - bill1.getOldIndex();
        } else System.out.println("Nhập lại Id");
        return numberElectric*750;
    }

    public int checkId(int id) {
        for (Bill bill : bills) {
            while (bill.getIdElectric()==id) {
                System.out.println("trùng id, nhập lại");
                id = scanner.nextInt();
            }
        }
        return id;
    }

    public int checkNew(int newBill, int oldBill) {
        while (oldBill >= newBill) {
            System.out.println("Vui lòng nhập lại");
            newBill = scanner.nextInt();
        }
        return newBill;
    }
}
