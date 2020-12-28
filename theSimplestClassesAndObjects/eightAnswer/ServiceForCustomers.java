package theSimplestClassesAndObjects.eightAnswer;

public class ServiceForCustomers {
    private Customers[] customers;

    public ServiceForCustomers(Customers[] customers) {
        this.customers = customers;
    }

    public void sortCustomersName(){
        boolean isSorted = false;
        Customers buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < customers.length-1; i++) {
                if(0 < customers[i].getFirstName().compareTo(customers[i+1].getFirstName())){
                    isSorted = false;

                    buf = customers[i];
                    customers[i] = customers[i+1];
                    customers[i+1] = buf;


                }
            }
        }
    }


    public void findAPersonByCardNumber(String lowValue,String maxValue){
        for (int i = 0; i < customers.length; i++) {
            if(0 <= customers[i].getCreditCardNumber().compareTo(lowValue) && 0 >= customers[i].getCreditCardNumber().compareTo(maxValue)){
                System.out.println(customers[i].toString());
            }
        }
    }
}
