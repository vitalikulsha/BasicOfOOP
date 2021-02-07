package Task_05A_FlowerArrangement;

import Task_05A_FlowerArrangement.BouquetFlowerArragement.*;

public class BouquetDepartmentFlowerStore extends FlowerStore {
    @Override
    protected FlowerArrangement createFlowerArrangement(String type) {
        if (type.equalsIgnoreCase("роза")) {
            return new BouquetRoseFlowerArrangement();
        } else if (type.equalsIgnoreCase("астра")) {
            return new BouquetAsterFlowerArrangement();
        } else if (type.equalsIgnoreCase("тюльпан")) {
            return new BouquetTulipFlowerArrangement();
        } else if (type.equalsIgnoreCase("лилия")) {
            return new BouquetLilyFlowerArrangement();
        } else {
            return null;
        }
    }
}
