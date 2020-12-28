package oop.seconsAnswer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        System.out.println("Введите общее количество покупок.....");
        Scanner sc = new Scanner(System.in);
        int amountPurchases;
        do{
            while (!sc.hasNextInt()){
                sc.next();
            }
            amountPurchases = sc.nextInt();
        }while(amountPurchases < 1);


        ArrayList<Payment> paymentList = new ArrayList<>();
        for (int i = 0; i < amountPurchases; i++) {
            Payment pay = new Payment("Покупка №"+i+1);
            pay.setPayment();
            paymentList.add(pay);
        }

        for (int i = 0; i < paymentList.size(); i++) {
            System.out.println();
            paymentList.get(i).printCheque();
        }

    }
}
