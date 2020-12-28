package theSimplestClassesAndObjects.tenAnswer;

public class Main {
    public static void main(String[] args) {

        Airline airline1 = new Airline("London",654,"Boeing","15:45",3);
        Airline airline2 = new Airline("New York",154,"Airbus","17:45",4);
        Airline airline3 = new Airline("Istambul",64,"Boeing","18:30",5);
        Airline airline4 = new Airline("Moskou",954,"Airbus","17:10",6);
        Airline airline5 = new Airline("Minsk",544,"Boeing","9:45",7);
        Airline airline6 = new Airline("Milan",344,"Airbus","10:45",1);
        Airline airline7 = new Airline("Paris",653,"Boeing","11:45",2);
        Airline airline8 = new Airline("Minsk",982,"Boeing","12:45",3);
        Airline airline9 = new Airline("London",123,"Airbus","13:45",4);
        Airline airline10 = new Airline("New York",231,"Airbus","14:45",5);
        Airline airline11 = new Airline("London",321,"Boeing","19:45",6);


        Airline[] airlines = {airline1,airline2,airline3,airline4,airline5,airline6,airline7,airline8,airline9,airline10,airline11};

        ServiceForAirline serviceForAirline = new ServiceForAirline(airlines);
        serviceForAirline.flyList("London");

        System.out.println();
        serviceForAirline.flyDayOfTheWeek(3);

        System.out.println();
        serviceForAirline.flyDayOfTheWeekAndTime(3,"12:45");
    }
}
