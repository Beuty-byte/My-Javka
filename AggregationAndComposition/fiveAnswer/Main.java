package AggregationAndComposition.fiveAnswer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ArrayList<ListTouristPackages> touristList = FullListPackages.getList();

        System.out.println("Hello this is full list Tourist Packages");

        Set<String> transportSet = new HashSet<>();
        Set<String> foodSet = new HashSet<>();
        Set<Integer> amountDaySet = new HashSet<>();
        String transportString = "";
        String foodString = "";
        String amountDaysString = "";

        System.out.println(transportSet);

        for (ListTouristPackages el : touristList){
            System.out.println(el.getNameListPackages()+" "+el.getTransport()+" "+el.getFood()+" "+el.getAmountDay());
            transportSet.add(el.getTransport());
            foodSet.add(el.getFood());
            amountDaySet.add(el.getAmountDay());
        }

        for (String el: transportSet){
            transportString+= el.toUpperCase()+", ";
        }

        for (String el: foodSet){
            foodString+= el.toUpperCase()+", ";
        }

        for (Integer el: amountDaySet){
            amountDaysString+= ", "+el.toString();
        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("You can sort this list, enter type sort");
        System.out.println("Enter " +transportString+"if you want sort to Transport");
        System.out.println("Enter "+foodString+"if you want sort to type food");
        System.out.println("Enter amount day \" for example 5\" if you want sort to Transport");
        System.out.println("available days" + amountDaysString);
        System.out.println("Enter END if you finish sorting");
        System.out.println("-------------------------------------------------------------------------------");




        Scanner sc = new Scanner(System.in);
        String inputString;

        while(true) {
            inputString = sc.nextLine();

            if (inputString.trim().matches("(BUS)|(TRAIN)|(PLANE)|(STEAMER)|(CAR)")) {
                inputString = ServiceClass.firstUpperCase(inputString.toLowerCase());
                touristList = ServiceClass.choiceTransport(inputString, touristList);
                for (ListTouristPackages el : touristList) {
                    System.out.println(el.getNameListPackages() + " " + el.getTransport() + " " + el.getFood() + " " + el.getAmountDay());
                }
            }

            if (inputString.trim().matches("(ALL INCLUSIVE)|(ONLY BREAKFAST)|([ONLY RESTAURANT])")) {
                inputString = inputString.toLowerCase();
                touristList = ServiceClass.choiceFood(inputString, touristList);
                for (ListTouristPackages el : touristList) {
                    System.out.println(el.getNameListPackages() + " " + el.getTransport() + " " + el.getFood() + " " + el.getAmountDay());
                }
            }

            if (inputString.trim().matches("[0-9]+")) {
                int amountDay = Integer.parseInt(inputString);
                touristList = ServiceClass.choiceAmountDay(amountDay, touristList);
                for (ListTouristPackages el : touristList) {
                    System.out.println(el.getNameListPackages() + " " + el.getTransport() + " " + el.getFood() + " " + el.getAmountDay());
                }
            }

            if (inputString.trim().matches("SORT FOOD")) {
                touristList = ServiceClass.sortToFood(touristList);
                for (ListTouristPackages el : touristList) {
                    System.out.println(el.getNameListPackages() + " " + el.getTransport() + " " + el.getFood() + " " + el.getAmountDay());
                }
            }

            if (inputString.trim().matches("SORT AMOUNTDAYS")) {
                touristList = ServiceClass.sortToAmountDay(touristList);
                for (ListTouristPackages el : touristList) {
                    System.out.println(el.getNameListPackages() + " " + el.getTransport() + " " + el.getFood() + " " + el.getAmountDay());
                }
            }

            if (inputString.trim().matches("SORT TRANSPORT")) {
                touristList = ServiceClass.sortToTransport(touristList);
                for (ListTouristPackages el : touristList) {
                    System.out.println(el.getNameListPackages() + " " + el.getTransport() + " " + el.getFood() + " " + el.getAmountDay());
                }
            }

            if (inputString.trim().matches("END")) {
                break;
            }
        }




    }
}
