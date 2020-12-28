package Collection;

import java.util.*;

public class ComparatorMain {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(11,"Andrei"));
        list.add(new Person(12,"Boris"));
        list.add(new Person(13,"Cesar"));
        list.add(new Person(15,"Cesar"));
        list.add(new Person(14,"Danya"));
        list.add(new Person(15,"Danya"));
        list.add(new Person(15,"Viktor"));
        list.add(new Person(15,"Aiktor"));

        //list.sort((o1, o2) -> -o1.getName().compareTo(o2.getName()));
        list.sort(Comparator.comparing(Person::getName).thenComparing(Person::getId).reversed());

        //list.forEach(person -> System.out.println(person.getId() + " " + person.getName()));
        //list.sort(new PersonNameComparator());
//        Collections.sort(list,new Person.NameComparator());
        list.forEach(person -> System.out.println(person.getId() + " " + person.getName()));
    }
}
