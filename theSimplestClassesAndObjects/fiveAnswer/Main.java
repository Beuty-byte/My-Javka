package theSimplestClassesAndObjects.fiveAnswer;

public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter(1,100_000);
        System.out.println(counter.getCounter());
        counter.decreaseCounter();
        counter.decreaseCounter();
        System.out.println(counter.getCounter());
        counter.increaseCounter();
        System.out.println(counter.getCounter());

        while (true){
            counter.decreaseCounter();
            System.out.println(counter.getCounter());
        }
    }
}
