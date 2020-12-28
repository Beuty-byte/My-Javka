package Collection;

import java.util.Comparator;

public class Person implements Comparable<Person>{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static class NameComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
//        int result = id - o.id;
//        int value = 0;
//        if(result > 0){
//           value = 1;
//        }else if(result < 0){
//         value = -1;
//        }
//        return value;
        return - name.compareTo(o.name);
    }
}
