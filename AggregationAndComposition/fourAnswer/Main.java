package AggregationAndComposition.fourAnswer;

public class Main {
    public static void main(String[] args) {

        BankAccount firstAccount = new BankAccount(76.12,"thy87iKLmb5");
        BankAccount secondAccount = new BankAccount("dqertf");
        BankAccount thirdAccount = new BankAccount(8123.12,"g522sasg");
        BankAccount[] accounts = {firstAccount,secondAccount,thirdAccount};

        Customer customer = new Customer("Petya",accounts);

        customer.blockAccount("thy87iKLmb5");

        for (int i = 0; i < customer.getBankAccounts().length; i++) {
            System.out.println(customer.getBankAccounts()[i].getMoney()+"$");
        }

        customer.unBlockAccount("thy87iKLmb5");

        for (int i = 0; i < customer.getBankAccounts().length; i++) {
            System.out.println(customer.getBankAccounts()[i].getMoney()+"$");
        }

        customer.showCustomerAccount();
        customer.sortAccount();

        for (int i = 0; i < customer.getBankAccounts().length; i++) {
            System.out.println(customer.getBankAccounts()[i].getMoney()+"$");
        }

        customer.amountMoneyOnTheAccount();
        customer.amountPositiveMoneyAccount();
        customer.amountNegativeMoneyAccount();


    }

}
