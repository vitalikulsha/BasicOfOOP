package Task_05A_FlowerArrangement;

import Task_05A_FlowerArrangement.BouquetFlowerArragement.*;

import java.util.ArrayList;
import java.util.List;

public class BouquetDepartmentFlowerStore extends FlowerStore {

    //база типов цветочных композиций в букете
    protected static List<String> typeBouquetList = new ArrayList<>() {
        {
            this.add("букет из роз");
            this.add("букет из астр");
            this.add("букет из тюльпанов");
            this.add("букет из лилий");
        }
    };

    @Override
    protected FlowerArrangement createFlowerArrangement(String type) {
        if (type.equalsIgnoreCase(typeBouquetList.get(0))) {
            return new BouquetRoseFlowerArrangement();
        } else if (type.equalsIgnoreCase(typeBouquetList.get(1))) {
            return new BouquetAsterFlowerArrangement();
        } else if (type.equalsIgnoreCase(typeBouquetList.get(2))) {
            return new BouquetTulipFlowerArrangement();
        } else if (type.equalsIgnoreCase(typeBouquetList.get(3))) {
            return new BouquetLilyFlowerArrangement();
        } else {
            return null;
        }
    }
}
