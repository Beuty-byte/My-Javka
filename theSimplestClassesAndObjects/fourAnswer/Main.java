package theSimplestClassesAndObjects.fourAnswer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Train train1 = new Train("Moscow",43,"18.00");
        Train train2 = new Train("Minsk",13,"11.33");
        Train train3 = new Train("Berlin",3,"9.43");
        Train train4 = new Train("London",11,"11.53");
        Train train5 = new Train("Paris",41,"1.03");
        Train train6 = new Train("Berlin",113,"9.45");

        Train[] trains = {train1,train2,train3,train4,train5,train6};

        trains = ClassForTrainWork.sortTrainToTrainNumber(trains);

        ClassForTrainWork.getInformationAboutTrain(43,trains);

        for (int i = 0; i < trains.length; i++) {
            System.out.println(trains[i].getDestinationName()+" "+trains[i].getDepartureTime());
        }

        trains = ClassForTrainWork.sortTrainToDestinationName(trains);

        System.out.println();
        for (int i = 0; i < trains.length; i++) {
            System.out.println(trains[i].getDestinationName()+" "+trains[i].getDepartureTime());
        }

    }
}
