package Task_05A_FlowerArrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Database {
    //база стилей цветочных композиций
    protected static Set<String> styleSet = new TreeSet<>() {
        {
            this.add("коробка");
            this.add("букет");
        }
    };
    //база типов цветочных композиций в коробке
    protected static Set<String> typeBoxSet = new TreeSet<>() {
        {
            this.add("роза");
            this.add("астра");
            this.add("тюльпан");
        }
    };
    //база типов цветочных композиций в букете
    protected static Set<String> typeBouquetSet = new TreeSet<>() {
        {
            this.add("роза");
            this.add("астра");
            this.add("тюльпан");
            this.add("лилия");
        }
    };

    //выбор цветочной композиции
    protected static FlowerArrangement selectFlowerArrangement(BufferedReader reader) throws IOException {
        System.out.print("Выберите стиль цветочной композиции из списка " + styleSet.toString() + ": ");
        FlowerStore flowerStore = null;
        String style = null;
        while (true) {
            style = reader.readLine();
            if (style.equalsIgnoreCase("коробка")) {
                flowerStore = new BoxFlowerStore();
                break;
            } else if (style.equalsIgnoreCase("букет")) {
                flowerStore = new BouquetFlowerStore();
                break;
            } else {
                System.out.print("Нет такой цветочной композиции, попробуйте еще раз. ");
            }
        }
        String type = selectType(reader, style);
        return flowerStore.orderFlowerArrangement(type);
    }

    //выбор типа цветочной композиции
    private static String selectType(BufferedReader reader, String style) throws IOException {
        FlowerArrangement flowerArrangement = null;
        Set<String> set = null;
        if (style.equalsIgnoreCase("коробка")) {
            set = typeBoxSet;
        } else {
            set = typeBouquetSet;
        }
        for (String value : set) {
            System.out.println(value);
        }
        System.out.print("Выберите тип цветочной композиции из списка: ");
        while (true) {
            String type = reader.readLine();
            if (set.contains(type.toLowerCase())) {
                return type;
            } else {
                System.out.print("Нет такой цветочной композиции, попробуйте еще раз. ");
            }
        }
    }
}
