package Collection;

import java.util.TreeSet;

public class ComparableMain {
    public static void main(String[] args) {
        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(new Person(11,"Boris"));
        personTreeSet.add(new Person(1,"Boriska"));
        personTreeSet.add(new Person(111,"Vanya"));
        System.out.println(personTreeSet);
        for(Person el:personTreeSet){
            System.out.println(el.getId()+ " " +el.getName());
        }
    }
}
