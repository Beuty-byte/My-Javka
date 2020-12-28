package dragonAndHisTreasure;

public class DragonTreasure implements Comparable<DragonTreasure>{
    private String treasureName;
    private int treasureCost;

    public DragonTreasure(String treasureName, int treasureCost) {
        this.treasureName = treasureName;
        this.treasureCost = treasureCost;
    }

    public String getTreasureName() {
        return treasureName;
    }

    public void setTreasureName(String treasureName) {
        this.treasureName = treasureName;
    }

    public int getTreasureCost() {
        return treasureCost;
    }

    public void setTreasureCost(int treasureCost) {
        this.treasureCost = treasureCost;
    }

    @Override
    public int compareTo(DragonTreasure o) {
        int result = treasureCost - o.treasureCost;
        int value = 0;
        if(result > 0){
            value = 1;
        }else if(result < 0){
            value = -1;
        }
        return value;
    }
}
