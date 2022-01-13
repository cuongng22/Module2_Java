package Bai1.Manager;

import Bai1.Model.Hotel;
import Bai1.Model.Human;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelManager {
    private ArrayList<Hotel> hotels;
    Scanner scanner = new Scanner(System.in);

    public HotelManager() {
        this.hotels = new ArrayList<>();
    }

    public Hotel createHotel(Human human) {
        System.out.println("Nhập vào ngày bắt đầu trọ: ");
        String date = scanner.nextLine();
        LocalDate startDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-LL-yyyy"));
        System.out.println("Nhập vào loại phòng: ");
        String kind = scanner.next();
        System.out.println("Nhập vào giá phòng: ");
        double price = scanner.nextDouble();
        Hotel hotel = new Hotel(startDate, kind, price, human);
        hotels.add(hotel);
        return hotel;
    }

    public void displayRoomTenants() {
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
    }

    public void displayRoomOfHuman(String cmnd) {
        for (Hotel hotel : hotels) {
            if (hotel.getHuman().getCmnd().equals(cmnd)) {
                System.out.println(hotel);
            }
        }
    }

    public double payForRoom(String cmnd) {
        ArrayList<Hotel> hotelPay = new ArrayList<>();
        double sumPrice = 0;
        for (Hotel hotel : hotels) {
            if (hotel.getHuman().getCmnd().equals(cmnd)) {
                sumPrice += hotel.getPrice() * (LocalDate.now().getDayOfYear() - hotel.getStartTime().getDayOfYear());
                hotelPay.add(hotel);
            }
        }
        hotels.removeAll(hotelPay);
        return sumPrice;
    }



}
