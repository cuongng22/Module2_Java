package Bai1.Model;

import java.time.LocalDate;

public class Hotel {
    private LocalDate startTime;
    private String kindOfRoom;
    private double price;
    private Human human;

    public Hotel() {
    }

    public Hotel(LocalDate startTime, String kindOfRoom, double price, Human human) {
        this.startTime = startTime;
        this.kindOfRoom = kindOfRoom;
        this.price = price;
        this.human = human;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "startTime=" + startTime +
                ", kindOfRoom='" + kindOfRoom + '\'' +
                ", price=" + price +
                ", human=" + human +
                '}';
    }
}
