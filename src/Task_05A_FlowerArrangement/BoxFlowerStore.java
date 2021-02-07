package Task_05A_FlowerArrangement;

import Task_05A_FlowerArrangement.BoxFlowerArrangement.*;

public class BoxFlowerStore extends FlowerStore {

    @Override
    protected FlowerArrangement createFlowerArrangement(String type) {
        if (type.equalsIgnoreCase("роза")) {
            return new BoxRoseFlowerArrangement();
        } else if (type.equalsIgnoreCase("астра")) {
            return new BoxAsterFlowerArrangement();
        } else if (type.equalsIgnoreCase("тюльпан")) {
            return new BoxTulipFlowerArrangement();
        } else {
            return null;
        }
    }
}
