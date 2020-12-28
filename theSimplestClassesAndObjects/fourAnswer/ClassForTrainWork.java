package theSimplestClassesAndObjects.fourAnswer;

public class ClassForTrainWork {

    public static Train[] sortTrainToTrainNumber(Train[] trains){
        boolean isSorted = false;
        Train buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < trains.length-1; i++) {
                if(trains[i].getTrainNumber() > trains[i+1].getTrainNumber()){
                    isSorted = false;
                    buf = trains[i];
                    trains[i] = trains[i+1];
                    trains[i+1] = buf;
                }
            }
        }
        return trains;
    }

    public static void getInformationAboutTrain(int trainNumber,Train[] trains){
        for (int i = 0; i < trains.length; i++) {
            if(trains[i].getTrainNumber() == trainNumber){
                System.out.println(trains[i].toString());
            }
        }
    }

    public static Train[] sortTrainToDestinationName(Train[] trains){
        boolean isSorted = false;
        Train buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < trains.length-1; i++) {
                if(0 < trains[i].getDestinationName().compareTo(trains[i+1].getDestinationName())){
                    isSorted = false;
                    buf = trains[i];
                    trains[i] = trains[i+1];
                    trains[i+1] = buf;
                }
                if(0 == trains[i].getDestinationName().compareTo(trains[i+1].getDestinationName())){
                    if(0 < trains[i].getDepartureTime().compareTo(trains[i+1].getDepartureTime())){
                        isSorted = false;
                        buf = trains[i];
                        trains[i] = trains[i+1];
                        trains[i+1] = buf;
                    }
                }
            }
        }
        return trains;
    }
}
