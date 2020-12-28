package theSimplestClassesAndObjects.sixAnswer;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = checkHour(hour);
        this.minute = checkMinute(minute);
        this.second = checkSecond(second);
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = checkHour(hour);
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = checkMinute(minute);
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = checkSecond(second);
    }

    private int checkHour(int hour){
        if(hour > 23 || hour < 0){
            return 0;
        }
        return hour;
    }

    private int checkMinute(int minute){
        if(minute > 59 || minute < 0){
            return 0;
        }
        return minute;
    }

    private int checkSecond(int second){
        if(second > 59 || second < 0){
            return 0;
        }
        return second;
    }

    public void changeTime(int hour,int minute,int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
}
