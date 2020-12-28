package AggregationAndComposition.secondAnswer;

public class Main {
    public static void main(String[] args) {


        Engine engine1 = new Engine("first engine");
        Engine engine2 = new Engine("second engine");

        Wheel wheel1 = new Wheel("first wheel");
        Wheel wheel2 = new Wheel("second wheel");
        Wheel wheel3 = new Wheel("third wheel");
        Wheel wheel4 = new Wheel("fourth wheel");

        Wheel[] wheels = Car.checkAmountWheels(wheel1,wheel2,wheel3,wheel4);


        Car car1 = new Car(engine1,wheels,"Audi");
        Car car2 = new Car(engine2,wheels,"BMW");

        car1.ride();
        car1.setFuel(38);
        car2.setFuel(42);
        System.out.println(car1.getFuel());
        System.out.println(car2.getFuel());
        //Предпологается что объем бака не более 40 литров

        Wheel newWheel = new Wheel("SUPER WHEEL");

        car1.changeWheel(newWheel,3);
       // car2.changeWheel("big wheel",5);

        System.out.println("Model car 1 = "+car1.getCarModel());
        System.out.println("Model car 2 = "+car2.getCarModel());


    }
}
