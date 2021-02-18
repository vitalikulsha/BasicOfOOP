package Task_05A_FlowerArrangement;

import Task_05A_FlowerArrangement.BouquetFlowerArragement.*;

import java.util.ArrayList;
import java.util.List;

public class BouquetDepartmentFlowerStore extends FlowerStore {

    //база типов цветочных композиций в букете
    protected final static List<String> TYPE_BOUQUET_LIST = new ArrayList<>() {
        {
            this.add("букет из роз");
            this.add("букет из астр");
            this.add("букет из тюльпанов");
            this.add("букет из лилий");
        }
    };

    @Override
    protected FlowerArrangement createFlowerArrangement(String type) {
        if (TYPE_BOUQUET_LIST.get(0).equalsIgnoreCase(type)) {
            return new BouquetRoseFlowerArrangement();
        } else if (TYPE_BOUQUET_LIST.get(1).equalsIgnoreCase(type)) {
            return new BouquetAsterFlowerArrangement();
        } else if (TYPE_BOUQUET_LIST.get(2).equalsIgnoreCase(type)) {
            return new BouquetTulipFlowerArrangement();
        } else if (TYPE_BOUQUET_LIST.get(3).equalsIgnoreCase(type)) {
            return new BouquetLilyFlowerArrangement();
        } else {
            return null;
        }
    }
}
