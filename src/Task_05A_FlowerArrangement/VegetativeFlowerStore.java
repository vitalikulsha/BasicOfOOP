package Task_05A_FlowerArrangement;

import Task_05A_FlowerArrangement.VegetativeFlowerArragement.*;

public class VegetativeFlowerStore extends FlowerStore {
    @Override
    protected FlowerArrangement createFlowerArrangement(String type) {
        if (type.equalsIgnoreCase("роза")) {
            return new VegetativeRoseFlowerArrangement();
        } else if (type.equalsIgnoreCase("астра")) {
            return new VegetativeAsterFlowerArrangement();
        } else if (type.equalsIgnoreCase("тюльпан")) {
            return new VegetativeTulipFlowerArrangement();
        } else {
            return null;
        }
    }
}
