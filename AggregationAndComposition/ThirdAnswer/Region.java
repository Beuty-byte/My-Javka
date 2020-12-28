package AggregationAndComposition.ThirdAnswer;

public class Region implements CountSquare{
    private City[] region;
    private String regionName;
    private String capital = "null";
    protected double regionSquare;

    public Region(City[] region, String regionName) {
        this.region = region;
        this.regionName = regionName;
    }

    public Region(City[] region, String regionName, String capital) {
        this.region = region;
        this.regionName = regionName;
        this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }

    public String getRegionName() {
        return regionName;
    }

    public City[] getRegion() {
        return region;
    }

    @Override
    public double countSquare() {
        for (int i = 0; i < region.length; i++) {
            regionSquare+=region[i].countSquare();
        }
        return regionSquare;
    }
}
