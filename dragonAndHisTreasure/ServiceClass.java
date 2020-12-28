package dragonAndHisTreasure;

import java.util.Collections;
import java.util.List;

public class ServiceClass {
    public static void choiceForTheAmount(List<DragonTreasure> dragonTreasures, Integer amountMoney){
        for (DragonTreasure el: dragonTreasures){
            if(el.getTreasureCost() <= amountMoney){
                System.out.println(el.getTreasureName()+" "+el.getTreasureCost());
            }
        }
    }

    public static void choiceDearestTreasure(List<DragonTreasure> dragonTreasures){
        DragonTreasure maxCost = Collections.max(dragonTreasures,DragonTreasure::compareTo);
        System.out.println(maxCost.getTreasureName()+" "+maxCost.getTreasureCost());
    }

    public static void showDragonTreasures(List<DragonTreasure> dragonTreasures){
        for (DragonTreasure el: dragonTreasures){
            System.out.println(el.getTreasureCost()+" "+el.getTreasureName());
        }
    }

    public static String[] costAndTreasureName(String oneItem){
        return oneItem.split("\\s+");
    }
}
