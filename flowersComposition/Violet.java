package flowersComposition;

public class Violet implements Flower{
    private String name;

    public Violet(String name) {
        this.name = name;
    }

    @Override
    public void showFlower() {
        System.out.println(name);
    }
}
