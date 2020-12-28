package theSimplestClassesAndObjects.tenAnswer;

public class ServiceForAirline {
    private Airline[] airlines;

    public ServiceForAirline(Airline[] airlines) {
        this.airlines = airlines;
    }

    public void flyList(String destination){
        for (int i = 0; i < airlines.length; i++) {
            if(airlines[i].getDestination().equals(destination)){
                System.out.println(airlines[i].toString());
            }
        }
    }

    public void flyDayOfTheWeek(int dayWeek){
        for (int i = 0; i < airlines.length; i++) {
            if(airlines[i].getDayOfTheWeek() == dayWeek){
                System.out.println(airlines[i].toString());
            }
        }
    }

    public void flyDayOfTheWeekAndTime(int dayWeek,String time){
        for (int i = 0; i < airlines.length; i++) {
            if(airlines[i].getDayOfTheWeek() == dayWeek && 0 <airlines[i].getDepartureTime().compareTo(time)){
                System.out.println(airlines[i].toString());
            }
        }
    }
}
