package pluralsight;

import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.valuables = new ArrayList<>();
    }

    public void add(Valuable valuableThing){
        this.valuables.add(valuableThing);
    }

    public double getValue(){
        double total = 0;
        for(Valuable object : valuables){
            total += object.getValue();
        }
        return total;
    }
}
