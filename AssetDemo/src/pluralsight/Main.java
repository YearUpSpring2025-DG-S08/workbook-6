package pluralsight;

public class Main {
    public static void main(String[] args) {


        Portfolio p = new Portfolio("Damian's Portfolio", "Damian");

        CreditCard newCredit = new CreditCard();
        newCredit.charge(2000);

        p.add(new Gold(5));
        p.add(new Jewelry("Wedding Ring", 15));
        p.add(new House(1969, 2700, 4));
        p.add(newCredit);

        System.out.println("The total value of the portfolio is " + p.getValue());
    }
}