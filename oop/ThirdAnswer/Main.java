package oop.ThirdAnswer;

public class Main {
    public static void main(String[] args) {
        Calendar holydays = new Calendar();

        while (true) {
            String date = ServiceScanner.InputDate();
            holydays.addDate(date);
            if(date.equals("END")){
                break;
            }
        }


        holydays.showWeekendsAndHolidays();
        
    }
}
