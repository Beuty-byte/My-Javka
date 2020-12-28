package oop.seconsAnswer;

import java.util.Scanner;

public class PaymentScanner {

    public static void alert(){
        System.out.println("Пожалуйста введите количество покупок");
    }

    public static int productArrayLength(){
        Scanner scanner = new Scanner(System.in);
        return readNumber(scanner);
    }

    public static int getCost(){
        System.out.println("Цена: ");
        Scanner sc = new Scanner(System.in);
        return readNumber(sc);
    }

    public static String enterProductName(int productIndex){
        Scanner sc = new Scanner(System.in);
        System.out.println("Товар" + (productIndex+1)+": ");
        System.out.println("Наименование: ");
        return sc.next();
    }

    private static int readNumber(Scanner scanner){
        while(!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Пожалуйста вводите число");
        }
        return scanner.nextInt();
    }
}
