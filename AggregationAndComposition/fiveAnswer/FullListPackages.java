package AggregationAndComposition.fiveAnswer;

import java.util.ArrayList;

public class FullListPackages {
    public static ArrayList<ListTouristPackages> getList(){

        ListTouristPackages  recreation1 = new ListTouristPackages("Recreation","Bus","all inclusive",7);
        ListTouristPackages  recreation2 = new ListTouristPackages("Recreation","Train","only breakfast",9);
        ListTouristPackages  recreation3 = new ListTouristPackages("Recreation","Plane","only restaurant",13);
        ListTouristPackages  recreation4 = new ListTouristPackages("Recreation","Steamer","all inclusive",21);
        ListTouristPackages  recreation5 = new ListTouristPackages("Recreation","Bus","all inclusive",5);
        ListTouristPackages  excursions1 = new ListTouristPackages("Excursions","Train","all inclusive",12);
        ListTouristPackages  excursions2 = new ListTouristPackages("Excursions","Bus","all inclusive",15);
        ListTouristPackages  excursions3 = new ListTouristPackages("Excursions","Plane","only breakfast",5);
        ListTouristPackages  excursions4 = new ListTouristPackages("Excursions","Bus","all inclusive",3);
        ListTouristPackages  excursions5 = new ListTouristPackages("Excursions","Train","all inclusive",6);
        ListTouristPackages  treatment1 = new ListTouristPackages("Treatment","Bus","only restaurant",19);
        ListTouristPackages  treatment2 = new ListTouristPackages("Treatment","Train","all inclusive",11);
        ListTouristPackages  treatment3 = new ListTouristPackages("Treatment","Plane","all inclusive",7);
        ListTouristPackages  treatment4 = new ListTouristPackages("Treatment","Steamer","only restaurant",6);
        ListTouristPackages  treatment5 = new ListTouristPackages("Treatment","Plane","only restaurant",5);
        ListTouristPackages  shopping1 = new ListTouristPackages("Shopping","Car","only breakfast",3);
        ListTouristPackages  shopping2 = new ListTouristPackages("Shopping","Bus","only breakfast",2);
        ListTouristPackages  shopping3 = new ListTouristPackages("Shopping","Train","only breakfast",4);
        ListTouristPackages  shopping4 = new ListTouristPackages("Shopping","Train","only breakfast",7);
        ListTouristPackages  shopping5 = new ListTouristPackages("Shopping","Car","only breakfast",2);
        ListTouristPackages  cruise1 = new ListTouristPackages("Cruise","Steamer","all inclusive",19);
        ListTouristPackages  cruise2 = new ListTouristPackages("Cruise","Steamer","all inclusive",19);
        ListTouristPackages  cruise3 = new ListTouristPackages("Cruise","Bus","all inclusive",13);
        ListTouristPackages  cruise4 = new ListTouristPackages("Cruise","Train","all inclusive",14);
        ListTouristPackages  cruise5 = new ListTouristPackages("Cruise","Steamer","all inclusive",17);

        ArrayList<ListTouristPackages> touristList = new ArrayList<>();
        touristList.add(recreation1);
        touristList.add(recreation2);
        touristList.add(recreation3);
        touristList.add(recreation4);
        touristList.add(recreation5);
        touristList.add(excursions1);
        touristList.add(excursions2);
        touristList.add(excursions3);
        touristList.add(excursions4);
        touristList.add(excursions5);
        touristList.add(treatment1);
        touristList.add(treatment2);
        touristList.add(treatment3);
        touristList.add(treatment4);
        touristList.add(treatment5);
        touristList.add(shopping1);
        touristList.add(shopping2);
        touristList.add(shopping3);
        touristList.add(shopping4);
        touristList.add(shopping5);
        touristList.add(cruise1);
        touristList.add(cruise2);
        touristList.add(cruise3);
        touristList.add(cruise4);
        touristList.add(cruise5);


        return touristList;

    }
}
