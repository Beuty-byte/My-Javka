package AggregationAndComposition.fourAnswer;

import theSimplestClassesAndObjects.eightAnswer.Customers;

import java.util.Arrays;
import java.util.Objects;

public class Customer {
    private String name;
    private BankAccount[] bankAccounts;

    public Customer(String name, BankAccount[] bankAccounts) {
        this.name = name;
        this.bankAccounts = bankAccounts;
    }

    public void blockAccount(String id){
        for (int i = 0; i < bankAccounts.length; i++) {
            if(id.equals(bankAccounts[i].getId())){
                bankAccounts[i].setBlocked(true);
                System.out.println("Account "+id+" is blocked");
            }
        }
    }

    public void unBlockAccount(String id){
        for (int i = 0; i < bankAccounts.length; i++) {
            if(id.equals(bankAccounts[i].getId())){
                bankAccounts[i].setBlocked(false);
                System.out.println("Account "+id+" is unblocked");
            }
        }
    }

    public void showCustomerAccount(){
        System.out.println();
        System.out.println("Account master "+name);
        for (int i = 0; i < bankAccounts.length; i++) {
            System.out.println("Account id = "+bankAccounts[i].getId()+" sum on account = "+bankAccounts[i].getMoney()+"$");
        }
    }


    public void sortAccount(){
        boolean isSorted = false;
        BankAccount buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < bankAccounts.length-1; i++) {
                if(bankAccounts[i].getMoney() > bankAccounts[i+1].getMoney()){
                    isSorted = false;

                    buf = bankAccounts[i];
                    bankAccounts[i] = bankAccounts[i+1];;
                    bankAccounts[i+1] = buf;


                }
            }
        }
    }

    public void amountMoneyOnTheAccount(){
        double amountMoney = 0;
        for (int i = 0; i < bankAccounts.length; i++) {

            amountMoney+=bankAccounts[i].getMoney();

        }
        System.out.println();
        System.out.println(amountMoney+"$");
    }


    public void amountPositiveMoneyAccount(){
        double amountMoney = 0;
        for (int i = 0; i < bankAccounts.length; i++) {
            if(bankAccounts[i].getMoney() > 0){
                amountMoney+=bankAccounts[i].getMoney();
            }
        }
        System.out.println();
        System.out.println(amountMoney+"$");

    }

    public void amountNegativeMoneyAccount(){
        double amountMoney = 0;
        for (int i = 0; i < bankAccounts.length; i++) {
            if(bankAccounts[i].getMoney() < 0){
                amountMoney+=bankAccounts[i].getMoney();
            }
        }
        System.out.println();
        System.out.println(amountMoney+"$");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }


}
