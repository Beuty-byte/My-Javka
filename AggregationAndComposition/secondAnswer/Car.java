package AggregationAndComposition.secondAnswer;

public class Car {
    private Engine engine;
    private Wheel[] wheels;
    private String carModel;
    private int fuel = 0;

    public Car(Engine engine, Wheel[] wheel,String carModel) {
        this.engine = engine;
        this.wheels = wheel;
        this.carModel = carModel;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setFuel(int fuel) {
        this.fuel = checkGasolineVolume(fuel);
    }

    public int getFuel() {
        return fuel;
    }

    private int checkGasolineVolume(int fuel){
        if(fuel > 40){
            return 40;
        }
        return fuel;
    }

    public void ride(){
        for (int i = 0; i < wheels.length; i++) {
            wheels[i].setWheel(wheels[i].getWheel()+" round");
            System.out.println(wheels[i].getWheel());
        }
    }

    public void changeWheel(Wheel wheel, int numberWheel){
        if (!(numberWheel > 4)){
            wheels[numberWheel] = wheel;
            System.out.println("wheel number "+ numberWheel +" replace on "+wheels[numberWheel].getWheel());
        }else {
            System.out.println("the car has 4 wheels");
        }
    }

    public static Wheel[] checkAmountWheels(Wheel... wheels){
        if(wheels.length > 4){
            return null;
        }return wheels;
    }


}
