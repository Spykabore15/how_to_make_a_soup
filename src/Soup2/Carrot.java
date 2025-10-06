package Soup2;

public class Carrot extends Vegetable {
    private double longueur;

    public Carrot(double poids, double longueur){
        super(poids);
        this.longueur = longueur;
    }

    @Override
    public String toString(){
        return "Carotte: ["+poids+" kg - "+longueur+ " cm]";
    }
}
