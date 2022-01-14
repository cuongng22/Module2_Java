package Bai4.model;

public class City {
    private int numPer;
    private int idHouse;
    private Human human;

    public City() {
    }

    public City(int numPer, int idHouse, Human human) {
        this.numPer = numPer;
        this.idHouse = idHouse;
        this.human = human;
    }

    public int getNumPer() {
        return numPer;
    }

    public void setNumPer(int numPer) {
        this.numPer = numPer;
    }

    public int getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(int idHouse) {
        this.idHouse = idHouse;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public String toString() {
        return "City{" +
                "numPer=" + numPer +
                ", idHouse=" + idHouse +
                ", human=" + human +
                '}';
    }
}
