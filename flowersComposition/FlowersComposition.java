package flowersComposition;

import java.util.ArrayList;
import java.util.List;

public class FlowersComposition {
    private List<Flower>  flowers = new ArrayList<>();
    private FlowerPackaging FlowerPackaging;

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void addFlowers(List<Flower> flowerList){
        flowers.addAll(flowerList);
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public FlowerPackaging getFlowerPackaging() {
        return FlowerPackaging;
    }

    public void setFlowerPackaging(flowersComposition.FlowerPackaging flowerPackaging) {
        FlowerPackaging = flowerPackaging;
    }
}
