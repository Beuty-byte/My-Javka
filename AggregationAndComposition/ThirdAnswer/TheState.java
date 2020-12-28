package AggregationAndComposition.ThirdAnswer;

import java.util.Arrays;
import java.util.Objects;

public class TheState implements CountSquare{
    private Region[] regions;
    private String stateName;
    protected double regionsSquare;

    public TheState(Region[] state, String stateName) {
        this.regions = state;
        this.stateName = stateName;
    }

    public void  displayTheCapital(){
        for (int i = 0; i < regions.length; i++) {
            if(regions[i].getCapital().equals("It's Capital")){
                System.out.println("This is capital "+ regions[i].getRegionName());
            }
        }
    }

    public void amountRegion(){
        int count = 0;
        for (int i = 0; i < regions.length; i++) {
            count++;
        }
        System.out.println("Amount regions = "+count);
    }
    
//    public void countSquare(){
//        double count = 0;
//        for (int i = 0; i < regions.length; i++) {
//            for (int j = 0; j < regions[i].getRegion().length; j++) {
//                for (int k = 0; k < regions[i].getRegion()[j].getCity().length; k++) {
//                    count+= regions[i].getRegion()[j].getCity()[k].getSquare();
//                }
//            }
//        }
//        System.out.println("Square country = "+count);
//    }

    public void showAllRegionName(){
        for (int i = 0; i < regions.length; i++) {
            System.out.println("Region name = "+ regions[i].getRegionName());
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TheState state1 = (TheState) o;
        return Arrays.equals(regions, state1.regions) &&
                Objects.equals(stateName, state1.stateName);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(stateName);
        result = 31 * result + Arrays.hashCode(regions);
        return result;
    }

    @Override
    public double countSquare() {
        for (int i = 0; i < regions.length; i++) {
            regionsSquare+=regions[i].countSquare();
        }
        return regionsSquare;
    }
}
