package flowersComposition;

public class Carnation implements Flower{
    private String name;

    public Carnation(String name) {
        this.name = name;
    }

    @Override
    public void showFlower() {
        System.out.println(name);
    }
}
