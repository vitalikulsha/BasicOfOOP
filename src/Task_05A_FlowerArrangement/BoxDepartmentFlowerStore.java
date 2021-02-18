package Task_05A_FlowerArrangement;

import Task_05A_FlowerArrangement.BoxFlowerArrangement.*;

import java.util.ArrayList;
import java.util.List;


public class BoxDepartmentFlowerStore extends FlowerStore {

    //база типов цветочных композиций в коробке
    protected final static List<String> TYPE_BOX_LIST = new ArrayList<>() {
        {
            this.add("коробка из роз");
            this.add("коробка из астр");
            this.add("коробка из тюльпанов");
        }
    };

    @Override
    protected FlowerArrangement createFlowerArrangement(String type) {
        if (TYPE_BOX_LIST.get(0).equalsIgnoreCase(type)) {
            return new BoxRoseFlowerArrangement();
        } else if (TYPE_BOX_LIST.get(1).equalsIgnoreCase(type)) {
            return new BoxAsterFlowerArrangement();
        } else if (TYPE_BOX_LIST.get(2).equalsIgnoreCase(type)) {
            return new BoxTulipFlowerArrangement();
        } else {
            return null;
        }
    }
}
