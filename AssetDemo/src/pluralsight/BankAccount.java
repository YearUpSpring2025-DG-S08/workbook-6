package pluralsight;

public class BankAccount {
    private double balance;

    public void withdrawl(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public double getValue(){
        return balance;
    }
}
