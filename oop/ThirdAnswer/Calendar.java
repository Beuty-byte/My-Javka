package oop.ThirdAnswer;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

    private List<WeekendsAndHolidays> weekendsAndHolidays;

    private class WeekendsAndHolidays{
        private String weekendDay;

        public WeekendsAndHolidays(String weekendDay) {
            this.weekendDay = weekendDay;
        }

        public String getWeekendDay() {
            return weekendDay;
        }

        public void setWeekendDay(String weekendDay) {
            this.weekendDay = weekendDay;
        }
    }

    public Calendar() {
        this.weekendsAndHolidays = new ArrayList<>();
    }

    public void showWeekendsAndHolidays(){
        for (int i = 0; i < weekendsAndHolidays.size(); i++) {
            System.out.println(weekendsAndHolidays.get(i).getWeekendDay());
        }
    }

    public List<WeekendsAndHolidays> getWeekendsAndHolidays() {
        return weekendsAndHolidays;
    }

    public void addDate(String date){
        weekendsAndHolidays.add(new WeekendsAndHolidays(date));
    }



}
