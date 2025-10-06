package Soup3;

public class Potatoe extends Vegetable implements Quantifiable{
    private int yeux;
    private final double quantiteAjoutee = 0.01;
    public static final double coeffCalorifique = 800;
    public static final double caloriesARetire = 5;

    Potatoe(double poids, int yeux){
        super(poids);
        this.yeux = yeux;
    }

    Potatoe(double poids){
        super(poids);
        this.yeux = (int)(this.poids*10);
    }

    @Override
    public String toString(){
        return "Patate: ["+getCalories()+"calories - "+poids+" kg - "+yeux+ " yeux]";
    }

    @Override
    public double getPeelingWeight(){
        return poids*pourcentageStandard + yeux*quantiteAjoutee;
    }

    @Override
    public double getPeelingWeight(double pourcentage){
        return poids*pourcentage + yeux*quantiteAjoutee;
    }

    public int getCalories(){
        return (int)((poids - getPeelingWeight())*coeffCalorifique -yeux*caloriesARetire);
    }
}
