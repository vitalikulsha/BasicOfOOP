package Task_05A_FlowerArrangement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class FlowerArrangement {
    protected String name;
    protected String packaging;
    protected List<String> flowers = new ArrayList<>();
    protected int price;

    public void prepare() {
        System.out.println("Подготовка цветочной композиции \"" + name + "\":");
        System.out.println(" подготовить упаковку: " + packaging);
        System.out.println(" подготовить цветы: ");
        for (String flower : flowers) {
            System.out.println("\t- " + flower);
        }
    }

    public void collect() {
        System.out.println("Собрать цветочную композицию.");
    }

    public void pack() {
        System.out.println("Упаковать цветочную композицию.");
    }

    public void pay() {
        System.out.println("Стоимость цветочной композиции " + price + " руб.");
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowerArrangement that = (FlowerArrangement) o;
        return price == that.price && Objects.equals(name, that.name) &&
                Objects.equals(packaging, that.packaging) && Objects.equals(flowers, that.flowers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, packaging, flowers, price);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String flower : flowers) {
            sb.append(flower + ", ");
        }
        return name + ':' +
                "\n- упаковка '" + packaging + '\'' +
                "\n- цветы: " + sb.substring(0, sb.length() - 2).toString() +
                "\n- цена = " + price + " руб.";
    }
}
