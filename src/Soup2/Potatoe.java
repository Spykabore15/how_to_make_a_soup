package Soup2;

public class Potatoe extends Vegetable{
    private int yeux;
    private final double quantiteAjoutee = 0.01;

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
        return "Patate: ["+poids+" kg - "+yeux+ " yeux]";
    }

    @Override
    public double getPeelingWeight(){
        return poids*pourcentageStandard + yeux*quantiteAjoutee;
    }

    @Override
    public double getPeelingWeight(double pourcentage){
        return poids*pourcentage + yeux*quantiteAjoutee;
    }
}
