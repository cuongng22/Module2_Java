package Bai3.model;

import java.time.LocalDate;

public class CardBook extends Student {
    private int numberCard;
    private String startDay;
    private String endDay;
    private int idBook;

    public CardBook() {
    }

    public CardBook(String name, String birthDay, String id, String classes, int numberCard, String startDay, String endDay, int idBook) {
        super(name, birthDay, id, classes);
        this.numberCard = numberCard;
        this.startDay = startDay;
        this.endDay = endDay;
        this.idBook = idBook;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    @Override
    public String toString() {
        return "CardBook{" +
                super.toString()+
                "numberCard=" + numberCard +
                ", startDay=" + startDay +
                ", endDay=" + endDay +
                ", idBook=" + idBook +
                '}';
    }
}
