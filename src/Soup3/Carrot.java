package Soup3;

public class Carrot extends Vegetable implements Quantifiable{
    private double longueur;
    private final static double coeffCalorifique = 400;

    public Carrot(double poids, double longueur){
        super(poids);
        this.longueur = longueur;
    }

    @Override
    public String toString(){
        return "Carotte: ["+getCalories()+"calories - "+poids+" kg - "+longueur+ " cm]";
    }

    public int getCalories(){

        return (int)((poids - getPeelingWeight())*coeffCalorifique);
    }
}
