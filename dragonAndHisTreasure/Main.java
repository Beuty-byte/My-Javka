package dragonAndHisTreasure;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        List<String> treasureList = ListTreasures.returnAllTreasure();
        List<DragonTreasure> dragonTreasures = new ArrayList<>();
        for (String element:treasureList) {
            String[] costAndTreasureNameArray = ServiceClass.costAndTreasureName(element);
            dragonTreasures.add(new DragonTreasure(costAndTreasureNameArray[0],Integer.parseInt(costAndTreasureNameArray[1])));
        }

        System.out.println("Вы можете посмотреть все сокровища в пещере дракона:");
        System.out.println("Введите SHOW что бы увидеть их всех");
        System.out.println("Введите MOST DEAREST что бы показать самое догое сокровище");
        System.out.println("Введите CHOICE FOR THE AMOUNT и сумму чтобы посмотреть доступные сокровища");
        System.out.println("Введите END что бы выйти из программы");


        Scanner scanner = new Scanner(System.in);
        String inputString;

        while (true){
            inputString = scanner.nextLine();

            if(inputString.matches("SHOW")){
                ServiceClass.showDragonTreasures(dragonTreasures);
            }

            if(inputString.matches("MOST DEAREST")){
                ServiceClass.choiceDearestTreasure(dragonTreasures);
            }

            if (inputString.matches("CHOICE FOR THE AMOUNT (\\s{0,})[0-9]+")){
                String newInputStrung = inputString.replaceAll("[^[0-9]+]","");
                ServiceClass.choiceForTheAmount(dragonTreasures,Integer.parseInt(newInputStrung));
            }

            if(inputString.matches("END")){
                break;
            }
        }
    }
}
