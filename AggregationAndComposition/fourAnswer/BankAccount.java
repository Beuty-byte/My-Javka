package AggregationAndComposition.fourAnswer;

public class BankAccount {
    private double money = 0;
    private String id;
    private boolean blocked = false;

    public BankAccount(String id){
        this.id = id;
    }

    public BankAccount(double money, String id) {
        this.money = money;
        this.id = id;
    }

    public double getMoney() {
        if(blocked){
            return 0.0;
        }
        return money;
    }

    public void setMoney(double money) {
        if(blocked){
            System.out.println("ACCOUNT BLOCKED");
        }else {
            this.money = money;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
