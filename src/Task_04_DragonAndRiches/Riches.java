package Task_04_DragonAndRiches;

public class Riches {
    private String title;
    private int price;

    public Riches(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return getTitle() + ", price = " + getPrice();
    }
}
