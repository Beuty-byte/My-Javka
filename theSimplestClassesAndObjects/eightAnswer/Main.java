package theSimplestClassesAndObjects.eightAnswer;

public class Main {
    public static void main(String[] args) {

        Customers customer1 = new Customers(1,"Enoev","Sergey","Victorovich","Minsk house 32 appartment 5","4351 3123 1234 4321","541 21312 432421");
        Customers customer2 = new Customers(2,"Kotvovets","Elena","Yurievna","Mogilev house 2 appartment 15","6532 3432 1234 4321","513 21312 432421");
        Customers customer3 = new Customers(3,"Brezhnev","Vasia","Alekseevich","Grodno house 312 appartment 54","4353 9843 1234 4321","113 21312 432421");
        Customers customer4 = new Customers(4,"Pupkin","Vovka","Victorovich","Moskou house 3 appartment 19","8732 6523 1234 4321","653 21312 432421");
        Customers customer5 = new Customers(5,"Levch","Igor","Gnilouvich","Minsk house 1 appartment 555","6523 3246 1234 4321","756 21312 432421");
        Customers customer6 = new Customers(6,"Zverev","Sergey","Anatolyevich","Vitebsk house 132 appartment 11","6512 4312 1234 4321","653 21312 432421");
        Customers customer7 = new Customers(7,"Antonov","Anton","Anatoleevish","Vitebsk house 321 appartment 15","4312 6423 1234 4321","742 21312 432421");
        Customers customer8 = new Customers(8,"Sonokosov","Sasha","Leonidovich","Grodno house 9 appartment 9","3136 5433 1234 4321","752 21312 432421");
        Customers customer9 = new Customers(9,"Efremov","Nikolay","Victorovich","Minsk house 64 appartment 13","3412 4564 1234 4321","652 21312 432421");
        Customers customer10 = new Customers(10,"Prudkin","Pavel","Joinovich","Minsk house 12 appartment 45","7643 7421 1234 4321","652 21312 432421");


        Customers[] customers = {customer1,customer2,customer3,customer4,customer5,customer6,customer7,
                customer8,customer9,customer10,};

        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i].toString());
        }

        ServiceForCustomers serviceForCustomers = new ServiceForCustomers(customers);
        serviceForCustomers.sortCustomersName();

        System.out.println();
        System.out.println();
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i].toString());
        }

        System.out.println();
        System.out.println();
        serviceForCustomers.findAPersonByCardNumber("6666 6666 6666 6666","9999 9999 9999 9999");
    }
}
