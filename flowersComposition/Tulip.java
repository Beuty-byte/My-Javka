package flowersComposition;

public class Tulip implements Flower{
    private String name;

    public Tulip(String name) {
        this.name = name;
    }

    @Override
    public void showFlower() {
        System.out.println(name);
    }
}
