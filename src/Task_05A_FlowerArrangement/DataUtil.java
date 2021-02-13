package Task_05A_FlowerArrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DataUtil {
    //база стилей цветочных композиций
    protected static List<String> styleList = new ArrayList<>() {
        {
            this.add("коробка");
            this.add("букет");
        }
    };

    //выбор цветочной композиции
    protected static FlowerArrangement selectFlowerArrangement() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Выберите стиль цветочной композиции из списка " + styleList.toString() + ": ");
        FlowerStore flowerStore = null;
        String style = null;
        List<String> typeList = null;
        while (true) {
            style = reader.readLine();
            if (styleList.get(0).equalsIgnoreCase(style)) {
                flowerStore = new BoxDepartmentFlowerStore();
                typeList = BoxDepartmentFlowerStore.typeBoxList;
                break;
            } else if (styleList.get(1).equalsIgnoreCase(style)) {
                flowerStore = new BouquetDepartmentFlowerStore();
                typeList = BouquetDepartmentFlowerStore.typeBouquetList;
                break;
            } else {
                System.out.print("Нет такой цветочной композиции, попробуйте еще раз. ");
            }
        }
        String type = selectType(reader, typeList);
        reader.close();
        return flowerStore.orderFlowerArrangement(type);
    }

    //выбор типа цветочной композиции
    private static String selectType(BufferedReader reader, List<String> typeList) throws IOException {
        for (String value : typeList) {
            System.out.println("- [" + value + ']');
        }
        System.out.print("Выберите тип цветочной композиции из представленного списка: ");
        while (true) {
            String type = reader.readLine();
            if (typeList.contains(type.toLowerCase())) {
                return type;
            } else {
                System.out.print("Нет такой цветочной композиции, попробуйте еще раз. ");
            }
        }
    }
}
