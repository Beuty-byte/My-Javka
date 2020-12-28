package theSimplestClassesAndObjects.fiveAnswer;

import java.util.Random;

public class Counter {
    private double counter;
    private double minValue;
    private double maxValue;

    public Counter(int a, int b){
        this.minValue = a;
        this.maxValue = b;
        this.counter = a + (Math.random() * b);
    }

    public double getCounter() {
        return counter;
    }

    public void setCounter(double counter) {
        this.counter = counter;
    }

    public void increaseCounter(){
        if(counter < maxValue) {
            counter++;
        }else {
            counter = maxValue;
        }
    }

    public void decreaseCounter(){
        if(counter > minValue) {
            counter--;
        }else {
            counter = minValue;
        }
    }
}
