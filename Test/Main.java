package Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static  void main(String[] args) {

        TreeSet<Cat> set = new TreeSet<>(){{

        }};
        set.add(new Cat("barsik",5));
        set.add(new Cat("barsik",6));
        set.add(new Cat("barsik",7));
        set.add(new Cat("barsik",9));

        for (Cat el: set){
            el.dre();
        }

        Dag cat = () -> {

            return null;
        };

        cat.foo();

        Dog d = new Dog();
        Dog.foo();

        // clouseble ans




// оно будет пробрасываться пока не встретит блок catch
    // с верхнего метода в нижний
        // можно прочитать про стек

// Check исключения нужно в любом слубом случаи
        //читать try с ресурсами
    }

    static class Dog{
        String name = "d";
        public static void foo(){

            class Test{
                String name = "name";

                void getName(){
                    System.out.println(name);
                }
            }
            Test t1 = new Test();
            t1.getName();
        }
    }
}
