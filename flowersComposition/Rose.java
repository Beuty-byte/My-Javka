package flowersComposition;

public class Rose implements Flower{
    private String name;

    public Rose(String name) {
        this.name = name;
    }



    @Override
    public void showFlower() {
        System.out.println(name);
    }
}
