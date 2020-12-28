package Test;

public class Cat extends Animal implements Comparable<Cat>{

    private String name;
    private int id;

    public Cat(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Cat o) {
        int result = id - o.id;
        int value = 0;
        if(result > 0){
            value = 1;
        }else if(result < 0){
            value = -1;
        }
        return value;
    }
}
