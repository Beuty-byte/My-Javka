package flowersComposition;

import java.util.Scanner;

import static flowersComposition.ServiceClassForFlowersComposition.generateFlowers;
import static flowersComposition.ServiceClassForFlowersComposition.splitInputElement;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FlowersComposition flowersComposition = new FlowersComposition();

        System.out.println("Введите какие цветы вы хотите купить к примеру\"Rose 5\"");
        System.out.println("Доступные сейчас цветы Rose Tulip Violet Carnation");
        System.out.println("Если вы завершили выбор цветов введите END CHOSE FLOWERS");

        while (true) {
            String inputString = scanner.nextLine();

            if (inputString.matches("Rose [0-9]+|Tulip [0-9]+|Violet [0-9]+|Carnation [0-9]+")) {
                String[] el;
                el = splitInputElement(inputString);
                flowersComposition.addFlowers(generateFlowers(el[0], Integer.parseInt(el[1])));
            }

            if (inputString.matches("END CHOSE FLOWERS")) {
                break;
            }
        }

        System.out.println("Доступные цвета при выборе упаковки Rainbow Red White Black White Brown");
        while (true){
            String inputString = scanner.nextLine();
            if(inputString.matches("Rainbow|Red|White|Yellow|Black|Brown")){
                flowersComposition.setFlowerPackaging(new FlowerPackaging(inputString));
                break;
            }
        }

        System.out.println("Вы выбрали: ");
        for (Flower flower : flowersComposition.getFlowers()){
            flower.showFlower();
        }
        System.out.println("И решили упаковать в: "+flowersComposition.getFlowerPackaging().getColor());
    }
}
