package lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Students student1 = new Students(36,"Abdul");
        Students student2 = new Students(14,"Valera");
        Students student3 = new Students(18,"Vasua");
        Students student4 = new Students(39,"Jendsa");
        Students student5 = new Students(46,"Katya");

        List<Students> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        long count = students.stream().filter(student -> student.getAge() < 30).
                map(Students::getName).
                filter(name -> name == null || name.length() >= 4).count();


        System.out.println(count);

        // Если 1н аргумент скобки можно опустить
        ISqrt sqrt = x -> Math.sqrt(x);
        ISqrt sqrt2 = Math::sqrt;

        ISum sum2 = (a,b) -> a * b;

        System.out.println(sqrt.sqrt(6));

        System.out.println(sum2.sum(6,3));
    }


    //        ISum sum = new ISum() {
//            @Override
//            public int sum(int a, int b) {
//                return a+b;
//            }
//        };

}
