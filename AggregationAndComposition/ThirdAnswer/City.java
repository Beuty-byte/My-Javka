package AggregationAndComposition.ThirdAnswer;

public class City implements CountSquare{
    private District[] city;
    private String cityName;
    protected double citySquare = 0;

    public City(District[] districts, String cityName) {
        this.city = districts;
        this.cityName = cityName;
    }

    public District[] getCity() {
        return city;
    }

    public String getCityName() {
        return cityName;
    }

    @Override
    public double countSquare() {
        for (int i = 0; i < city.length; i++) {
            citySquare+=city[i].getSquare();
        }
        return citySquare;
    }
}
