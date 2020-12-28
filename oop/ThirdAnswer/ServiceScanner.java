package oop.ThirdAnswer;

import java.util.Scanner;

public class ServiceScanner {
    public static String InputDate(){
        String inputDate;
        do {
            System.out.println("Пожалуйста введите даты выходных или праздничных дней");
            System.out.println("Для примера DD-MM-YYYY или DD-MM-YY, а если хотите закончить ввод напите END");
            Scanner scanner = new Scanner(System.in);
            inputDate = scanner.nextLine();
        }while (ValidateInputDate.validateDate(inputDate));
        return inputDate;
    }


}
