package theSimplestClassesAndObjects.fourAnswer;

public class Train {
    private String destinationName;
    private int trainNumber;
    private String departureTime;

    public Train(String destinationName, int trainNumber, String departureTime) {
        this.destinationName = destinationName;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }


    @Override
    public String toString() {
        return "Train destination to "+this.destinationName+
                "\n"+
                " Train number = "+this.trainNumber+
                "\n"+
                "Departure time = "+this.departureTime;
    }
}
