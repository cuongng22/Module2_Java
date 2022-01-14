package Bai3.manager;

import Bai3.model.CardBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    ArrayList<CardBook> cardBooks;
    Scanner scanner = new Scanner(System.in);

    public Manager() {
        this.cardBooks = new ArrayList<>();
    }

    public CardBook createCardBook() {
        System.out.println("Nhap ho ten sv!");
        String name = scanner.nextLine();
        System.out.println("Nhap ngay sinh:");
        String birthDay = scanner.nextLine();
        System.out.println("Nhap ma sinh vien");
        String id = scanner.nextLine();
        System.out.println("Nhap lop dang hoc: ");
        String classes = scanner.nextLine();
        System.out.println("Nhap so phieu muon sach: ");
        int num1 = scanner.nextInt();
        System.out.println("Nhap ngay muon: ");
        scanner.nextLine();
        String startDay = scanner.nextLine();
        System.out.println("Nhap ngay tra: ");
        String endDay = scanner.nextLine();
        System.out.println("Nhap ma cua cuon sach: ");
        int idBook = scanner.nextInt();
        CardBook cardBook = new CardBook(name, birthDay, id, classes, num1, startDay, endDay, idBook);
        cardBooks.add(cardBook);
        return cardBook;
    }

    public void displayAll() {
        for (CardBook cardBook : cardBooks){
            System.out.println(cardBook);
        }
    }
    public void searchByName() {
        boolean check =false;
        ArrayList<CardBook> cardBook1 = new ArrayList<>();
        System.out.println("Nhap ten muon kiem tra: ");
        String name = scanner.nextLine();
        for (CardBook cardBook : cardBooks) {
            if (cardBook.getName().equals(name)){
                cardBook1.add(cardBook);
                check = true;
            }
        }
        if (check) {
            for (CardBook c : cardBook1) {
                System.out.println(c);
            }
        } else System.out.println("ko tim thay ten");
    }

    public void searchByIdBook() {
        System.out.println("nhap vao id book");
        int idBook = scanner.nextInt();
        CardBook cardBook123 = null;
        for (CardBook cardBook : cardBooks) {
            if (cardBook.getIdBook()==idBook) {
                cardBook123 = cardBook;
                break;
            }
        }
        if (cardBook123 != null) {
            System.out.println(cardBook123);
        } else System.out.println("k tim thay id book");
    }
}
