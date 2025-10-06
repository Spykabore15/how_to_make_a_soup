package Soup2;

public class Vegetable {
    protected double poids;
    protected final double pourcentageStandard = 0.1;
    protected static double pourcentageVariable;
    public Vegetable(double poids) {
        this.poids = poids;
    }

    public double getPeelingWeight(){
        return poids*pourcentageStandard;
    }

    public double getPeelingWeight(double pourcentage){
        return poids*pourcentage;
    }
}
