package Bai2.Model;


public class Bill extends  Customer  {
    private int oldIndex;
    private int newIndex;

    public Bill() {
    }

    public Bill(String name, int homeNumber, int idElectric, int oldIndex, int newIndex) {
        super(name, homeNumber, idElectric);
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    @Override
    public String toString() {
        return "Bill{" + super.toString()+
                "oldIndex=" + oldIndex +
                ", newIndex=" + newIndex +
                '}';
    }
}
