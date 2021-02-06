package Task_05A_FlowerArrangement;

import Task_05A_FlowerArrangement.DecorativeFlowerArrangement.*;

public class DecorativeFlowerStore extends FlowerStore {

    @Override
    protected FlowerArrangement createFlowerArrangement(String type) {
        if (type.equalsIgnoreCase("роза")) {
            return new DecorativeRoseFlowerArrangement();
        } else if (type.equalsIgnoreCase("астра")) {
            return new DecorativeAsterFlowerArrangement();
        } else if (type.equalsIgnoreCase("тюльпан")) {
            return new DecorativeTulipFlowerArrangement();
        } else {
            return null;
        }
    }
}
