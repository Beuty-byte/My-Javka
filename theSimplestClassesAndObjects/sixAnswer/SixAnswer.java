package theSimplestClassesAndObjects.sixAnswer;

public class SixAnswer {
    public static void main(String[] args) {

        Time time = new Time(11,11,11);
        System.out.println(time.getHour()+" "+time.getMinute()+" "+time.getSecond());
        Time time1 = new Time(132,12,-123);
        System.out.println(time1.getHour()+" "+time1.getMinute()+" "+time1.getSecond());

        time.changeTime(14,45,99);
        System.out.println(time.getHour()+" "+time.getMinute()+" "+time.getSecond());
    }
}
