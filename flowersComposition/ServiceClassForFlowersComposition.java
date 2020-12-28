package flowersComposition;

import java.util.ArrayList;
import java.util.List;

public class ServiceClassForFlowersComposition {

    public static List<Flower> generateFlowers(String flowerName, int amountFlowers){
        List<Flower> flowers = new ArrayList<>();
        for (int i = 0; i < amountFlowers; i++) {
            flowers.add(makeFlower(flowerName));
        }
        return flowers;
    }

    public static Flower makeFlower(String flowerName){
        if(flowerName.equals("Rose")){
            return new Rose(flowerName);
        }

        if(flowerName.equals("Violet")){
            return  new Violet(flowerName);
        }

        if(flowerName.equals("Tulip")){
            return  new Tulip(flowerName);
        }

        if(flowerName.equals("Carnation")){
            return new Carnation(flowerName);
        }

        throw new RuntimeException("Няма у нас таких цвятоу");
    }

    public static String[] splitInputElement(String inputString){
        return inputString.split(" ");
    }

}
