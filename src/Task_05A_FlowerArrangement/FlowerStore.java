package Task_05A_FlowerArrangement;

public abstract class FlowerStore {
    public FlowerArrangement orderFlowerArrangement(String type) {
        FlowerArrangement flowerArrangement;
        flowerArrangement = createFlowerArrangement(type);
        flowerArrangement.prepare();
        flowerArrangement.collect();
        flowerArrangement.pack();
        flowerArrangement.pay();
        return flowerArrangement;
    }

    protected abstract FlowerArrangement createFlowerArrangement(String type);
}
