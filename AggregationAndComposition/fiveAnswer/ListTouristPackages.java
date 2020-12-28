package AggregationAndComposition.fiveAnswer;

import java.util.Objects;

public class ListTouristPackages {

    private String nameListPackages;
    private String transport;
    private String food;
    private int amountDay;

    public ListTouristPackages(String nameListPackages, String transport, String food, int amountDay) {
        this.nameListPackages = nameListPackages;
        this.transport = transport;
        this.food = food;
        this.amountDay = amountDay;
    }

    public String getNameListPackages() {
        return nameListPackages;
    }

    public void setNameListPackages(String nameListPackages) {
        this.nameListPackages = nameListPackages;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAmountDay() {
        return amountDay;
    }

    public void setAmountDay(int amountDay) {
        this.amountDay = amountDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListTouristPackages that = (ListTouristPackages) o;
        return amountDay == that.amountDay &&
                Objects.equals(nameListPackages, that.nameListPackages) &&
                Objects.equals(transport, that.transport) &&
                Objects.equals(food, that.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameListPackages, transport, food, amountDay);
    }


}
