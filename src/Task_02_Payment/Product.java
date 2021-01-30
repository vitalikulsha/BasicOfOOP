package Task_02_Payment;

public class Product {
    private String name;
    private String manufacturer;
    private int price;

    public Product(String name, String manufacturer, int price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "наименование '" + name + '\'' +
                ", производитель '" + manufacturer + '\'' +
                ", цена " + price + " у.е.";
    }
}
