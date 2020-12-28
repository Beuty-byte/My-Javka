package AggregationAndComposition.fiveAnswer;

import java.util.ArrayList;

public class ServiceClass {

    public static ArrayList<ListTouristPackages> choiceTransport(String str,ArrayList<ListTouristPackages> list){
        list.removeIf(el -> !el.getTransport().equals(str));
        return list;
    }

    public static ArrayList<ListTouristPackages> choiceFood(String str,ArrayList<ListTouristPackages> list){
        list.removeIf(el -> !el.getFood().equals(str));
        return list;
    }

    public static ArrayList<ListTouristPackages> choiceAmountDay(int wishesDay,ArrayList<ListTouristPackages> list){
        list.removeIf(el -> !(el.getAmountDay() == wishesDay));
        return list;
    }

    public static ArrayList<ListTouristPackages> sortToTransport(ArrayList<ListTouristPackages> list){
        boolean isSorted = false;
        ListTouristPackages buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < list.size()-1; i++) {
                if(0 < list.get(i).getTransport().compareTo(list.get(i+1).getTransport())){
                    isSorted = false;

                    buf = list.get(i);
                    list.set(i,list.get(i+1));
                    list.set(i+1,buf);
                }
            }
        }
        return list;
    }

    public static ArrayList<ListTouristPackages> sortToAmountDay(ArrayList<ListTouristPackages> list){
        boolean isSorted = false;
        ListTouristPackages buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < list.size()-1; i++) {
                if(list.get(i).getAmountDay() > (list.get(i+1).getAmountDay())){
                    isSorted = false;

                    buf = list.get(i);
                    list.set(i,list.get(i+1));
                    list.set(i+1,buf);
                }
            }
        }
        return list;
    }

    public static ArrayList<ListTouristPackages> sortToFood(ArrayList<ListTouristPackages> list){
        boolean isSorted = false;
        ListTouristPackages buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < list.size()-1; i++) {
                if(0 < list.get(i).getFood().compareTo(list.get(i+1).getFood())){
                    isSorted = false;

                    buf = list.get(i);
                    list.set(i,list.get(i+1));
                    list.set(i+1,buf);
                }
            }
        }
        return list;
    }


    public static String firstUpperCase(String word){
        if(word == null || word.isEmpty()) return ""; //или return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
