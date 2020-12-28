package Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();
        map.put("OneKey",1);
        map.put("OneKeys",1);
        map.put("TwoKey",2);
        map.put("TreeKey",3);
        map.put("FourKey",4);
        map.put("FiveKey",5);
        map.put("SixKey",6);
        System.out.println(map);
        int value = map.put("FiveKey",55);
        System.out.println(value);
        System.out.println(map);

        Set<String> setForMap = map.keySet();
        System.out.println(setForMap);

        Collection<Integer> collection = map.values();
        System.out.println(collection);






        HashSet<String> words = new HashSet<>();
        words.add("2Y4");
        words.add("2Y5");
        words.add("3Y5");
        words.add("3d5");
        words.add("3d5");
        words.add("3r5");
        words.add("3r45");
        for (String el :words){
            System.out.println(el.hashCode()+" "+el);
        }

        TreeSet<String> treeSet = new TreeSet<>(words);
        for (String el :treeSet){
            System.out.println(el.hashCode()+" "+el);
        }


        Queue<String> prior = new PriorityQueue<>(Comparator.reverseOrder());
        prior.offer("A");
        prior.offer("D");
        prior.offer("Z");
        prior.offer("c");
        prior.offer("2");
        prior.forEach(System.out::println);

        // arrayDeque push --- pop

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.forEach(System.out::println);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(11);
        deque.offer(22);
        deque.offer(33);
        deque.forEach(System.out::println);

        // queue Add == Offer   remove == poll  element == peek
        Queue<String> queue = new LinkedList<>(){
            {
              this.add("Jeans");
              this.add(null);
            }
        };
        queue.add("T-Shirt");
        queue.add("Shorts");
        queue.clear();
        queue.poll();
        queue.forEach(System.out::println);

    }
}
