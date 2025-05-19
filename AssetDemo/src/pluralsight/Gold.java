package pluralsight;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(double weight) {
        super("Gold", 0);
        this.weight = weight;
    }

    public double getValue(){
        return weight * 33;
    }
}
