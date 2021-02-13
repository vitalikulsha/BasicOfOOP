package Task_05A_FlowerArrangement;

import Task_05A_FlowerArrangement.BoxFlowerArrangement.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BoxDepartmentFlowerStore extends FlowerStore {

    //база типов цветочных композиций в коробке
    protected static List<String> typeBoxList = new ArrayList<>() {
        {
            this.add("коробка из роз");
            this.add("коробка из астр");
            this.add("коробка из тюльпанов");
        }
    };

    @Override
    protected FlowerArrangement createFlowerArrangement(String type) {
        if (type.equalsIgnoreCase(typeBoxList.get(0))) {
            return new BoxRoseFlowerArrangement();
        } else if (type.equalsIgnoreCase(typeBoxList.get(1))) {
            return new BoxAsterFlowerArrangement();
        } else if (type.equalsIgnoreCase(typeBoxList.get(2))) {
            return new BoxTulipFlowerArrangement();
        } else {
            return null;
        }
    }
}
