package pluralsight;

public class CreditCard implements Valuable {
    private double balance;

    public void pay(double amount){
        balance += amount;
    }

    public void charge(double amount){
        balance -= amount;
    }

    @Override
    public double getValue() {
        return balance;
    }
}
