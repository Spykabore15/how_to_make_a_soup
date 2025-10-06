package Soup1;

public class Potatoe {
    private double poids;
    private int yeux;
    private final double ratio = 10;

    public Potatoe(double poids, int yeux){
        this.poids = poids;
        this.yeux = yeux;
    }

    public Potatoe(double poids){
        this.poids=poids;
        this.yeux = (int)(this.poids*ratio);
    }

    @Override
    public String toString(){
        return "Patate: ["+poids+" kg - "+yeux+ " yeux]";
    }
}
